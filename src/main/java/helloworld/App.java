package helloworld;

import Util.GensonUtil;
import Util.JSONUtil;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello world to the standard out");
		
		JSONUtil json = new JSONUtil();
		GensonUtil json1 = new GensonUtil();
		
		Account test = new Account("adc123", "Scoot", "Pacino");
		
		
		System.out.println(json1.getJSONForObject(test));
		
		
	
		
	}

}
