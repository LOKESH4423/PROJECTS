public class Student {
	private String ID;
	private String name;
	private int age;
	private double CGPA;
	private String email;
	
	public Student(String ID,String name,int age,double CGPA,String email) {
		this.ID=ID;
		this.name=name;
		this.age=age;
		this.CGPA=CGPA;
		this.email=email;
	}
	public String getId() {
		return this.ID;
	}
	public String getName() {
		return this.name;
	}
	public int getage() {
		return this.age;
	}
	public double getCGPA() {
		return this.CGPA;
	}
	public String getEmail() {
		return this.email;
	}
	public String print() {
		return "ID : " + ID+"\nName : "+name+"\nAge : "+age+"\nCGPA : "+CGPA+"\nEmail : "+email;
	}
}
