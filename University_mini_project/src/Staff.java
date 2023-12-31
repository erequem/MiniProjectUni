public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String phone, String email, String school, double pay) {
        super(name, address, phone, email);
        this.school = school;
        this.pay = pay;
    }

    public String toString() {
        return super.toString() + "\nSchool: " + school + "\nPay: " + pay;
    }
}
