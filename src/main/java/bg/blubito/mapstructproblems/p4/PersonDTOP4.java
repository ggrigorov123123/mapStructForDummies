package bg.blubito.mapstructproblems.p4;

public class PersonDTOP4 {
    private String name;
    private CountryDTOP4 country;

    public PersonDTOP4(String name, CountryDTOP4 country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CountryDTOP4 getCountry() {
        return country;
    }

    public void setCountry(CountryDTOP4 country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "PersonDTOP4{" +
                "name='" + name + '\'' +
                ", countryDTOP4=" + country +
                '}';
    }
}
