import java.util.ArrayList;

public class ClubMembersManager {
    private ArrayList<ClubMembers> clubMembers;

    public ClubMembersManager() {
        clubMembers = new ArrayList<>();
    }

    public void addClubMembers(ClubMembers clubMember) {
        clubMembers.add(clubMember);
    }

    public void removeClubMembers(ClubMembers clubMember) {
        clubMembers.remove(clubMember);
    }

    public void printClubMembers() {
        for (ClubMembers clubMember : clubMembers) {
            System.out.println(clubMember);
        }
    }
}
