package genre;
public class Fiction extends Book {
	
	public void setPrice(){
		Price = 32.99;
	}
		
	public Fiction(){}
	
	public Fiction(String t){
		//Fiction fic = new Fiction();
		this.setPrice();
		this.getPrice();
		this.setTitle(t);
	}
	
	public void printBook() {
		System.out.print("Book type: " + Title +" ");
		System.out.print("Book Price: " + Price+"\n");
	}
}
