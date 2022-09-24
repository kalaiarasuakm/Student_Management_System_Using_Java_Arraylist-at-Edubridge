package school_Manage;
import java.util.Scanner;

public class Menu {
	int studentchoice;
	int teacherchoice;
	
    school_entity.Student s = new school_entity.Student();  //accessing the student class by using qualified name
    school_entity.Teacher td = new school_entity.Teacher(); //accessing the teacher class by using qualified name
	public void option() {
		Scanner read = new Scanner(System.in);
		int con;
		do {
			System.out.println("1.Student");
			System.out.println("2.Teacher");
			System.out.println("3.Exit");
			con = read.nextInt(); // if the user input is zero then do while gets stopped.
			switch(con) {
			case 1: System.out.println("1.Insert the student record");
			        System.out.println("2.view the student record");
			        System.out.println("3.search the student record by rollno");
			        System.out.println("4.search the student record by name");
			        System.out.println("5.search the student record by mobileno");
			        System.out.println("6.exit");
			        studentchoice = read.nextInt();
			        switch(studentchoice) {
			        case 1: s.insert(); // accessing the insert method in student class
			        break;
			        case 2: s.display();  // accessing the display method in student class
			        break;
			        case 3: s.searchbyrollno();  // accessing the searchbyrollno method in student class
			        break;
			        case 4: s.searchbyname();      // accessing the searchbyname method in student class  
			        break;
			        case 5: s.searchbymobileno();  // accessing the searchbymobileno method in student class
			        break;
			        case 6: System.out.println("You didn't choose operation");
			                System.exit(0);
			        break;
			        }
			break;
			case 2: System.out.println("1.Insert the teacher record");
			        System.out.println("2.view the teacher record");
			        System.out.println("3.search the teacher record by empid");
			        System.out.println("4.search the teacher record by name");
		        	System.out.println("5.search the teacher record by mobileno");
		        	System.out.println("6.exit");
		        	teacherchoice = read.nextInt();
		        	switch(teacherchoice) {
		        	case 1 : td.insert();   // accessing the insert method in teacher class
		        	break;
		        	case 2: td.display();    // accessing the display method in teacher class
		        	break;
		        	case 3: td.searchbyempid();   // accessing the searchbyempid in teacher class
		        	break;
		        	case 4: td.searchbyname();    // accessing the searchbyname method in teacher class
		        	break;
		        	case 5: td.searchbymobileno();   // accessing the searchbymobileno method in teacher class
		        	break;
		        	case 6: System.out.println("You didn't choose any operation");
		        	        System.exit(0);
		        	break;
		        	}
		        	break;
			case 3: System.out.println("Exit");
			        System.exit(0);
			break;
			}
		}
		while(con!=0);
	}
}
