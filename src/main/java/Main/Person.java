package Main;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age > 100 || age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        if (firstName.equals("") && lastName.equals("")) {
            return "";
        } else {
            return firstName.equals("") ? lastName : lastName.equals("") ? firstName : firstName + " " + lastName;
        }
    }
}
