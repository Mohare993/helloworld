package helloworld;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello world to the standard out");
		
		
		Account test = new Account(2,"Bob","D");
		System.out.print(test);
		
		JavaMap tastmap = new JavaMap();
		
		System.out.print(tastmap);
		
	
		tastmap.createAccount(2334, "bill", "fgdgs");

		System.out.print(tastmap);
	
		
	}

}
