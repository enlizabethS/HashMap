import java.util.Objects;

public class Client {
    private String firstName;
    private String secondName;
    private String gender;

    public Client(String firstName, String secondName, String gender) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String isGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return gender == client.gender && Objects.equals(firstName, client.firstName) && Objects.equals(secondName, client.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, gender);
    }

}
