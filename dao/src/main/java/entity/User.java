package entity;

/**
 * Created by Denis Areshkevich on 28.05.2017.
 */
public class User {
    private int id;
    private String firstName;
    private String secondName;
    private String password;
    private String gender;
    private String phone_number;
    private String place_of_residence;

    public User(int id, String firstName, String secondName,
                String password, String gender, String phone_number, String place_of_residence) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.password = password;
        this.gender = gender;
        this.phone_number = phone_number;
        this.place_of_residence = place_of_residence;
    }

    public User(String firstName, String secondName,
                String password, String gender, String phone_number, String place_of_residence) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.password = password;
        this.gender = gender;
        this.phone_number = phone_number;
        this.place_of_residence = place_of_residence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPlace_of_residence() {
        return place_of_residence;
    }

    public void setPlace_of_residence(String place_of_residence) {
        this.place_of_residence = place_of_residence;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", place_of_residence='" + place_of_residence + '\'' +
                '}';
    }
}