package genre;
public abstract class Book {
	public String Title;
	public double Price;

	
		public abstract void setPrice();
		
		public double getPrice(){
			return Price;
		}
		
		public String getTitle(){
			return Title;
		}
		
		public void setTitle(String t) {
			Title = t;
		}
		
		public Book() {
			//System.out.println("inside default constructor");
			this.getPrice();
			this.getTitle();
		}
		
		public Book(String title){
		
			this.getPrice();
			//System.out.println("inside title constructor");
		}
		
		
}
