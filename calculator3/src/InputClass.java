import java.util.InputMismatchException;
import java.util.Scanner;

public class InputClass {
    Scanner sc = new Scanner(System.in);
    Storage<Object> storage = new Storage<>();

    private int i = 1;
    private int j = 1;

    public int getIJ() {
        return i+j;
    }

    public void inputClass() {
        System.out.println("계산기 입니다. (=을 입력하면 결과 출력)");

        while(true) {
            try {
                System.out.print(i + "번째 숫자를 입력하세요: ");
                double n = sc.nextDouble();
                storage.setItem(n);
                char s;
                while(true) {
                    System.out.print(j + "번째 기호를 입력하세요: ");
                    s = sc.next().charAt(0);
                    if (Character.isDigit(s)) {
                        System.out.println("기호 자리에 숫자를 입력할 수 없습니다.");
                    }else break;
                }
                storage.setItem(s);

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
        return (double) storage.getItem(x);
    }

    public char getSymbol(int x) {
        return (char) storage.getItem(x);
    }

    public void getStorage() {
        for(Object st : storage.getItems()) {
            System.out.print(st + " ");
        }
    }
}
