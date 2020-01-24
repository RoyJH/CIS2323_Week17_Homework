package genre;
public class NonFiction extends Book {
	
	public void setPrice(){
		Price = 37.99;
	}
	
	public NonFiction() {}
	
	public NonFiction(String t){
		//NonFiction non = new NonFiction();
		this.setPrice();
		this.getPrice();
		this.setTitle(t);
	}
	
	public void printBook() {
		System.out.print("Book type: " + Title + " ");
		System.out.print("Book Price: " + Price+"\n");
	}
	
	
}