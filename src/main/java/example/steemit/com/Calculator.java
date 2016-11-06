package example.steemit.com;

public class Calculator {
	public static int add(int numberOne, int numberTwo) {
		return numberOne + numberTwo;
	}
	
	public static int add(double numberOne, double numberTwo) {
		return (int)(numberOne + numberTwo);
	}
}
