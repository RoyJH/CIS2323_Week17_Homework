import genre.*;

public class UseBook {

	public static void main(String[] args) {
		System.out.println("Hi, is this thing on!?");
		NonFiction Science = new NonFiction("How it's did.");
		Fiction Mysterium = new Fiction("The Coder Games");
		
		Science.printBook();
		Mysterium.printBook();
		//NonFiction Book = new NonFiction("this");
	}

}
