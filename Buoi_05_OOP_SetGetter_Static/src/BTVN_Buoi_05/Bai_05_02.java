package BTVN_Buoi_05;

import java.util.Scanner;

import BTVN_Buoi_05.Objects.Car;

public class Bai_05_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so luong xe: ");
		int n = sc.nextInt();
		
		Car[] oto = new Car [n];
		
		for (int i = 0; i < n; i++) {
			oto[i] = new Car();
			System.out.println("Nhap thong tin xe thu " + (i + 1));
			oto[i].input();
		}
		
		System.out.printf("%-30s %-30s %-20s %-20s %-10s %-20s\n",
				"Chu so huu", "Ten xe", "Hang", "Gia", "Nam su dung", "Gia tri hien tai");
		for (int i = 0; i < n; i++) {
			oto[i].output();
		}
		
		// Sap xep theo gia hien tai
		for (int i = 0; i < n - 1; i++) {
			int m = i;
			for (int j = i + 1; j < n; j++) {
				if (oto[m].getGiaHienTai() > oto[j].getGiaHienTai()) {
					m = j;
				}
			}
			Car temp = new Car();
			temp = oto[i];
			oto[i] = oto[m];
			oto[m] = temp;
		}
		
		System.out.println("SAP XEP THEO GIA HIEN TAI");
		System.out.printf("%-30s %-30s %-20s %-20s %-10s %-20s\n",
				"Chu so huu", "Ten xe", "Hang", "Gia", "Nam su dung", "Gia tri hien tai");
		for (int i = 0; i < n; i++) {
			oto[i].output();
		}
		
		// In ra oto da het han
		System.out.println("DANH SACH OTO DA HET GIA TRI");
		System.out.printf("%-30s %-30s %-20s %-20s %-10s %-20s\n",
				"Chu so huu", "Ten xe", "Hang", "Gia", "Nam su dung", "Gia tri hien tai");
		for (int i = 0; i < n; i++) {
			if (oto[i].getGiaHienTai() <= 0) {
				oto[i].output();
			}
		}
	}
}
