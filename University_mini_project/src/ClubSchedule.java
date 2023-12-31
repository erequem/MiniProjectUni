public class ClubSchedule {
    private String id;
    private Club club;
    private String time;
    private static int count = 0;

    public ClubSchedule(Club club, String time) {
        this.club = club;
        this.time = time;
        this.id = "CS" + count;
        count++;
    }

    public String toString() {
        return "Club: " + club + "\nTime: " + time;
    }
}
