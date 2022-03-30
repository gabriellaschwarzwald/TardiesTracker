public class Student {

    private String firstName;
    private String lastName;
    private int tardies;

    // default constructor
    public Student(){
        lastName = " ";
        firstName = " ";
        tardies = 0;
    }
    public Student(String firstName, String lastName, int tardies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tardies = tardies;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTardies() {
        return tardies;
    }

    public void setTardies(int tardies) {
        this.tardies = tardies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", tardies=" + tardies +
                '}';
    }
}
