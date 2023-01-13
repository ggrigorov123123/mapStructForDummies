package bg.blubito.mapstructproblems.p3;

public class PersonDTOP3 {
    private String name;
    private String address;
    private int age;
    private String countryName;

    public PersonDTOP3(String name, String address, int age, String countryName) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.countryName = countryName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "PersonDTOP3{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
