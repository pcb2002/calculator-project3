import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Storage<Object> inputStorage = new Storage<>();
        Storage<Double> resultStorage = new Storage<>();

        // 사용자로부터 값 입력받기
        InputTask inputTask = new InputTask(sc, inputStorage);

        // 입력받은 값(inputStorage)을 전달받아 계산 수행하기
        Calculator calculator = new Calculator(inputTask);

        // 계산 결과를 저장하고 재시작 여부 확인하기
        SaveCalculate saveCal = new SaveCalculate(sc, calculator, resultStorage);

        // 실행
        saveCal.saveAndProgress();

    }
}