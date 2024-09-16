package etiya.com.entities.accounts;

import etiya.com.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class StudentAccount extends Account{
    private List<Course> coursesTaken;

    public StudentAccount(String email, String password, String firstName, String lastName, String gender, String birthDate) {
        super(email, password, firstName, lastName, gender, birthDate);
        this.coursesTaken = new ArrayList<>();
    }

    public void addCourse(Course course){
        this.coursesTaken.add(course);
    }
    public void removeCourse(Course course){
        this.coursesTaken.remove(course);
    }
}
