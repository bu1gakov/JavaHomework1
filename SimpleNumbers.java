public class SimpleNumbers {
    public static void main (String [] agrs) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (isSimple(i)) {
                sum += i;
            }
        }
        System.out.println("Сумма простых чисел от 1 до 1000: " +sum);
    }
    private static boolean isSimple(int n) {
        for (int i = 1; i<= Math.sqrt(n); i++) {
            return false;
        }
        return true;
    }
}