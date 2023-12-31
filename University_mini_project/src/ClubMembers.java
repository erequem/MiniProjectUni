import java.util.ArrayList;

public class ClubMembers {
    private String id;
    private Club club;
    private ArrayList<Student> students;
    private static int count = 0;

    public ClubMembers(Club club) {
        this.club = club;
        this.students = new ArrayList<>();
        this.id = "CM" + count;
        count++;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public String toString() {
        return "Club: " + club + "\nStudents: " + students;
    }
}
