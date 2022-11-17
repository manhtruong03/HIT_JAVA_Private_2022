package BTVN_Buoi_05.Objects;

import java.util.Scanner;

public class Employee1 {

	// Classes' variables
	public static int id = 0;

	// Object's properties
	private String name;
	private String typeOfEmployee;
	private int workingDay;
	private int startYear;
	private double salary;
	private double allowance;

	// Constructor methods
	public Employee1() {
		this("Unknown name", "Unknown type", 0, 0);
	}

	public Employee1(String name, String typeOfEmployee, int workingDay, int startYear) {
		++id;
		this.name = name;
		this.typeOfEmployee = typeOfEmployee;
		this.workingDay = workingDay;
		this.startYear = startYear;
		salary = 0;
		allowance = 0;
	}

	// Getter and Setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeOfEmployee() {
		return typeOfEmployee;
	}

	public void setTypeOfEmployee(String typeOfEmployee) {
		this.typeOfEmployee = typeOfEmployee;
	}

	public int getWorkingDay() {
		return workingDay;
	}

	public void setWorkingDay(int workingDay) {
		this.workingDay = workingDay;
	}

	public int getStartYear() {
		return startYear;
	}

	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary() {
		double wage = typeOfEmployee.equals("San xuat") ? 350_000 : 400_000;
		salary = wage * workingDay;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance() {
		double bonus = (2022 - startYear) * 200_000;
		allowance = 100_000 + bonus;
	}

	// Other methods
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		setName(sc.nextLine());

		System.out.print("Type of Employee: ");
		setTypeOfEmployee(sc.nextLine());

		System.out.print("Number of working days: ");
		setWorkingDay(sc.nextInt());

		System.out.print("Start year: ");
		setStartYear(sc.nextInt());
		
		setSalary();
		setAllowance();
	}
	
	public double getTotal() {
		return salary + allowance;
	}

	public void output() {
		System.out.printf("%-10d %-35s %-20s %-15d %-15d %-25.2f %-25.2f %-25.2f\n",
				id, name, typeOfEmployee, workingDay, startYear, salary, allowance, getTotal());
		
	}
}
