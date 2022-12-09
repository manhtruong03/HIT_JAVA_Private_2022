package BTVN_Tuan_06.Bai3;

public class Lop {
    // Object's properties
    private String maLop;
    private String tenLop;

    // Constructor methods
    public Lop() {

    }

    public Lop(String maLop, String tenLop) {
	super();
	this.maLop = maLop;
	this.tenLop = tenLop;
    }

    // Getter and Setter methods
    public String getMaLop() {
	return maLop;
    }

    public void setMaLop(String maLop) {
	this.maLop = maLop;
    }

    public String getTenLop() {
	return tenLop;
    }

    public void setTenLop(String tenLop) {
	this.tenLop = tenLop;
    }

    // Other methods
    @Override
    public String toString() {
	return "Lop [maLop=" + maLop + ", tenLop=" + tenLop + "]";
    }

}
