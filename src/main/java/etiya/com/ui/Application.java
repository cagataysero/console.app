package etiya.com.ui;

import etiya.com.entities.Category;
import etiya.com.entities.Course;
import etiya.com.dataAccess.DefaultCourseDao;
import etiya.com.entities.accounts.EducatorAccount;
import etiya.com.service.CourseManager;

import java.util.Scanner;

public class Application {
    public static EducatorAccount educator1 = new EducatorAccount("test.com", "test", "John", "Doe", "Male", "01-01-2000", "Software Science");
    public static Category category1 = new Category(1,"Programming");
    private final Scanner scanner;
    private final  CourseManager courseManager;



    public Application() {
        scanner = new Scanner(System.in);
        courseManager = new CourseManager(new DefaultCourseDao());
    }

    public void start() {
        System.out.println("--Welcome to Kodlama.io courses area!--");
        System.out.println("1-Courses");
        System.out.println("2-Add course");
        System.out.println("3-Remove course");
        System.out.println("4-Login");
        System.out.println("5-Signup");
        System.out.println("0-Exit");
        System.out.println(" ");
        System.out.println("Please select one choice.");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1" -> showCourses();
            case "2" -> courseAddScreen();
            case "3" -> courseRemoveScreen();
            case "4" -> showLogin();
            case "5" -> showSignup();
            case "0" -> System.exit(0);
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }

    private void showCourses() {
        System.out.println("-Courses-");
        for (Course course : courseManager.getAll()) {
            System.out.println(course.getId() + " --> " + course.getTitle() + " - " + course.getDescription() + " | Fee: " + course.getFee() + "₺");
        }
        System.out.println("\nPress 0 to go back.");
        String choice = scanner.nextLine();
        if (choice.equals("0")) {
            start();
        }
    }
    private void courseAddScreen(){
        System.out.println("Course title:");
        String title = scanner.nextLine();
        System.out.println("Course description:");
        String desc = scanner.nextLine();
        System.out.println("Course image url:");
        String img = scanner.nextLine();
        Course course = new Course(4,title,desc,img,category1,educator1,0);
        courseManager.add(course);
        category1.setCourses(course);
        start();
    }
    private void courseRemoveScreen(){
        System.out.println("-Select course which you want remove-");
        for (Course course : courseManager.getAll()) {
            System.out.println(course.getId() + " --> " + course.getTitle() + " - " + course.getDescription() + " | Fee: " + course.getFee() + "₺");
        }
        System.out.println("Enter valid id:");
        int id = Integer.parseInt(scanner.nextLine());
        courseManager.remove(id);
        start();
    }

    private void showLogin() {
        System.out.println("Login page");
    }

    private void showSignup() {
        System.out.println("Signup page");
    }
}

