import java.util.ArrayList;

public class ClassroomManager {
    private ArrayList<Classroom> classrooms;

    public ClassroomManager() {
        classrooms = new ArrayList<>();
    }

    public void addClassroom(Classroom classroom) {
        classrooms.add(classroom);
    }

    public void removeClassroom(Classroom classroom) {
        classrooms.remove(classroom);
    }

    public void printClassroom() {
        for (Classroom classroom : classrooms) {
            System.out.println(classroom);
        }
    }
}
