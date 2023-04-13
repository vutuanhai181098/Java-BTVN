package handle;

import entity.Player;
import entity.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamHandle {
    public Team createTeam(Scanner scanner) {
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Thông tin cho thành viên thứ " + (i + 1) + ":");
            PlayerHandle playerHandle = new PlayerHandle();
            Player player = playerHandle.createPlayer(scanner);
            players.add(player);
        }
        Team team = new Team(players);
        return team;
    }
}
