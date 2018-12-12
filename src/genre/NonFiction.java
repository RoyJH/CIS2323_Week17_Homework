package genre;
public class NonFiction extends Book {
	
	public void setPrice(){
		Price = 37.99;
	}
	
	public NonFiction() {}
	
	public NonFiction(String title){
		NonFiction non = new NonFiction();
		non.getPrice();
	}
	
	public void printBook() {
		System.out.print("Book type: " + Title);
		System.out.print("Book Price: " + Price+"\n");
	}
	
	
}