package etiya.com.service;

import etiya.com.dataAccess.CourseDao;
import etiya.com.entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;

    public CourseManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }
    public List<Course> getAll(){
        return courseDao.getAll();
    }
    public void add(Course course){
        courseDao.add(course);
    }
    public void remove(int id){
        courseDao.remove(id);
    }
}
