package entity;

import java.util.ArrayList;

public class Team {
    private ArrayList<Player> team;

    public Team(ArrayList<Player> team) {
        this.team = team;
    }

    @Override
    public String toString() {
        String strings = "";
        for (int i = 0; i < 5; i++) {
            strings += "-Thành viên số " + (i + 1) + ":\n" + team.get(i) + "\n";
        }
        return strings;
    }
}
