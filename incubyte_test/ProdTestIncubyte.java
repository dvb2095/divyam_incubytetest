package incubyte_test;

public class ProdTestIncubyte {
	public int Add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;
		}
		else if (numbers.length() > 1) {
			int sum = 0;
			for(int i = 0; i < numbers.length(); i++) {
				char temp = numbers.charAt(i);
				if(Character.isDigit(temp)) {
				int temp2 = Character.getNumericValue(temp);
				sum = sum + temp2;
				}
			}
			return sum;
		}
		else {
			return Integer.parseInt(numbers);	
		}
		
	}
}
