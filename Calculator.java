import java.util.Scanner;
public class Calculator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

//  Выбираем опреацию, вводим переменные

System.out.println("Выберите операцию (+,-,*,/,^):");
String operator = input.nextLine();

System.out.println("Введите первое число: ");
double num1 = input.nextInt();

System.out.println("Введите второе число (степень): ");
double num2 = input.nextInt();

// Вычисление

        int result = 0;
        switch (operator) {
            case "+":
                result = (int) (num1 + num2);
                break;
            case "-":
                result = (int) (num1 - num2);
                break;
            case "*":
                result = (int) (num1 * num2);
                break;
            case "/":
                result = (int) (num1 / num2);
                break;
            case "^":
                result = (int) Math.pow(num1, num2);
                break;
        }
        // Вывод результата
        System.out.println(result);
    }
}
