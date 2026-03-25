import java.util.Scanner;

public class Calculator {
    // 속성
    private Scanner sc;
    private InputTask input;
    private Storage<Object> storage;
    private Storage<Double> results;

    // 생성자
    public Calculator(Scanner sc, InputTask input, Storage<Object> storage, Storage<Double> results) {
        this.sc = sc;
        this.input = input;
        this.storage = storage;
        this.results = results;
    }

    // 기능
    double calculateTask(double num1, double num2, char symbol){
        //계산
        return 0;
    }

    public void run() {
        while(true){
            input.task();
            // 배열 확인용 출력
            storage.getStorage();

            double totalRes = input.getNumber(0);

            for (int k = 1; k < storage.getItems().size(); k+=2){
                char symbol = input.getSymbol(k);
                if (symbol == '=') {
                    break;
                }
                double nextNum = input.getNumber(k + 1);
                totalRes = calculateTask(totalRes, nextNum, symbol);
            }
            // 결과 저장
            results.setItem(totalRes);
            System.out.println("결과: " + totalRes);
            // 저장 결과 출력
            results.getStorage();
            // 스토리지 지우기
            storage.clear();

            System.out.print("\n종료하시겠습니까? (eixt): ");
            String end = sc.next();
            if (end.equals("exit")){
                System.out.println("종료합니다.");
                break;
            }
        }

    }
}