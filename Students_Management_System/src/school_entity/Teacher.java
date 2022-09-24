package school_entity;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Teacher implements Person{
	private int empid;
	private String name;
	private String job_position;
	private String Department;
	private String mobileno;
	
	public int getempid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public String getJob_position() {
		return job_position;
	}
	public String getDepartment() {
		return Department;
	}
	public String getMobileno() {
		return mobileno;
	}
	
	public String toString() {
		return "The Teacher empid is:" + empid +
				"The Teacher name is:" + name +
				"The Teacher's father name is:" + job_position +
				"The Teacher's Department is: "+ Department +
				"The Teacher's mobileno is: "+ mobileno;
	}
	
	Teacher(int empid,String name,String job_position,String Department,String mobileno){
		this.empid = empid;
		this.name = name;
		this.job_position = job_position;
		this.Department = Department;
		this.mobileno = mobileno;
	}
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	Scanner read = new Scanner(System.in);
	// Initializing the arraylist
	ArrayList<Teacher> st = new ArrayList<Teacher>();
	@Override
	public void insert() {
		System.out.println("Enter the empid");
		empid = read.nextInt();
		System.out.println("Enter the name ");
		name = read.next();
		System.out.println("Enter the Teacher's father name ");
		job_position = read.next();
		System.out.println("Enter the Teacher's department");
		Department = read.next();
		System.out.println("Enter the Teacher's mobileno");
		mobileno = read.next();
		st.add(new Teacher(empid,name,job_position,Department,mobileno));
	}
	@Override
	public void display() {
		Iterator<Teacher> it = st.iterator();
		while(it.hasNext()) {
			Teacher su = it.next();
			System.out.println(su);
		}
	}
	
	public void searchbyempid() {
		System.out.println("Enter the empid");
		int empid = read.nextInt();
		Iterator<Teacher> iu = st.iterator();
		while(iu.hasNext()) {
			Teacher tr = iu.next();
			if(tr.getempid() == empid) {
				System.out.println(tr);
			}
			else {
				System.out.println("There is no such Teacher record");
			}
		}
	}
	public void searchbyname() {
		System.out.println("Enter the Teacher name");
		String name = read.next();
		Iterator<Teacher> is = st.iterator();
		while(is.hasNext()) {
			Teacher th = is.next();
			if(th.getName().equals(name)) {
				System.out.println(th);
			}
			else {
				System.out.println("There is no such Teacher recor");
			}
		}
	}
	
	public void searchbymobileno() {
		System.out.println("Enter the Teacher's mobileno");
		String mobileno = read.next();
		Iterator<Teacher> is = st.iterator();
		while(is.hasNext()) {
			Teacher tc = is.next();
			if(tc.getMobileno().equals(mobileno)) {
				System.out.println(tc);
			}
			else {
				System.out.println("There is no such Teacher record");
			}
		}
	}

}