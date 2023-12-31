public class Person {
    private String id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private static int count = 0;

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.id = "P" + count;
        count++;
    }

    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone + "\nEmail: " + email;
    }
}
