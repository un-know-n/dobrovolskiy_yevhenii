package Task06;

import Task05.Command;

import java.util.Vector;

public class CommandQueue implements Queue {
    private Vector<Command> tasks;

    private boolean waiting;

    private boolean shutdown;

    public CommandQueue() {
        tasks = new Vector<Command>();
        waiting = false;
        new Thread(new Worker()).start();
    }

    public void shutdown() {
        shutdown = true;
    }

    @Override
    public void put(Command r) {
        tasks.add(r);
        if (waiting) {
            synchronized (this) {
                notifyAll();
            }
        }
    }

    @Override
    public Command take() {
        if (tasks.isEmpty()) {
            synchronized (this) {


                waiting = true;
                try {
                    wait();
                } catch (InterruptedException ie) {
                    waiting = false;
                }
            }
        }
        return (Command) tasks.remove(0);
    }


    private class Worker implements Runnable {

        public void run() {
            while (!shutdown) {
                Command r = take();
                r.execute();

            }
        }
    }
}
