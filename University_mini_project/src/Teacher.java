public class Teacher extends Staff {
    public Teacher(String name, String address, String phone, String email, String school, double pay) {
        super(name, address, phone, email, school, pay);
    }
    public String toString(){
        return super.toString();
    }
}