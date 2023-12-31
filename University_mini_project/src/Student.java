public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String phone, String email, String program, int year, double fee) {
        super(name, address, phone, email);
        this.program = program;
        this.year = year;
        this.fee = fee;

    }

    public String toString() {
        return super.toString() + "\nProgram: " + program + "\nYear: " + year + "\nFee: " + fee;
    }
}
