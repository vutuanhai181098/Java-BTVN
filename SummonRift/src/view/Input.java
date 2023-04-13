package view;

import entity.SummonRift;
import entity.Team;
import handle.DateTimeHandle;
import handle.TeamHandle;

import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Input {
    public void input(Scanner scanner) {
        try {
            System.out.println("Mời bạn nhập thông tin cho 2 đội tuyển:");
            System.out.println("1. SKT Telecom");
            TeamHandle teamHandle = new TeamHandle();
            Team skt = teamHandle.createTeam(scanner);
            System.out.println("2. G2 Esports");
            Team g2 = teamHandle.createTeam(scanner);
            SummonRift summonRift = new SummonRift(skt, g2);
            System.out.println("Nhập thời gian bắt đầu(dd/MM/yyyy HH:mm): ");
            DateTimeHandle dateTimeHandle = new DateTimeHandle();
            String dateTime = dateTimeHandle.convertDateTime(scanner.nextLine());
            System.out.println(summonRift + "\nThời gian bắt đầu: " + dateTime);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Nhập sai định dạng.");
        } catch (DateTimeParseException dateTimeParseException) {
            System.out.println("Nhập sai định dạng thời gian.");
        }
    }
}
