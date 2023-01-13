package bg.blubito.mapstructproblems.p2;

public class PersonP2 {
    private String firstName;
    private String address;
    private int age;

    public PersonP2(String firstName, String address, int age) {
        this.firstName = firstName;
        this.address = address;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonP2{" +
                "firstName='" + firstName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
