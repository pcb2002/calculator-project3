import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계산기 입니다. (=을 입력하면 결과 출력)");
        double num = 0;
        char symbol = '+';

        Storage<Double> numStorage = new Storage<>(num);
        Storage<Character> symbolStorage = new Storage<>(symbol);
        int i = 1;
        int j = 1;

        while(true){
            try{
                System.out.print(i + "번째 숫자를 입력하세요: ");
                double n = sc.nextDouble();
                numStorage.setItem(n);
                char s;
                while(true){
                    System.out.print(j + "번째 기호를 입력하세요: ");
                    s = sc.next().charAt(0);
                    if (Character.isDigit(s)){
                        System.out.println("기호 자리에 숫자를 입력할 수 없습니다.");
                    }else break;
                }
                symbolStorage.setItem(s);

                i++;
                j++;

                if (s == '='){
                    break;
                }

            }catch (InputMismatchException e){
            System.out.print("올바른 타입을 입력해주세요.");
            sc.nextLine();
            }
        }

        Calculator cal = new Calculator();
        double res = cal.calculate(numStorage.getItem(0), numStorage.getItem(1), symbolStorage.getItem(0));
        for (int k = 1; k < i; k++){
            res = cal.calculate(res, numStorage.getItem(k+1), symbolStorage.getItem(i));
        }

        System.out.println("결과: " + res);
        //System.out.println(numStorage.getItems());
        //System.out.println(symbolStorage.getItems());

    }
}