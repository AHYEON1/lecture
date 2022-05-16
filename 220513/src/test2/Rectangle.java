package test2;

public class Rectangle { 
	 int square; 
	int x;
	int y;
	int width; 
	int height;
		 
		
	 
	 public Rectangle(int x, int y, int width, int height) {
		 this.x = x;
		 this.y =y;
		 this.width =width;
		 this.height =height;
		 
	 }
	 
	 public int square() {
		 int sqr1 = width * height;
		 return sqr1;
	 }
	 
	 public void show() {
		 System.out.println("("+x+","+y+")"+"에서 크기가 "+ width +"x"+height+"사각형");
	 } 
	 
	 public boolean contains(Rectangle r) { 
		
		 if(this.x <= r.x && this.y <= r.y) {
			 if( (r.width+r.x) <= (this.width+1) && (r.height+r.y)  <= (this.height+1)) 
			return true; 
		 }
		 return false;
		 } 
	 
	 

	 

		 
		 
	 }
	
   
    
    

