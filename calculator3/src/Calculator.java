public class Calculator {
    private double result;
    double totalRes;

    double calculate(double num1, double num2, char symbol){
        //계산
        return result;
    }

    public double totalRes() {
        InputClass input = new InputClass();

        input.inputClass();
        // 배열 확인용 출력
        input.getStorage();

        totalRes = input.getNumber(0);
        for (int k = 1; k < input.getIJ(); k+=2){
            totalRes = calculate(totalRes, input.getNumber(k+1), input.getSymbol(k));
        }
        return this.totalRes;
    }
}