package entity;

public class SummonRift {
    private Team skt;
    private Team g2;

    public SummonRift(Team skt, Team g2) {
        this.skt = skt;
        this.g2 = g2;
    }

    @Override
    public String toString() {
        return "Thông tin 2 đổi tuyển:\n1. SKT Telecom\n" + skt + "\n2. G2 Esports\n" + g2;
    }
}
