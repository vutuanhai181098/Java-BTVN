public abstract class SinhVienTechMaster {
    private String fullName;
    private String major;

    public SinhVienTechMaster(String fullName, String major) {
        this.fullName = fullName;
        this.major = major;
    }

    public abstract double getPoint();

    public String getTitle(double point) {
        if (point < 5) {
            return "Học lực yếu";
        } else if (point >= 5 && point < 6.5) {
            return "Học lực trung bình";
        } else if (point >= 6.5 && point < 7.5) {
            return "Học lực khá";
        } else if (point >= 7.5 && point <= 10) {
            return "Học lực giỏi";
        } else {
            return "Nhập sai điểm. Yêu cầu kiểm tra lại!";
        }
    }

    public String print() {
        return
                "Thông tin sinh viên:\n 1. Họ và tên: " + fullName + "\n 2. Chuyên ngành: " + major +
                        "\n 3. Điểm trung bình: " + getPoint() + "\n 4. Danh hiệu: " + getTitle(getPoint());
    }
}
