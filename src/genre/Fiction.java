package genre;
public class Fiction extends Book {
	
	public void setPrice(){
		Price = 37.99;
	}
		
	public Fiction(){}
	
	public Fiction(String title){
		Fiction fic = new Fiction();
		fic.getPrice();
	}
	
	public void printBook() {
		System.out.print("Book type: " + Title);
		System.out.print("Book Price: " + Price+"\n");
	}
}
