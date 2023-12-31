import java.util.ArrayList;
import java.util.HashMap;


public class University{
    private String name;
    private String address;
    private String phone;
    private String email;
    private CourseManager courseManager;
    private StaffManager staffManager;
    private StudentManager studentManager;
    private ClassroomManager classroomManager;
    private CourseScheduleManager courseScheduleManager;
    private ClubManager clubManager;
    private ClubScheduleManager clubScheduleManager;
    private ClubMembersManager clubMembersManager;

    public University(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        courseManager = new CourseManager();
        staffManager = new StaffManager();
        studentManager = new StudentManager();
        classroomManager = new ClassroomManager();
        courseScheduleManager = new CourseScheduleManager();
        clubManager = new ClubManager();
        clubScheduleManager = new ClubScheduleManager();
        clubMembersManager = new ClubMembersManager();
    }
    public void addCourse(Course course){
        courseManager.addCourse(course);
    }
    public void addStudent(Student student){
        studentManager.addStudent(student);
    }
    public void addStaff(Staff staff){
        staffManager.addStaff(staff);
    }
    public void addClassroom(Classroom classroom){
        classroomManager.addClassroom(classroom);
    }
    public void addCourseSchedule(CourseSchedule courseSchedule){
        courseScheduleManager.addCourseSchedule(courseSchedule);
    }
    public void addClub(Club club){
        clubManager.addClub(club);
    }
    public void addClubSchedule(ClubSchedule clubSchedule){
        clubScheduleManager.addClubSchedule(clubSchedule);
    }
    public void addClubMembers(ClubMembers clubMember){
        clubMembersManager.addClubMembers(clubMember);
    }
    public void removeCourse(Course course){
        courseManager.removeCourse(course);
    }
    public void removeStudent(Student student){
        studentManager.removeStudent(student);
    }
    public void removeStaff(Staff staff){
        staffManager.removeStaff(staff);
    }
    public void removeClassroom(Classroom classroom){
        classroomManager.removeClassroom(classroom);
    }
    public void removeCourseSchedule(CourseSchedule courseSchedule){
        courseScheduleManager.removeCourseSchedule(courseSchedule);
    }
    public void removeClub(Club club){
        clubManager.removeClub(club);
    }
    public void removeClubSchedule(ClubSchedule clubSchedule){
        clubScheduleManager.removeClubSchedule(clubSchedule);
    }
    public void removeClubMembers(ClubMembers clubMember){
        clubMembersManager.removeClubMembers(clubMember);
    }
    public void printCourse(Course course){
        courseManager.printCourse(course);
    }
    public void printStudent(){
        studentManager.printStudent();
    }
    public void printStaff(){
        staffManager.printStaff();
    }
    public void printClassroom(){
        classroomManager.printClassroom();
    }
    public void printCourseSchedule(){
        courseScheduleManager.printCourseSchedule();
    }
    public void printClub(){
        clubManager.printClub();
    }
    public void printClubSchedule(){
        clubScheduleManager.printClubSchedule();
    }
    public void printClubMembers(){
        clubMembersManager.printClubMembers();
    }
    
}


