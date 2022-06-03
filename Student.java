package Human_Student;

import Animals.com.Animal;

public class Student extends Human implements IStudentInfo, ICollegeInfo {
    private String college;

    public void setStudentInfo(String name, String surname, String college) {
        super.setPersonalInfo(name, surname);
        setCollegeInfo(college);
    }
    public void getStudentInfo() {
        super.getPersonalInfo();
        getCollegeInfo();
    }
    public void getCollegeInfo() {
        System.out.println(college);
    }
    public void setCollegeInfo(String college) {
        this.college = college;
    }
}
