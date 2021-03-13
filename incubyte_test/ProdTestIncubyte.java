package incubyte_test;

public class ProdTestIncubyte {
	public int Add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;
		}
		else if (numbers.length() > 1) {
			String[] num = numbers.split(",");
			return Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
		}
		else {
			return Integer.parseInt(numbers);	
		}
		
	}
}
