import java.util.ArrayList;

public class ClubManager {
    private ArrayList<Club> clubs;

    public ClubManager() {
        clubs = new ArrayList<>();
    }

    public void addClub(Club club) {
        clubs.add(club);
    }

    public void removeClub(Club club) {
        clubs.remove(club);
    }

    public void printClub() {
        for (Club club : clubs) {
            System.out.println(club);
        }
    }
}
