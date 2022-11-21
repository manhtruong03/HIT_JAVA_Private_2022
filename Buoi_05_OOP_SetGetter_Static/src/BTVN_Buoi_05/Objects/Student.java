package BTVN_Buoi_05.Objects;

import java.util.Scanner;

public class Student {
	// Constants
	public static final String STUDENT_FULL_NAME = "Unknown Full Name";
	public static final String STUDENT_ADDRESS = "Unknown Address";
	public static final long STUDENT_PHONE_NUMBER = 0;
	public static final float STUDENT_SCORE = 0;
	
	// Classes' variables
	private static int count = 0;
	
	// Object's properties
	private int student_id;
	private String student_full_name;
	private String student_address;
	private long student_phone_number;
	private float student_score;
	
	// Constructor methods
	public Student() {
		this(Student.STUDENT_FULL_NAME, Student.STUDENT_ADDRESS, (long) Student.STUDENT_PHONE_NUMBER, (float) Student.STUDENT_SCORE);
	}
	
	public Student(String student_full_name, String student_address, long student_phone_number, float student_score) {
		this.student_id = ++count;
		this.student_full_name = student_full_name;
		this.student_address = student_address;
		this.student_phone_number = student_phone_number;
		this.student_score = student_score;
	}
	
	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_full_name() {
		return student_full_name;
	}

	public void setStudent_full_name(String student_full_name) {
		this.student_full_name = student_full_name;
	}

	public String getStudent_address() {
		return student_address;
	}

	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}

	public long getStudent_phone_number() {
		return student_phone_number;
	}

	public void setStudent_phone_number(long student_phone_number) {
		this.student_phone_number = student_phone_number;
	}

	public float getStudent_score() {
		return student_score;
	}

	public void setStudent_score(float student_score) {
		this.student_score = student_score;
	}

	// Other methods
	@Override
	public String toString() {
		return getStudent_id() + ", " + getStudent_full_name() + ", " + getStudent_address() + ", " + getStudent_phone_number() + ", " + getStudent_score();
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		String fullName;
		do {
			System.out.println("Full name: ");
			fullName = sc.nextLine();
		} while(!fullName.contains(" "));
		setStudent_full_name(fullName);
		
		System.out.println("Address: ");
		setStudent_address(sc.nextLine());
		
		long phoneNumber;
		do {
			System.out.println("Phone number: ");
			phoneNumber = sc.nextLong();
		} while(phoneNumber < 1_000_000 || 9_999_999 < phoneNumber);
		setStudent_phone_number(phoneNumber);
		
		float score;
		do {
			System.out.println("Score: ");
			score = sc.nextFloat();
		} while(score < 1 || 10 < score);
		setStudent_score(score);
	}
	
	public void output() {
		System.out.printf("%-10d %-30s %-30s %-15d %-10,2f\n", getStudent_id(), getStudent_full_name(), getStudent_address(), getStudent_phone_number(), getStudent_score());
	}
	
	public String getName() {
		int index = student_full_name.lastIndexOf(' ');
		return student_full_name.substring(index + 1);
	}
	
}
