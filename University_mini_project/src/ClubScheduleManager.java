import java.util.ArrayList;

public class ClubScheduleManager {
    private ArrayList<ClubSchedule> clubSchedules;

    public ClubScheduleManager() {
        clubSchedules = new ArrayList<>();
    }

    public void addClubSchedule(ClubSchedule clubSchedule) {
        clubSchedules.add(clubSchedule);
    }

    public void removeClubSchedule(ClubSchedule clubSchedule) {
        clubSchedules.remove(clubSchedule);
    }

    public void printClubSchedule() {
        for (ClubSchedule clubSchedule : clubSchedules) {
            System.out.println(clubSchedule);
        }
    }
}
