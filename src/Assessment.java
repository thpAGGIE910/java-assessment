public class Assessment {

    public static int square(int number) {

        return number * number;

    }

    public static int sum(int number1, int number2) {

        return number1 + number2;

    }

    public static double sum(double number1, double number2) {

        return number1 + number2;

    }

    public static double average(int[] numbers) {

        double sum = 0;

        for(int number : numbers) {
            sum += (double) number;
        }

        return sum / numbers.length;

    }

    public static void main(String[] args) {

        System.out.println(square(2));
        System.out.println(sum(1, 2));
        System.out.println(sum(1.2,2.3));
        System.out.println(average(new int[]{5, 10}));

    }

}