package components.models;

public class Person {
    private int id;
    private String fullName;
    private String login;
    private String password;
    private String dateOfBirth;
    private String role;
    private String subjectArea;

    public Person(){}

    public Person(int id, String fullName, String login, String password, String dateOfBirth, String role, String subjectArea) {
        this.id = id;
        this.fullName = fullName;
        this.login = login;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.role = role;
        this.subjectArea = subjectArea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSubjectArea() {
        return subjectArea;
    }

    public void setSubjectArea(String subjectArea) {
        this.subjectArea = subjectArea;
    }
}
