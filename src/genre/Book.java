package genre;
public abstract class Book {
	public String Title;
	public double Price;

	
		public  abstract void setPrice();
		
		public double getPrice(){
			return Price;
		}
		
		public String getTitle(){
			return Title;
		}
		
		public void setTitle(String title) {
			Title = title;
		}
		
		public Book() {
			System.out.println("inside default constructor");
			//this.Title = title;
			//this.Price = price;
		}
		
		public Book(String title){
		
			getPrice();
			System.out.println("inside title constructor");
		}
		
		
}
