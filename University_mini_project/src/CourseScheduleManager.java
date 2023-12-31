import java.util.ArrayList;

public class CourseScheduleManager {
    private ArrayList<CourseSchedule> courseSchedules;

    public CourseScheduleManager() {
        courseSchedules = new ArrayList<>();
    }

    public void addCourseSchedule(CourseSchedule courseSchedule) {
        courseSchedules.add(courseSchedule);
    }

    public void removeCourseSchedule(CourseSchedule courseSchedule) {
        courseSchedules.remove(courseSchedule);
    }

    public void printCourseSchedule() {
        for (CourseSchedule courseSchedule : courseSchedules) {
            System.out.println(courseSchedule);
        }
    }
}
