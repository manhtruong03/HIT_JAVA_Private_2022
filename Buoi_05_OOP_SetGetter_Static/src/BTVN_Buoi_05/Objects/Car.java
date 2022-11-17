package BTVN_Buoi_05.Objects;

import java.util.Scanner;

public class Car {
	// Object's properties
	private String chuSoHuu;
	private String tenXe;
	private String hang;
	private double gia;
	private int namMua;
	
	// Contructor methods
	public Car() {
		this("Unkown", "Unkown", "Unkown", 0, 0);
	}
	
	public Car(String chuSoHuu, String tenXe, String hang, double gia, int namMua) {
		this.chuSoHuu = chuSoHuu;
		this.tenXe = tenXe;
		this.hang = hang;
		this.gia = gia;
		this.namMua = namMua;
	}

	// Setter Getter methods
	public String getChuSoHuu() {
		return chuSoHuu;
	}

	public void setChuSoHuu(String chuSoHuu) {
		this.chuSoHuu = chuSoHuu;
	}

	public String getTenXe() {
		return tenXe;
	}

	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}

	public String getHang() {
		return hang;
	}

	public void setHang(String hang) {
		this.hang = hang;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public int getNamMua() {
		return namMua;
	}

	public void setNamMua(int namMua) {
		this.namMua = namMua;
	}
	
	// Other methods
	public int getNamSuDung() {
		return 2022 - namMua;
	}
	
	public double getGiaHienTai() {
		double percent = 0;
		if (gia < 1_000_000_000) {
			percent = 0.07;
		}
		else if (gia <= 2_000_000_000) {
			percent = 0.05;
		} else {
			percent = 0.03;
		}
		
		return gia - (gia * percent * getNamSuDung());
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Chu so huu: ");
		setChuSoHuu(sc.nextLine());
		
		System.out.print("Ten xe: ");
		setTenXe(sc.nextLine());
		
		System.out.print("Hang: ");
		setHang(sc.nextLine());
		
		System.out.print("Gia: ");
		setGia(sc.nextDouble());
		
		System.out.print("Nam mua: ");
		setNamMua(sc.nextInt());
	}
	
	public void output() {
		System.out.printf("%-30s %-30s %-20s %-20.2f %-10d %-20.2f\n",
				chuSoHuu, tenXe, hang, gia, getNamSuDung(), getGiaHienTai());
	}
}
