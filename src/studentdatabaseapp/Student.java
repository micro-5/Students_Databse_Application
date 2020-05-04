package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private static int courseCost = 600;
	private static int id = 1000;
	private String studentId;
	private String courses = "";
	private int tutionBalance = 0;
	
	//constructor that will take name and year of the student
	public Student() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Student's First Name : ");
		this.firstName = scanner.nextLine();
		
		System.out.print("Enter Student's Last Name : ");
		this.lastName = scanner.nextLine();
		
		System.out.print("Student's Grade Level\n1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Final\nEnter Grade Level : ");
		this.gradeYear = scanner.nextInt();
		
		setStudentId();
		
//		System.out.println(this.firstName + " " + this.lastName + " "+this.gradeYear + " " + this.studentId);
		
	}
	
	//setting a unique id for each student
	private void setStudentId() {
		id++;
		this.studentId = gradeYear + "" + id;
	}
	
	//enrolling student to courses
	public void enroll() {
		do {
			System.out.print("Enter Course to enroll (Q to quit) : ");
			Scanner scanner = new Scanner(System.in);
			String course = scanner.nextLine();
			
			if(!course.equals("Q")) {
				courses = courses + "\n " + course;
				tutionBalance += courseCost;
			}
			else
			{
				break;
			}
		}while(true);
//		System.out.println("Enrolled In : " + courses);
//		System.out.println("Tution Balance : " + tutionBalance);
	}
	
	//view balance
	public void viewBalance() {
		System.out.println("Your balance is : $" + tutionBalance);
	}
	
	//payment
	public void payTution() {
		viewBalance();
		System.out.print("Enter the payment : $");
		Scanner scanner = new Scanner(System.in);
		int payment = scanner.nextInt();
		this.tutionBalance -= payment;
		System.out.println("Thank you for your payment of : $" + payment);
		viewBalance();
	}
	
	//show Information
	public String toString() {
		return "Name : " + firstName + " " + lastName +
				"\nGrade Level : " + gradeYear + 
				"\nStudent ID : "+studentId+
				"\nCourses Enrolled : "+courses +
				"\nBalance : $"+tutionBalance;
	}

}
