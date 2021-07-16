package calculator;

public class Calc {
    public static int calculated(int num1, int num2, char op) {
//      Создаем переменную и присваиваем 0     
        int result = 0;
//      В зависимости от знака получаем результат     
        switch(op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("Не верный знак");
        }
        return result;
    }
}
