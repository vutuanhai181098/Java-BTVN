package entity;

public class Student extends Person {
    private static int autoId;
    private int id;
    private String capacity;

    public Student(String name, int age, String capacity) {
        super(name, age);
        this.id = ++autoId;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }


    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String toString() {
        return "Id: " + id + ", Tên: " + super.getName() + ", Tuổi: " + super.getAge() + ", Học lực: " + capacity;
    }

}
