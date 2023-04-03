public class Patient extends Person{
    private int id;
    private String date;

    public Patient(String name, int age, String address, int id, String date) {
        super(name, age, address);
        this.id = id;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Thông tin bệnh nhân:\n " + super.toString() + "4. Số bệnh án: " + id + "\n 5. Ngày nhập viện: " + date;
    }
}
