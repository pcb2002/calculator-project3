import java.util.Scanner;

public class SaveCalculate {
    // 속성
    private Scanner sc;
    private Calculator calculator;
    private Storage<Double> resultStorage;

    // 생성자
    public SaveCalculate(Scanner sc, Calculator calculator, Storage<Double> resultStorage) {
        this.sc = sc;
        this.calculator = calculator;
        this.resultStorage = resultStorage;
    }

    // 기능
    public void saveAndProgress() {
        while(true){
            // 계산 결과 가져오기
            double totalRes = calculator.getResult();

            // 결과를 결과 스토리지에 저장
            resultStorage.saveItem(totalRes);

            // 결과 출력
            System.out.println("결과: " + totalRes);

            // 모든 저장 결과 출력
            resultStorage.printStorage();

            // 종료 여부
            System.out.print("\n종료하시겠습니까? (eixt): ");
            String end = sc.next();
            if (end.equals("exit")){
                System.out.println("종료합니다.");
                break;
            }
        }
    }
}