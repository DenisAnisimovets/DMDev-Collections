package Part3;

public class StudentIdentity implements Comparable<StudentIdentity>{
    String firstName;
    String lastName;

    public StudentIdentity(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(StudentIdentity o) {
        return getFullName().compareTo(o.getFullName());
    }

    public String getFullName() {
        return firstName + lastName;
    }

    @Override
    public String toString() {
        return "StudentIdentity{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
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
}
