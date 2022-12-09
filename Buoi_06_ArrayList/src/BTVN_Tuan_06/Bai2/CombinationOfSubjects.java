package BTVN_Tuan_06.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class CombinationOfSubjects {
	// Constants
	public static final ArrayList<String> A00 = new ArrayList<>();
	public static final ArrayList<String> B00 = new ArrayList<>();
	public static final ArrayList<String> C00 = new ArrayList<>();
	
	// Static block
	static {
		A00.add("Toan");
		A00.add("Ly");
		A00.add("Hoa");
		
		B00.add("Toan");
		B00.add("Hoa");
		B00.add("Sinh");
		
		C00.add("Van");
		C00.add("Su");
		C00.add("Dia");
	}
	
	// Object's properties
	private String subjectOne;
	private String subjectTwo;
	private String subjectThree;
	
	// Constructor methods
	public CombinationOfSubjects() {
		this("Unknown", "Unknown", "Unknown");
	}
	
	public CombinationOfSubjects(String subjectOne, String subjectTwo, String subjectThree) {
		this.subjectOne = subjectOne;
		this.subjectTwo = subjectTwo;
		this.subjectThree = subjectThree;
	}

	// Getter and Setter methods
	public String getSubjectOne() {
		return subjectOne;
	}

	public void setSubjectOne(String subjectOne) {
		this.subjectOne = subjectOne;
	}

	public String getSubjectTwo() {
		return subjectTwo;
	}

	public void setSubjectTwo(String subjectTwo) {
		this.subjectTwo = subjectTwo;
	}

	public String getSubjectThree() {
		return subjectThree;
	}

	public void setSubjectThree(String subjectThree) {
		this.subjectThree = subjectThree;
	}
	
	// Other methods
	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s", getSubjectOne(), getSubjectTwo(), getSubjectThree());
	}
	
	public String getKhoiThi() {
		String khoiThi = "Unknown";
		
		if(A00.contains(subjectOne) && A00.contains(subjectTwo) && A00.contains(subjectThree))
			khoiThi = "A";
		if(B00.contains(subjectOne) && B00.contains(subjectTwo) && B00.contains(subjectThree))
			khoiThi = "B";
		if(C00.contains(subjectOne) && C00.contains(subjectTwo) && C00.contains(subjectThree))
			khoiThi = "C";
		
		return String.format("%-10s", khoiThi);
	}
	
	public void setKhoiThi() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap mon thi thu nhat: ");
		setSubjectOne(sc.nextLine());
		
		System.out.println("Nhap mon thi thu hai: ");
		setSubjectTwo(sc.nextLine());
		
		System.out.println("Nhap mon thi thu ba: ");
		setSubjectThree(sc.nextLine());
	}
	
}
