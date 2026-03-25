import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Storage<Object> storage = new Storage<>();
        Storage<Double> results = new Storage<>();
        InputTask input = new InputTask(sc, storage);
        Calculator cal = new Calculator(sc, input, storage, results);

        cal.run();

    }
}