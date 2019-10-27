public class ConditionalStatement {

	public static void main(String[] args) {

		boolean cond = 4 == 3;

		System.out.println(cond);

		// usinf id conditional
		if(4 == 4) {
			System.out.println("Yes, it is true.");
		}

		int age = 28;
		boolean adult = age > 18;
		if(adult) {
			System.out.println("Wow! You're adult.");
		}

		int temperature = 90;

		boolean itsGoinToRain = temperature > 89;

		if(itsGoinToRain) {
			System.out.println("It is goin to rain");
		} else {
			System.out.println("No no, it is not...");
		}

		int loop = 0;

		while(true) {
			System.out.println("Looping " + loop);

			if(loop == 5) {
				break;
			}

			loop++;

			System.out.println("Running");

		}



	}

}