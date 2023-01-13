package bg.blubito.mapstructproblems.expressionAndConstantSolution;

public class User {
    private String name;
    private Boolean active = true;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean modifyActiveToInactive(){
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", active=" + active +
                '}';
    }
}
