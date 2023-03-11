package Task06;

import Task05.Command;

public interface Queue {

    void put(Command cmd);

    Command take();
}
