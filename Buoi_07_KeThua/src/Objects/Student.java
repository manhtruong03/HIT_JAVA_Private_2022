package Objects;

import java.util.Scanner;

public class Student extends Person {
	// Object's properties
	private int stu_id;
	private String stu_class;
	
	// Constructor
	public Student() {
		
	}
	
	public Student(int stu_id, String stu_class) {
		super();
		this.stu_id = stu_id;
		this.stu_class = stu_class;
	}
	
	// Getter and Setter methods
	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	public String getStu_class() {
		return stu_class;
	}

	public void setStu_class(String stu_class) {
		this.stu_class = stu_class;
	}
	
	// Other methods
	@Override
	public String toString() {
		return String.format("%-10d %-20s", getStu_id(), getClass());
	}

	@Override
	public void input() {
		super.input();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ma sv: ");
		setStu_id(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Nhap lop: ");
		setStu_class(sc.nextLine());
	}
	
	public void output() {
		
	}
	
	public static void main(String[] args) {
		Student a = new Student();
		a.input();
		System.out.println(a);
	}
	
}
