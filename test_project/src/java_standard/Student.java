package java_standard;

import java.util.*;

public class Student {
 public	static void main(String[] args) { 
	 Scanner sc = new Scanner(System.in);
   System.out.println(sw_class.name); 
     String name; 
     System.out.println("�л��� �̸���?");
     name =sc.next(); 
     System.out.println(name);
	}

	static class sw_class { 
		
		static String name ="�̾ƿ�";
		int studentID = 2;
		String address ="������";

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
