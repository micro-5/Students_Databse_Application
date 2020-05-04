package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// ask how many student will be there
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the no of students you want to enroll : ");
		int numOfStudents = scanner.nextInt();
		
		
		//create n no of students
		Student[] students = new Student[numOfStudents];
		for(int i =0 ; i<numOfStudents; i++)
		{
			students[i] = new Student();
			students[i].enroll();
			students[i].payTution();
		}
		for(int i = 0; i<numOfStudents; i++)
		{
			System.out.println(students[i].toString());
		}

	}

}
