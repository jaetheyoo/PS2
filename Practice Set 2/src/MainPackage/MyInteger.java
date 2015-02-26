/**Author: Jae Yoo. Github URL: 
 * In MainPackage: class 'MyInteger' with attribute int 'value'.
 *Methods:
 *A constructor that creates a MyInteger object for the specified int value.
 *A get method that returns the int value.
 *Methods isEven(), isOdd(), and isPrime() that return true if the value is even, odd, or prime, respectively.
 *Static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively.
 *Static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively.
 *Methods equals(int) and equals(MyInteger) that return true if the value in the object is equal to the specified value.
 *A static method parseInt(char[]) that converts an array of numeric characters to an int value. 
 *A static method parseInt(String) that converts a string into an int value. 
 * 
 */

package MainPackage;

public class MyInteger {
	private int value;

	public static void main(String[] args) {
		//testMyInteger{} would go here
	}

	public MyInteger(int newValue) {
		this.value = newValue;
	}

	public int getValue() {
		return this.value;
	}

	public boolean isEven() {
		if (this.value % 2 == 0)
			return true;
		return false;
	}

	public boolean isOdd() {
		if (this.value % 2 != 0)
			return true;
		return false;
	}

	public boolean isPrime() {
		if (this.value % 2 == 0)
			return false;
		for (int i = 3; i * i <= this.value; i += 2)
			// definition of prime number
			if (this.value % i == 0)
				return false;
		return true;
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0)
			return true;
		return false;
	}

	public static boolean isOdd(int value) {
		if (value % 2 != 0)
			return true;
		return false;
	}

	public static boolean isPrime(int value) {
		if (value % 2 == 0)
			return false;
		for (int i = 3; i * i <= value; i += 2)
			// definition of prime number
			if (value % i == 0)
				return false;
		return true;
	}

	public static boolean isEven(MyInteger integer) {
		return integer.isEven();
	}

	public static boolean isOdd(MyInteger integer) {
		return integer.isOdd();
	}

	public boolean equals(int number) {
		return this.value == number;
	}

	public boolean equals(MyInteger integer) {
		if (this.value == integer.value)
			return true;
		return false;
	}
	
	public static int parseInt(char[] chars) {
		return parseInt(new String(chars));
	}
	
	public static int parseInt(String string) {
		return Integer.parseInt(string);
	}
}