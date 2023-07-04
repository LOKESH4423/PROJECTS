import java.util.*;
public class studentComparator implements Comparator<Student> {
	private String field;
	public studentComparator(String field) {
		this.field=field;
	}
	@Override
	public int compare(Student s1,Student s2) {
		switch(field) {
		case "name":
			return s1.getName().compareTo(s2.getName());
		case "ID":
			return s1.getId().compareTo(s2.getId());
		case "CGPA":
			return (int)s1.getCGPA()-(int)s2.getCGPA();
		case "email":
			return s1.getEmail().compareTo(s2.getEmail());
		case "age":
			return s1.getage()-s2.getage();
		}
		return 0;
	}
}
