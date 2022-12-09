package BTVN_Tuan_06.Bai2;

import java.util.Scanner;

public class Student {
    // Classes varianle
    public static int countID = 1;

    // Object's properties
    private int student_id;
    private String student_name;
    private String student_address;
    private CombinationOfSubjects student_khoiThi;

    // Constructor
    public Student() {
	this(countID, "Unknown", "Unknown", "Unknown", "Unknown", "Unknown");
    }

    public Student(int student_id, String student_name, String student_address, String subjectOne, String subjectTwo,
	    String subjectThree) {
	this.student_id = student_id;
	this.student_name = student_name;
	this.student_address = student_address;
	this.student_khoiThi = new CombinationOfSubjects(subjectOne, subjectTwo, subjectThree);
	++countID;
    }

    // Getter and Setter methods
    public int getStudent_id() {
	return student_id;
    }

    public void setStudent_id(int student_id) {
	this.student_id = student_id;
    }

    public String getStudent_name() {
	return student_name;
    }

    public void setStudent_name(String student_name) {
	this.student_name = student_name;
    }

    public String getStudent_address() {
	return student_address;
    }

    public void setStudent_address(String student_address) {
	this.student_address = student_address;
    }

    public String getStudent_khoiThi() {
	return student_khoiThi.getKhoiThi();
    }

    public void setStudent_khoiThi(CombinationOfSubjects student_khoiThi) {
	this.student_khoiThi = student_khoiThi;
    }

    //
    public void setStudent_khoiThi() {
	this.student_khoiThi.setKhoiThi();
    }

    // Other methods
    @Override
    public String toString() {
	return String.format("%-10d %-30s %-40s %-10s", getStudent_id(), getStudent_name(), getStudent_address(),
		getStudent_khoiThi());
    }

    // Nhap thong tin sinh vien
    public static Student input() {
	Scanner sc = new Scanner(System.in);
	Student sv = new Student();

	System.out.println("Nhap thong tin sinh vien: ");
	System.out.print("Ma sv: ");
	sv.setStudent_id(sc.nextInt());
	sc.nextLine();

	System.out.print("Ho ten: ");
	sv.setStudent_name(sc.nextLine());

	System.out.print("Dia chi: ");
	sv.setStudent_address(sc.nextLine());

	// Khoi thi
	sv.setStudent_khoiThi();

	return sv;
    }

    // Xuat thong tin sinh vien
    public void output() {
	System.out.printf("%-10s %-30s %-40s %-10s \n", "STT", "Ma SV", "Ho ten", "Dia chi", "Khoi thi");
	System.out.println(toString());
    }

}
