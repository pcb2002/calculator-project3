public class Calculator {
    // 속성
    private InputTask inputTask;

    // 생성자
    public Calculator(InputTask inputTask) {
        this.inputTask = inputTask;
    }

    // 기능
    // 사칙연산 계산
    double calculate(double num1, double num2, char symbol) {
        //계산
        return 0;
    }

    // 사칙연산 계산을 '=' 입력 전까지 반복
    public double getResult() {
        // 입력 시작
        inputTask.runInput();

        // 배열 확인용 출력
        inputTask.printInputStorage();

        // 연산 수행
        // double 타입으로 inputStorage 배열의 0번째 숫자 가져오기
        double totalRes = inputTask.getNumber(0);
        for (int k = 1; k < inputTask.getInputStorageSize(); k+=2){

            // char 타입으로 inputStorage 배열의 홀수 번째 연산자 가져오기
            char symbol = inputTask.getSymbol(k);

            // 연산자가 '='일 경우 종료
            if (symbol == '=') {
                break;
            }

            // double 타입으로 inputStorage 배열의 짝수 번째 숫자 가져오기
            double nextNum = inputTask.getNumber(k + 1);

            // 사칙연산 계산
            totalRes = calculate(totalRes, nextNum, symbol);
        }


        // inputStorage 스토리지 지우기 (새로운 연산 수행을 위해)
        inputTask.clearInputStorage();

        return totalRes;
    }
}
