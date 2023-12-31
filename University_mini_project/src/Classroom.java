public class Classroom {
    private String id;
    private String name;
    private int capacity;
    private static int count = 0;

    public Classroom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.id = "CR" + count;
        count++;
    }

    public String toString() {
        return "Name: " + name + "\nCapacity: " + capacity;
    }
}
