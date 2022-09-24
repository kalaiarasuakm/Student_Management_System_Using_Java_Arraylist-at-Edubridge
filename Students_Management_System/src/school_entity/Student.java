package school_entity;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Student implements Person{
	private int rollno;
	private String name;
	private String father_name;
	private String Department;
	private String mobileno;
	
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public String getFather_name() {
		return father_name;
	}
	public String getDepartment() {
		return Department;
	}
	public String getMobileno() {
		return mobileno;
	}
	
	public String toString() {
		return "The Student rollno is:" + rollno +
				"The Student name is:" + name +
				"The Student's father name is:" + father_name +
				"The Student's Department is: "+ Department +
				"The Student's mobileno is: "+ mobileno;
	}
	
	Student(int rollno,String name,String father_name,String Department,String mobileno){
		this.rollno = rollno;
		this.name = name;
		this.father_name = father_name;
		this.Department = Department;
		this.mobileno = mobileno;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	Scanner read = new Scanner(System.in);
	// Initializing the arraylist
	ArrayList<Student> st = new ArrayList<Student>();
	@Override
	public void insert() {
		System.out.println("Enter the rollno");
		rollno = read.nextInt();
		System.out.println("Enter the name ");
		name = read.next();
		System.out.println("Enter the Student's father name ");
		father_name = read.next();
		System.out.println("Enter the Student's department");
		Department = read.next();
		System.out.println("Enter the Student's mobileno");
		mobileno = read.next();
		st.add(new Student(rollno,name,father_name,Department,mobileno));
	}
	@Override
	public void display() {
		Iterator<Student> it = st.iterator();
		while(it.hasNext()) {
			Student su = it.next();
			System.out.println(su);
		}
	}
	
	public void searchbyrollno() {
		System.out.println("Enter the rollno");
		int rollno = read.nextInt();
		Iterator<Student> iu = st.iterator();
		while(iu.hasNext()) {
			Student sd = iu.next();
			if(sd.getRollno() == rollno) {
				System.out.println(sd);
			}
			else {
				System.out.println("There is no such student record");
			}
		}
	}
	public void searchbyname() {
		System.out.println("Enter the Student name");
		String name = read.next();
		Iterator<Student> is = st.iterator();
		while(is.hasNext()) {
			Student se = is.next();
			if(se.getName().equals(name)) {
				System.out.println(se);
			}
			else {
				System.out.println("There is no such student recor");
			}
		}
	}
	
	public void searchbymobileno() {
		System.out.println("Enter the Student's mobileno");
		String mobileno = read.next();
		Iterator<Student> is = st.iterator();
		while(is.hasNext()) {
			Student sn = is.next();
			if(sn.getMobileno().equals(mobileno)) {
				System.out.println(sn);
			}
			else {
				System.out.println("There is no such Student record");
			}
		}
	}

}