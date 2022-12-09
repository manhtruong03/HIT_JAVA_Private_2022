package BTVN_Tuan_06.Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai_03_03 {
    // Run main
    public static void main(String[] args) {
	ArrayList<HocSinh> danhSachHocSinh = new ArrayList<>();
	MENU(danhSachHocSinh);
    }

    // MENU
    public static void MENU(ArrayList<HocSinh> danhSachHocSinh) {
	Scanner sc = new Scanner(System.in);
	while (true) {
	    System.out.println("------MENU--------");
	    System.out.println("(1) - Them moi hoc sinh");
	    System.out.println("(2) - Xuat ra thong tin cac hoc sinh");
	    System.out.println("(3) - Xuat ra thong tin hoc sinh tai vi tri X");
	    System.out.println("(4) - Hien thi cac hoc sinh 20 tuoi");
	    System.out.println("(5) - Cho biet so luong cac hoc sinh co tuoi la 23 va que o DN");
	    System.out.println("(6) - Sap xep hoc sinh tang dan theo que quan");
	    System.out.println("(7) - Ket thuc chuong trinh");
	    System.out.println("Nhap lua chon cua ban: ");
	    int option = sc.nextInt();
	    sc.nextLine();

	    // Kiem tra danh sach trong
	    if (danhSachHocSinh.isEmpty() && option != 1 && option != 7) {
		System.out.println("Danh sach trong!");
		continue;
	    }

	    switch (option) {
	    case 1:
		themHS(danhSachHocSinh);
		break;
	    case 2:
		xuatDanhSach(danhSachHocSinh);
		break;
	    case 3:
		System.out.println("Nhap vi tri hoc sinh can xuat thong tin: ");
		xuatThongTinHocSinh(danhSachHocSinh.get(sc.nextInt()));
		sc.nextLine();
		break;
	    case 4:
		xuatTheoTuoi(danhSachHocSinh, 20);
		break;
	    case 5:
		thongKeTheoTuoiVaQueQuan(danhSachHocSinh, 23, "DN");
		break;
	    case 6:
		sapXepTheoQue(danhSachHocSinh);
		break;
	    case 7:
		System.out.println("-------CHUONG TRINH KET THUC---------");
		return;
	    default:
		System.out.println("Lua chon khong hop le. Vui long nhap lai!");
	    }
	}
    }

    // THEM sinh vien
    public static void themHS(ArrayList<HocSinh> danhSachHocSinh) {
	Scanner sc = new Scanner(System.in);

	HocSinh hocSinh = new HocSinh();
	System.out.println("===Nhap thong tin hoc sinh");
	System.out.println("Nhap ho ten: ");
	hocSinh.setHoTen(sc.nextLine());

	System.out.println("Nhap tuoi: ");
	hocSinh.setTuoi(sc.nextInt());
	sc.nextLine();

	System.out.println("Nhap que quan: ");
	hocSinh.setQueQuan(sc.nextLine());

	danhSachHocSinh.add(hocSinh);
	System.out.println("Them moi hoc sinh thanh cong!");
    }

    // XUAT thong tin moi hoc sinh
    public static void xuatThongTinHocSinh(HocSinh hocSinh) {
	System.out.printf("%-30s %-10s %-30s\n", "Ho ten", "Tuoi", "Que quan");
	System.out.println(hocSinh);
    }

    // XUAT thong tin danh sach hoc sinh
    public static void xuatDanhSach(ArrayList<HocSinh> danhSachHocSinh) {
	System.out.printf("%-10s %-30s %-10s %-30s\n", "STT", "Ho ten", "Tuoi", "Que quan");
	for (int i = 0; i < danhSachHocSinh.size(); i++) {
	    System.out.printf("%-10d", (i + 1));
	    System.out.println(danhSachHocSinh.get(i));
	}
    }

    // XUAT danh sach hoc sinh theo tuoi
    public static void xuatTheoTuoi(ArrayList<HocSinh> danhSachHocSinh, int tuoi) {
	System.out.printf("%-30s %-10s %-30s\n", "Ho ten", "Tuoi", "Que quan");
	for (int i = 0; i < danhSachHocSinh.size(); i++) {
	    if (danhSachHocSinh.get(i).getTuoi() == tuoi) {
		System.out.println(danhSachHocSinh.get(i));
	    }
	}
    }

    // XUAT danh sach + so luong hoc sinh theo tuoi va que quan
    public static void thongKeTheoTuoiVaQueQuan(ArrayList<HocSinh> danhSachHocSinh, int tuoi, String queQuan) {
	int count = 0;
	System.out.printf("%-30s %-10s %-30s\n", "Ho ten", "Tuoi", "Que quan");
	for (int i = 0; i < danhSachHocSinh.size(); i++) {
	    if (danhSachHocSinh.get(i).getTuoi() == tuoi
		    && danhSachHocSinh.get(i).getQueQuan().compareTo(queQuan) == 0) {
		System.out.println(danhSachHocSinh.get(i));
		++count;
	    }
	}
	System.out.println("So luong hoc sinh " + tuoi + " tuoi o " + queQuan + ": " + count);
    }

    // SAP XEP tang dan theo que quan
    public static void sapXepTheoQue(ArrayList<HocSinh> danhSachHocSinh) {
	for (int i = 0; i < danhSachHocSinh.size() - 1; i++) {
	    int m = i;
	    for (int j = i + 1; j < danhSachHocSinh.size(); j++) {
		String queQuan1 = danhSachHocSinh.get(m).getQueQuan();
		String queQuan2 = danhSachHocSinh.get(j).getQueQuan();
		if (queQuan1.compareTo(queQuan2) > 0) {
		    m = j;
		}
	    }

	    if (i != m) {
		HocSinh temp = danhSachHocSinh.get(i);
		danhSachHocSinh.set(i, danhSachHocSinh.get(m));
		danhSachHocSinh.set(m, temp);
	    }
	}
    }

}
