package entity;

public class Player {
    private String name;
    private int age;
    private Figure figure;

    public Player(String name, int age, Figure figure) {
        this.name = name;
        this.age = age;
        this.figure = figure;
    }

    @Override
    public String toString() {
        return "Người chơi: " + name + ", tuổi: " + age + "\n" + figure;
    }
}
