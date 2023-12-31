import java.util.ArrayList;

public class StaffManager {
    private ArrayList<Staff> staffs;

    public StaffManager() {
        staffs = new ArrayList<>();
    }

    public void addStaff(Staff staff) {
        staffs.add(staff);
    }

    public void removeStaff(Staff staff) {
        staffs.remove(staff);
    }

    public void printStaff() {
        for (Staff staff : staffs) {
            System.out.println(staff);
        }
    }
}
