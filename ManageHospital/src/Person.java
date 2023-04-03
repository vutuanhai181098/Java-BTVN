public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "1. Họ và tên: " + name + "\n 2. Tuổi: " + age + "\n 3. Địa chỉ: " + address + "\n ";
    }
}
