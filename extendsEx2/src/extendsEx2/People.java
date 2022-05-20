package extendsEx2;

public class People { 
	public String name;  
	public int age;
	public int high; 
	public String home; 
    
    
   public People(String name, int age, int high, String home) {
	   System.out.println("생성자 호출");
	
   this.name = name;
   this.age = age;
   this.high = high;
   this.home = home;
   } 
   
    
   //set 값을 주는것 
    
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
    
    //get 받은 값을 가져오는것  
    
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
		System.out.println("이름:"+name+"나이:"+age+"키:"+high+"집"+home);
	}
   
   
}


