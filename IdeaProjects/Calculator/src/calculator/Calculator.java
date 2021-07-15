package calculator;

// Добавляем библиотеки
import java.util.Scanner;
// Создаем общий класс Calculator
public class Calculator {
    
//   Создаем переменные и переменнуя scanner для ввода с клавиатуры
     static Scanner scanner = new Scanner(System.in);    
     static int num1, num2, result;
     static char operation;
        
     public static void main(String[] args) {       
        System.out.println("Введите выражение");
//      Считываем строку input которую ввёл пользователь
        String input = scanner.nextLine();        
//      Создаем массив для хранеия символов: char_simv
        char char_simv[];
        char_simv = new char[10];
//      Заполняем массив символами, который мог ввести пользователь
        for(int i = 0; i < input.length(); i++) {
//      Записываем метод извлечения символа из строки            
            char_simv[i] = input.charAt(i);
            if(char_simv[i] == '+')
                operation = '+';
            if(char_simv[i] == '-')
                operation = '-'; 
            if(char_simv[i] == '*') {
                operation = '*';
            }
            if(char_simv[i] == '/') {
                operation = '/';
            }
        }
//      Преобразуем строку в числовой тип данных
        String under_charString = String.valueOf(char_simv);
//      Напишем метод split для разделителей +-*/
        String[] separator = under_charString.split("[+-/*]");
        String stable00 = separator[0];
        String stable01 = separator[1];
//      Метод trim удаляет начальные и конечные пробелы
        String string03 = stable01.trim();             
//      Присваеваем переменным num1 и num2 ссылку на метод для ввода римских цифр
        num1 = Roman.romanNumber(stable00);
        num2 = Roman.romanNumber(string03);
        if(num1 < 0 && num2 < 0){
            result = 0;            
        } else {
            result = Calc.calculated(num1, num2, operation);
            System.out.println("Римские цифры");
            String resultRoman = ConvertToRoman.convertToRoman(result);
            System.out.println(stable00 + " " + operation + " " + string03 + " = " + resultRoman);
        }
//      Преобразуем строку в число с использование parseInt класса Integer
        num1 = Integer.parseInt(stable00);
        num2 = Integer.parseInt(string03);        
//      Получаем результат
        result = Calc.calculated(num1, num2, operation);
        System.out.println("Арабские цифры");
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
                
    }
}
    

   

