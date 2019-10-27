public class BooleanDataType {

	public static void main(String[] args) {

		int value = 10;

		boolean loop = value > 5;

		System.out.println(loop);

		// using while to compare if value is less than 20
		while(value < 20)
		{
			System.out.println("Hello " + value);

			value = value + 1;
		}


		// using for loop to display data.
		for(int i =0; i < value; i++) 
		{
			System.out.println(i);
		}


		System.out.println(value);

		 
		for(int i=0; i < 5; i++) {
			System.out.println("The value of i is: " + i); // It will turn "I" automaticly into a string..
		}

	}

}