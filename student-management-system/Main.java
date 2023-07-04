import java.util.*;
import java.util.regex.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Student> students=new ArrayList<>();
	
	private static boolean isValid(String email) {
		String reg="^[a-zA-Z0-9_.-]+@+[a-zA-Z0-9.-]+$";
		Pattern pattern=Pattern.compile(reg);
		Matcher match=pattern.matcher(email);
		return match.find();
	}
	
	private static void addStudent() {
		System.out.print("Enter Student ID : ");
		String ID=sc.nextLine();
		System.out.print("Enter Student Name : ");
		String name=sc.nextLine();
		System.out.print("Enter Student age : ");
		int age=sc.nextInt();
		System.out.print("Enter Student CGPA : ");
		double CGPA=sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter Student email : ");
		String email=sc.nextLine();
		while(true) {
			if(isValid(email)) {
				break;
			}
			System.out.println("Enter a valid Email : ");
			email=sc.nextLine();
		}
		Student s = new Student(ID,name,age,CGPA,email);
		students.add(s);
		System.out.println("Student added Successfully");
	}
	
	private static void searchStudent() {
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		for(int i=0;i<students.size();i++) {
			if(students.get(i).getName().equals(name)) {
				System.out.println(students.get(i).print());
				return;
			}
		}
		System.out.println("Student Not Found");
	}
	
	private static void sortStudent() {
		System.out.print("Enter a field to Sort by (name,ID,email,age,CGPA)");
		String field=sc.nextLine();
		Collections.sort(students,new studentComparator(field));
		
		
	}
	
	public static void viewStudent() {
		if(students.size()==0) {
			System.out.println("students list is empty : ");
			return;
		}
		for(int i=0;i<students.size();i++) {
			System.out.println("\nstudent "+(i+1)+"\n"+students.get(i).print());
		}
	}
	
	public static void deleteStudent() {
		System.out.println("Enter student name : ");
		String name = sc.nextLine();
		for(Student i:students) {
			if(i.getName().equals(name)) {
				students.remove(i);
				break;
			}
		}
	}
	
	public static void main(String args[]) {
		boolean t=true;
		while(t) {
			System.out.print("Enter a command (add,search,sort,view,delete,exit) : ");
			String s=sc.nextLine();
			switch(s) {
				case "add":
					addStudent();
					break;
				case "search":
					searchStudent();
					break;
				case "sort":
					sortStudent();
					break;
				case "view":
					viewStudent();
					break;
				case "delete":
					deleteStudent();
					break;
				case "exit":
					t=false;
					break;
				default:
					System.out.println("Invalid Command");
				
			}
		}
	}
}
