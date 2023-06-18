public class SimpleNumbers {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 2; i <= 1000; i++) {
                if (isSimple(i)) {
                    sum += i;
                }
            }
            System.out.println("Сумма простых чисел от 1 до 1000 равна " + sum);
        }

        private static boolean isSimple(int number) {
            if (number == 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }