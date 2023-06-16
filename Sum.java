import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Вводим значение переменной
        System.out.println("Введите значение 'n'");
        int n = input.nextInt();

        // Высчитываем сумму
        int sum = 0;
        for (int i = 1; i<=n; i++) {
            sum = sum + i;
        }
        // Вывод результата
        System.out.println("Сумма чисел от 1 до" + n + "=" +sum);
    }
}