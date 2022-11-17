package BTVN_Buoi_05;

import BTVN_Buoi_05.Objects.Employee1;

public class Bai_05_01 {
	public static void main(String[] args) {
		System.out.println("Nhap danh sach 5 nhan vien");
		Employee1[] employee = new Employee1[5];

		for (int i = 0; i < 2; i++) {
			employee[i] = new Employee1();
			System.out.println("==Thong tin nhan vien thu " + (i + 1));
			employee[i].input();
		}
		
		System.out.printf("%-10s %-35s %-20s %-15s %-15s %-25s %-25s %-25s\n",
				 "ID", "Ho ten", "Kieu nhan vien", "So ngay lam", "Nam vao lam", "Luong", "Phu cap", "Tong tien");
		for (int i = 0; i < 2; i++) {
			employee[i].output();
		}
	}
}
