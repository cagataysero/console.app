package etiya.com.dataAccess;

import etiya.com.entities.Category;
import etiya.com.entities.Course;
import etiya.com.entities.accounts.EducatorAccount;
import etiya.com.ui.Application;

import java.util.ArrayList;
import java.util.List;

public class DefaultCourseDao implements CourseDao{
    private List<Course> courses;

    public DefaultCourseDao() {
        this.courses = new ArrayList<>();
        Course course1 = new Course(1,"Java Programming", "Learn Java from scratch", "java.jpg", Application.category1, Application.educator1, 50);
        Course course2 = new Course(2,"Data Structures", "Advanced data structures", "datastructures.jpg", Application.category1, Application.educator1, 75);
        Course course3 = new Course(3,"Calculus 101", "Introduction to Calculus", "calculus.jpg", Application.category1, Application.educator1, 40);

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
    }


    @Override
    public List<Course> getAll() {
        return courses;
    }
    @Override
    public void add(Course course) {
        courses.add(course);
    }

    @Override
    public void remove(int id) {
        courses.removeIf(course -> course.getId() == id);
    }
}
