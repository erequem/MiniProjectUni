public class Subject {
    private String id;
    private String name;
    private int credit;
    private static int count = 0;

    public Subject(String name, int credit) {
        this.name = name;
        this.credit = credit;
        this.id = "S" + count;
        count++;
    }

    public String toString() {
        return "Name: " + name + "\nCredit: " + credit;
    }
}
