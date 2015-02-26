/**Author: Jae Yoo. Github URL: https://github.com/zenithrising/PS2.git
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
	
	public MyInteger(int newValue) {
		this.value = newValue;
	}
	
/* main method that tests various methods in class MyInteger
	public static void main(String[] args) {
		MyInteger a = new MyInteger(5);
		MyInteger b = new MyInteger(6);
		System.out.println(isPrime(a));
		System.out.println(isPrime(b));
		System.out.println(isOdd(a));
		System.out.println(isEven(b));
		System.out.println(a.equals(5));
		System.out.println(a.equals(2));
		System.out.println(a.equals(b));
		char[] Array = {'1', '5', '3'};
		System.out.println(parseInt(Array));
		System.out.println(parseInt("5"));
	}
*/
	public int getValue() {
		return this.value;
	}

	public boolean isEven() {
		return isEven(this.value);
	}

	public boolean isOdd() {
		return isOdd(this.value);
	}

	public boolean isPrime() {
		return isPrime(this.value);
	}

	public static boolean isEven(int value) {
		return value % 2 == 0;
	}

	public static boolean isOdd(int value) {
		return value % 2 != 0;
	}

	public static boolean isPrime(int value) {
		if (value % 2 == 0)
			return false;
		for (int i = 3; i * i <= value; i += 2)
			// one of the theorems for primality
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

	public static boolean isPrime(MyInteger integer) {
		return integer.isPrime();
	}

	public boolean equals(int number) {
		return this.value == number;
	}

	public boolean equals(MyInteger integer) {
		return this.value == integer.value;
	}

	public static int parseInt(char[] chars) {
		return parseInt(new String(chars));
	}

	public static int parseInt(String string) {
		return Integer.parseInt(string);
	}
}