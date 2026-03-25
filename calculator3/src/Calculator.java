import java.util.Scanner;

public class Calculator {
    // 속성
    private Scanner sc;
    private InputTask inputTask;
    private Storage<Double> resultStorage;

    // 생성자
    public Calculator(Scanner sc, InputTask inputTask, Storage<Double> resultStorage) {
        this.sc = sc;
        this.inputTask = inputTask;
        this.resultStorage = resultStorage;
    }

    // 기능
    double calculateTask(double num1, double num2, char symbol){
        //계산
        return 0;
    }

    public void run() {
        while(true){
            inputTask.run();
            // 배열 확인용 출력
            inputTask.printInputStorage();

            double totalRes = inputTask.getNumber(0);

            for (int k = 1; k < inputTask.getInputStorageSize(); k+=2){
                char symbol = inputTask.getSymbol(k);
                if (symbol == '=') {
                    break;
                }
                double nextNum = inputTask.getNumber(k + 1);
                totalRes = calculateTask(totalRes, nextNum, symbol);
            }
            // 결과 저장
            resultStorage.saveItem(totalRes);
            System.out.println("결과: " + totalRes);
            // 저장 결과 출력
            resultStorage.getStorage();
            // 스토리지 지우기
            inputTask.clearInputStorage();

            System.out.print("\n종료하시겠습니까? (eixt): ");
            String end = sc.next();
            if (end.equals("exit")){
                System.out.println("종료합니다.");
                break;
            }
        }

    }
}