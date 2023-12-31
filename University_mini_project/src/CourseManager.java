import java.util.ArrayList;
import java.util.HashMap;

public class CourseManager {
    private HashMap<String, ArrayList<Student>> courses;

    public CourseManager() {
        courses = new HashMap<>();
    }

    public void addCourse(Course course) {
        courses.put(course.getId(), new ArrayList<>());
    }

    public void addStudentToCourse(Student student, Course course) {
        courses.get(course.getId()).add(student);
    }

    public void removeStudentFromCourse(Student student, Course course) {
        courses.get(course.getId()).remove(student);
    }

    public void printCourse(Course course) {
        System.out.println(course);
        for (Student student : courses.get(course.getId())) {
            System.out.println(student);
        }
    }

    public void removeCourse(Course course){
        courses.remove(course.getId());
    }
}
