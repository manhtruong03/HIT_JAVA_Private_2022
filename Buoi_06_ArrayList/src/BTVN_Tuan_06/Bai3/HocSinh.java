package BTVN_Tuan_06.Bai3;

public class HocSinh {
    // Object's properties
    private String hoTen;
    private int tuoi;
    private String queQuan;

    // Constructors methods
    public HocSinh() {
	this("Unknown", 0, "Unknown");
    }

    public HocSinh(String hoTen, int tuoi, String queQuan) {
	this.hoTen = hoTen;
	this.tuoi = tuoi;
	this.queQuan = queQuan;
    }

    // Getter and Setter methods
    public String getHoTen() {
	return hoTen;
    }

    public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
    }

    public int getTuoi() {
	return tuoi;
    }

    public void setTuoi(int tuoi) {
	this.tuoi = tuoi;
    }

    public String getQueQuan() {
	return queQuan;
    }

    public void setQueQuan(String queQuan) {
	this.queQuan = queQuan;
    }

    // Other methods
    @Override
    public String toString() {
	return String.format("%-30s %-10d %-30s", getHoTen(), getTuoi(), getQueQuan());
    }

}
