package arrayEample;

public class Book4 {
		String bookName;
		String author;  

		public Book4(String bookName,String author) {
			this.bookName =bookName;
			this.author = author;
		}
		
		public void setBookName(String bookName) {
			this.bookName =bookName;
		}
		
		public void setAuthor(String author) {
			this.author =author;
		}
		
		public String getbookName() {
			return this.bookName;
		}
		
		public String getAuthor() {
			return this.author;
		} 
		
		public void showinfo() {
			System.out.println(bookName);
			System.out.println(author);
			
		} 
		

		
		

	}

