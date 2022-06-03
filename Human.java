package Human_Student;

public class Human implements IPersonalInfo {
    private String name;
    private String surname;
    public void setPersonalInfo(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void getPersonalInfo() {
        System.out.println(name + ' ' + surname);
    }


}
