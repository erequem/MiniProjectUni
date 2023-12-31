public class Course {
    private String id;
    private String name;
    private Teacher teacher;
    private Subject subject;
    private static int count = 0;

    public Course(String name, Teacher teacher, Subject subject) {
        this.name = name;
        this.teacher = teacher;
        this.subject = subject;
        this.id = "C" + count;
        count++;
    }

    public String getId() {
        return id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String toString() {
        return "Name: " + name + "\nTeacher: " + teacher + "\nSubject: " + subject;
    }
}
