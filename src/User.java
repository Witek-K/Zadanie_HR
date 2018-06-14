//package PACKAGE_NAME;

import java.util.List;

public class User {

    private String firstName;
    private String lastName;
    private Sex gender;

    private int height;
    private String birthDate; // DateTimeFormatter.ofPattern("dd-MM-yyyy")
    private List<String> interests;

    public User(String firstName, String lastName, Sex gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public User(String firstName, String lastName, Sex gender, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.height = height;
    }

    public User(String firstName, String lastName, Sex gender, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public User(String firstName, String lastName, Sex gender, List<String> interests) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.interests = interests;
    }

    public User(String firstName, String lastName, Sex gender, int height, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.height = height;
        this.birthDate = birthDate;
    }

    public User(String firstName, String lastName, Sex gender, int height, List<String> interests) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.height = height;
        this.interests = interests;
    }

    public User(String firstName, String lastName, Sex gender, String birthDate, List<String> interests) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.interests = interests;
    }
}

enum Sex {FEMALE, MALE, NA}
