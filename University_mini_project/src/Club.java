public class Club {
    private String id;
    private String name;
    private String description;
    private static int count = 0;

    public Club(String name, String description) {
        this.name = name;
        this.description = description;
        this.id = "CL" + count;
        count++;
    }

    public String toString() {
        return "Name: " + name + "\nDescription: " + description;
    }
}
