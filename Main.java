package Human_Student;

public class Main {
    public static void main(String[] args) {
        Human ivan = new Human();
        ivan.setPersonalInfo("Ivan", "Ivanov");
        Student vasya = new Student();
        vasya.setStudentInfo("Vasiliy", "Vasiliev", "Harvard");
        ivan.getPersonalInfo();
        vasya.getPersonalInfo();
        vasya.getCollegeInfo();
        vasya.getStudentInfo();
    }
}
