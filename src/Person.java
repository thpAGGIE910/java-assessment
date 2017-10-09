public class Person {

    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {

        if(firstName == null || lastName == null) {

            throw new IllegalArgumentException();

        }

        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {

        return this.firstName;

    }

    public void setFirstName(String firstName) {

        if (firstName == null) {

            throw new IllegalArgumentException();

        }

        this.firstName = firstName;

    }

    public String getLastName() {

        return this.lastName;

    }

    public void setLastName(String lastName) {

        if (lastName == null) {

            throw new IllegalArgumentException();

        }

        this.lastName = lastName;

    }
}