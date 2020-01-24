import genre.*;

public class UseBook {

	public static void main(String[] args) {
		System.out.println("Hi, is this thing on!?");
		Fiction Mysterium = new Fiction("The Coder Games");
		NonFiction Science = new NonFiction("How it's did.");
		
		Science.printBook();
		Mysterium.printBook();
		//NonFiction Book = new NonFiction("this");
	}

}
