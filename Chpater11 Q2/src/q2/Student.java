package q2;

/**
 *
 * @author S C S
 */
public class Student extends Person {
    private final static String STATUS_FRESHMAN = "Freshman";
    private final static String STATUS_SOPHOMORE = "Sophomore";
    private final static String STATUS_JUNIOR = "Junior";
    private final static String STATUS_SENIOR = "Senior";

    private String status;

    public Student() {
        super();
        this.status = STATUS_FRESHMAN;
    }

    public Student(String name, String address, String phone, String email, String status) {
        super(name, address, phone, email);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Student: name = " + getName() + ", address = " + getAddress() +
               ", phone = " + getPhone() + ", email = " + getEmail() +
               ", status = " + status;
    }
}