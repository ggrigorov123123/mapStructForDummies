package bg.blubito.mapstructproblems.p3;

public class PersonP3 {
    private String name;
    private String address;
    private int age;
    private CountryP3 country;

    public PersonP3(String name, String address, int age, CountryP3 country) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.country = country;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CountryP3 getCountry() {
        return country;
    }

    public void setCountry(CountryP3 country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "PersonP3{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", country=" + country +
                '}';
    }
}
