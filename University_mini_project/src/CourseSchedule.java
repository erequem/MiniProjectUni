public class CourseSchedule {
    private String id;
    private Course course;
    private Classroom classroom;
    private String time;
    private static int count = 0;

    public CourseSchedule(Course course, Classroom classroom, String time) {
        this.course = course;
        this.classroom = classroom;
        this.time = time;
        this.id = "CS" + count;
        count++;
    }

    public String toString() {
        return "Course: " + course + "\nClassroom: " + classroom + "\nTime: " + time;
    }
}
