package etiya.com.entities.accounts;

import etiya.com.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class EducatorAccount extends Account{
    private List<Course> coursesGiven;
    private String specialtyBranch;


    public EducatorAccount(String email, String password, String firstName, String lastName, String gender, String birthDate, String specialtyBranch) {
        super(email, password, firstName, lastName, gender, birthDate);
        this.specialtyBranch = specialtyBranch;
        this.coursesGiven = new ArrayList<>();
    }

    public List<Course> getCoursesGiven() {
        return coursesGiven;
    }

    public void addCourse(Course course) {
        this.coursesGiven.add(course);
    }
    public void removeCourse(Course course){
        this.coursesGiven.remove(course);
    }
    public String getSpecialtyBranch() {
        return specialtyBranch;
    }

    public void setSpecialtyBranch(String specialtyBranch) {
        this.specialtyBranch = specialtyBranch;
    }
}
