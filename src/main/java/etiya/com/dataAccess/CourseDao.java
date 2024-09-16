package etiya.com.dataAccess;

import etiya.com.entities.Course;

import java.util.List;

public interface CourseDao{
    List<Course> getAll();
    void add(Course course);
    void remove(int id);
}
