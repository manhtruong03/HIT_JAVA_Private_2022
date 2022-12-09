package BTVN_Tuan_06.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai_03_01 {
	// Cau 1. Nhập vào một Arraylist là chuỗi tên.
	// Yêu cầu viết hàm search nhập vào một chuỗi và in ra các chuỗi có chứa chuỗi
	// con nhập vào

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Khai bao ArrayList chua ten
		ArrayList<String> listOfName = new ArrayList<>();

		// Menu nhap ten (so luong tuy y)
		while (true) {
			System.out.println("-----Menu-----");
			System.out.println("(1) - Them mot ten vao ArrayList");
			System.out.println("(2) - Tim chuoi con trong ArrayList");
			System.out.println("(3) - Thoat chuong trinh");
			System.out.print("Nhap lua chon cua ban: ");
			int option = sc.nextInt();
			sc.nextLine();

			switch (option) {
			case 1:
				System.out.print("Nhap ten: ");
				listOfName.add(sc.nextLine());
				break;
			case 2:
				System.out.print("Nhap chuoi can tim: ");
				searchSubString(listOfName, sc.nextLine());
				break;
			case 3:
				System.out.println("------Ket thuc chuong trinh-------");
				return;
			default:
				System.out.println("Lua chon khong hop le! Vui long nhap lai.");
			}

		}
	}

	public static void searchSubString(ArrayList<String> listOfName, String subString) {
		for (int index = 0; index < listOfName.size(); index++)
			if (listOfName.get(index).contains(subString))
				System.out.println("Ket qua tim kiem " + (index +1) + ": " + listOfName.get(index));
	}

}
