public class Reduce {
    public static void main(String[] args) {
        int number = 100;
        int steps = 0;
        for (int i = 1; number != 0; i++) {
            if (number % 2 == 0) {
                number = number / 2;
                steps++;
            }
            else {
                number -= 1;
                steps++;
            }

        }
        System.out.println(steps);
    }
}
