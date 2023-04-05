public class SinhVienBiz extends SinhVienTechMaster {
    private double pointMarketing;
    private double pointSales;

    public SinhVienBiz(String fullName, String major, double pointMarketing, double pointSales) {
        super(fullName, major);
        this.pointMarketing = pointMarketing;
        this.pointSales = pointSales;
    }

    @Override
    public double getPoint() {
        return (2 * pointMarketing + pointSales) / 3;
    }
}
