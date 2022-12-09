package Objects;

import java.util.Scanner;

public class Person {
	// Object's properties
	private String name;
	private int age;

	// Constructor
	Person() {

	}

	// Getter and Setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Other methods
	@Override
	public String toString() {
		return String.format("%-30s %-10d", getName(), getAge());
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap Ten: ");
		setName(sc.nextLine());
		
		System.out.println("Nhap tuoi: ");
		setAge(sc.nextInt());
		sc.nextLine();
	}
}
