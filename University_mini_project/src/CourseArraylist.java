import java.util.ArrayList;

public class CourseArraylist {
    private ArrayList<Course> courses;

    public CourseArraylist() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void printCourse() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
