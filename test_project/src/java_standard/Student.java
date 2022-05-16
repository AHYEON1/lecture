package java_standard;

import java.util.*;

public class Student {
 public	static void main(String[] args) { 
	 Scanner sc = new Scanner(System.in);
   System.out.println(sw_class.name); 
     String name; 
     System.out.println("학생의 이름은?");
     name =sc.next(); 
     System.out.println(name);
	}

	static class sw_class { 
		
		static String name ="이아연";
		int studentID = 2;
		String address ="대전시";

		public String getname() {
			return name;

		}

		public int get_studentID() {
			return studentID;
		} 
		
		public String get_address() {
			return address;
		} 
		
	} 
	

}
