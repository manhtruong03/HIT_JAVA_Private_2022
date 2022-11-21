package BTVN_Buoi_05;

import java.util.Scanner;

import BTVN_Buoi_05.Objects.Student;

public class Bai_05_03 {
	
	/**
	 * Sap xep tang dan danh sach sinh vien theo <strong>diem</strong>
	 * @param sinhVien - Danh sach sinh vien
	 * @param n - So luong sinh vien
	 */
	public static void sortByScore(Student[] sinhVien, int n) {
		for (int i = 0; i < n - 1; i++) {
			int m = i;
			for (int j = m + 1; j < n; j++) {
				if (sinhVien[m].getStudent_score() > sinhVien[j].getStudent_score()) {
					m = j;
				}
			}
			if (i != m) {
				Student temp = sinhVien[i];
				sinhVien[i] = sinhVien[m];
				sinhVien[m] = temp;
			}
		}
	}
	
	/**
	 * Sap xep tang dan sinh vien theo <strong>Ten</strong>
	 * @param sinhVien - Danh sach sinh vien
	 * @param n - so luong sinh vien
	 */
	public static void sortByName(Student[] sinhVien, int n) {
		for (int i = 0; i < n - 1; i++) {
			int m = i;
			for (int j = m + 1; j < n; j++) {
				if (sinhVien[m].getName().charAt(0) > sinhVien[j].getName().charAt(0)) {
					m = j;
				}
			}
			if (i != m) {
				Student temp = sinhVien[i];
				sinhVien[i] = sinhVien[m];
				sinhVien[m] = temp;
			}
		}
	}
	
	/**
	 * <strong>Tim kiem</strong> sinh vien theo ten
	 * @param sinhVien - danh sach sinh vien
	 * @param n - so luong sinh vien
	 * @param name - ten can tim kiem
	 */
	public static void searchByName(Student[] sinhVien, int n, String name) {
		System.out.printf("%-10s %-30s %-30s %-15s %-10s\n", "Ma SV", "Ho ten", "Dia chi", "Dien thoai", "Diem");
		for (int i = 0; i < n; i++) {
			if (name.equals(sinhVien[i].getName())) {
				sinhVien[i].output();
			}
		}
	}
	
	/**
	 * Xuat danh sach sinh vien
	 * @param sinhVien - danh sach sinh vien
	 * @param n - so luong sinh vien co trong danh sach
	 */
	public static void displayListOfStudent(Student[] sinhVien, int n) {
		System.out.printf("%-10s %-30s %-30s %-15s %-10s\n", "Ma SV", "Ho ten", "Dia chi", "Dien thoai", "Diem");
		for (int i = 0; i < n; i++) {
			sinhVien[i].output();
		}
	}
	
	/**
	 * BTVN-Buoi_05-Bai_03
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		
		Student[] sinhVien = new Student [n];
		
		// Nhap thong tin n sinh vien
		for (int i = 0; i < n; i++) {
			System.out.println("===Nhap thong tin sinh vien thu " + (i+1));
			sinhVien[i] = new Student();
			sinhVien[i].input();
		}
		
		int option;		
		do {
			System.out.println("[*---------------------------MENU-------------------------*]");
			System.out.println("(1)\t Xuat danh sach sinh vien theo thu tu tang dan cua diem");
			System.out.println("(2)\t Tim kiem theo ten");
			System.out.println("(3)\t Sap xep danh sach theo ten");
			System.out.println("(4)\t Thoat khoi chuong trinh");
			System.out.print("Vui long chon mot so: ");
			option = sc.nextInt();
			
			switch (option) {
			case 1:
				sortByScore(sinhVien, n);
				displayListOfStudent(sinhVien, n);
				break;
			case 2:
				System.out.printf("Nhap ten sinh vien can tim kiem: ");
				sc.nextLine();
				String name = sc.nextLine();
				searchByName(sinhVien, n, name);
				break;
			case 3:
				sortByName(sinhVien, n);
				displayListOfStudent(sinhVien, n);
				break;
			case 4:
				System.out.println("[*----------------KET THUC CHUONG TRINH--------------*]");
				break;
			default:
				System.out.println("Lua chon khong hop le!");
			}
		} while (option != 4);

		return;
	}
}
