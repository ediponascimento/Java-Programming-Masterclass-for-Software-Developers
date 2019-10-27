public class ByteDataType {

	public static void main(String[] args) {


		/**

			Byte: The byte data type is an 8-bits sigend two's complement integer. The byte data type is useful for saving memory in large arrays.

			-> Size: 8-bit
			-> Value - 127 to 127

		*/

		// A Java program to demonstrate byte data type in Java

		byte by = 126;

		// bit is 8 bit value
		System.out.println(by);

		by++;
		System.out.println(by);

		// It overflows here because 
		// byte can hold values from -128 to 127
		by++;
		System.out.println(by); // it will show -128

		// Looping back within the range
		by++;
		System.out.println(by); // -127

		// output
		// 126
		// 127
		// -128
		// -127

	}

}