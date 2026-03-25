import java.util.InputMismatchException;
import java.util.Scanner;

public class InputTask {
    // 속성
    private Scanner sc;
    private Storage<Object> inputStorage;

    // 생성자
    public InputTask(Scanner sc, Storage<Object> inputStorage) {
        this.sc = sc;
        this.inputStorage = inputStorage;
    }

    // 기능
    public void run() {
        int i = 1;
        int j = 1;

        System.out.println("계산기 입니다. (=을 입력하면 결과 출력)");

        while(true) {
            try {
                System.out.print(i + "번째 숫자를 입력하세요: ");
                double n = sc.nextDouble();
                inputStorage.saveItem(n);
                char s;
                while(true) {
                    System.out.print(j + "번째 기호를 입력하세요: ");
                    s = sc.next().charAt(0);
                    if (Character.isDigit(s)) {
                        System.out.println("기호 자리에 숫자를 입력할 수 없습니다.");
                    }else break;
                }
                inputStorage.saveItem(s);

                i++;
                j++;

                if (s == '=') {
                    break;
                }

            }catch (InputMismatchException e) {
                System.out.print("올바른 타입을 입력해주세요.");
                sc.nextLine();
            }
        }
    }

    public double getNumber(int x) {
        return (double) inputStorage.getItem(x);
    }

    public char getSymbol(int x) {
        return (char) inputStorage.getItem(x);
    }

    public int getInputStorageSize() {
        return inputStorage.getItems().size();
    }

    public void clearInputStorage(){
        inputStorage.clear();
    }

    public void printInputStorage() {
        for(Object st : inputStorage.getItems()) {
            System.out.print(st + " ");
        }
    }
}
