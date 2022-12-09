package BTVN_Tuan_06.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai_03_02 {

    public static void main(String[] args) {
	ArrayList<Student> stu = new ArrayList<>();
	MENU(stu);
    }

    // MENU
    public static void MENU(ArrayList<Student> stu) {
	Scanner sc = new Scanner(System.in);

	while (true) {
	    System.out.println("-------------MENU-------------");
	    System.out.println("(1) - Them moi sinh vien.");
	    System.out.println("(2) - Hien thi thong tin sv va khoi thi cua thi sinh.");
	    System.out.println("(3) - Tim theo so bao danh.");
	    System.out.println("(4) - Thoat khoi chuong trinh.");
	    System.out.print("Nhap lua chon cua ban: ");
	    int option = sc.nextInt();
	    sc.nextLine();

	    switch (option) {
	    case 1:
		stu.add(Student.input());
		System.out.println("Them moi sinh vien thanh cong!");
		break;
	    case 2:
		output(stu);
		break;
	    case 3:
		findByID(stu);
		break;
	    case 4:
		return;
	    default:
		System.out.println("Lua chon khong hop le. Vui long nhap lai!");
	    }
	}
    }

    // XUAT thong tin va khoi thi cac sinh vien trong danh sach
    public static void output(ArrayList<Student> stu) {
	System.out.printf("%-10s %-10s %-30s %-40s %-10s \n", "STT", "Ma SV", "Ho ten", "Dia chi", "Khoi thi");
	for (int i = 0; i < stu.size(); i++) {
	    System.out.printf("%-10d", (i + 1));
	    System.out.println(stu.get(i));
	}
    }

    // TIM KIEM THEO SO BAO DANH
    public static void findByID(ArrayList<Student> stu) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Nhap ma sinh vien can tim: ");
	int maSV = sc.nextInt();
	sc.nextLine();

	for (int i = 0; i < stu.size(); i++) {
	    if (stu.get(i).getStudent_id() == maSV) {
		stu.get(i).output();
		return;
	    }
	}
	System.out.println("Khong tim thay sinh vien co so bao danh " + maSV);
    }

}
