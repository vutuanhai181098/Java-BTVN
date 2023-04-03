public class Doctor extends Person{
    private String specialist;
    private double timeForWork;

    public Doctor(String name, int age, String address, String specialist, double timeForWork) {
        super(name, age, address);
        this.specialist = specialist;
        this.timeForWork = timeForWork;
    }

    @Override
    public String toString() {
        return "Thông tin của bác sĩ:\n " + super.toString() + "4. Chuyên khoa: " + specialist +"\n 5. Số giờ làm việc: " + timeForWork;
    }
}
