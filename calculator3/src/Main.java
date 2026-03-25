import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Storage<Object> inputStorage = new Storage<>();
        Storage<Double> resultStorage = new Storage<>();
        InputTask inputTask = new InputTask(sc, inputStorage);
        Calculator cal = new Calculator(sc, inputTask, resultStorage);

        cal.run();

    }
}