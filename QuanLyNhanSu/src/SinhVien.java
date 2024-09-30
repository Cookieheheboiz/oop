public class SinhVien {
    private String ten;
    private int year;
    private String msv;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public SinhVien(String ten, int year, String msv) {
        this.ten = ten;
        this.year = year;
        this.msv = msv;
    }
}
