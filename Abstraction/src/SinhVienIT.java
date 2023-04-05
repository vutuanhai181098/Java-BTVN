public class SinhVienIT extends SinhVienTechMaster {
    private double pointJava;
    private double pointHtml;
    private double pointCss;

    public SinhVienIT(String fullName, String major, double pointJava, double pointHtml, double pointCss) {
        super(fullName, major);
        this.pointJava = pointJava;
        this.pointHtml = pointHtml;
        this.pointCss = pointCss;
    }

    @Override
    public double getPoint() {
        return (2 * pointJava + pointHtml + pointCss) / 4;
    }
}
