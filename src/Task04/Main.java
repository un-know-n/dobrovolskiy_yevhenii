package Task04;

import Task03.View;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main extends Task03.Main {
    public Main(View view) {
        super(view);
    }

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Main main;
        String width = "";
        System.out.print("Enter table width: ");

        try {
            width = in.readLine();
        } catch (Exception e) {
            System.out.print(e);
            System.exit(0);
        }

        try {
            main = new Main(new ViewTable(Integer.parseInt(width)));
        } catch (Exception e) {
            main = new Main(new ViewTable());
        }

        main.menu();
    }
}
