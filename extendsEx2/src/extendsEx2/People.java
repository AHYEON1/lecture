package extendsEx2;

public class People { 
	public String name;  
	public int age;
	public int high; 
	public String home; 
    
    
   public People(String name, int age, int high, String home) {
	   System.out.println("������ ȣ��");
	
   this.name = name;
   this.age = age;
   this.high = high;
   this.home = home;
   } 
   
    
   //set ���� �ִ°� 
    
    public void setname(String name) { //
    	this.name =name;
    }
    
    public void setage(int age) {
    	this.age = age; 
    }
    
    public void sethigh(int high) {
    	this.high = high;
    } 
    
    public void sethome(String home) {
    	this.home = home;
    }
    
    //get ���� ���� �������°�  
    
    public String getname() {
    	return name;
    }
    
    public int getage() {
    	return age;
    } 
    
    public int gethigh() {
    	return high;
    }
    
    public String gethome() {
    	return home;
    }
    
    //showinfo 
    
    public void showinfo() {
    	System.out.println(name);
    	System.out.println(name+" "+age+" " +high+" "+home);
    	
    }
    
    public void print() {
		System.out.println("�̸�:"+name+"����:"+age+"Ű:"+high+"��"+home);
	}
   
   
}


