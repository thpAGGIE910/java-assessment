import java.util.ArrayList;

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

    public static ArrayList<User> capitalizeRecords(ArrayList<User> users) {

        ArrayList<User> usersCopy = new ArrayList<>();

        for (User user : users) {
            usersCopy.add(new User(user.getFirstName(), user.getLastName(), user.isAdmin()));
        }

        for(User user : usersCopy) {

            String firstName = user.getFirstName();
            String lastName = user.getLastName();
            String pattern = "[a-z].*";

            if (firstName.matches(pattern)) {
                firstName = capitalizeName(firstName);
                user.setFirstName(firstName);
            }

            if (lastName.matches(pattern)) {
                lastName = capitalizeName(lastName);
                user.setLastName(lastName);
            }

        }

        return usersCopy;

    }

    public static String capitalizeName(String nameToCapitalize) {
        return nameToCapitalize.toUpperCase().charAt(0) + nameToCapitalize.substring(1).toLowerCase();
    }

    public static void main(String[] args) {

        System.out.println(square(2));
        System.out.println(sum(1, 2));
        System.out.println(sum(1.2,2.3));
        System.out.println(average(new int[]{5, 10}));

        ArrayList<User> theUsers = new ArrayList<>();
        theUsers.add(new User("travis", "payne", true));
        theUsers.add(new User("Bryce", "Payne", false));

        ArrayList<User> capitalizedUsers = capitalizeRecords(theUsers);

        for (User user : capitalizedUsers) {
            user.sayHello();
        }

        for (User user : theUsers) {
            user.sayHello();
        }
    }

}