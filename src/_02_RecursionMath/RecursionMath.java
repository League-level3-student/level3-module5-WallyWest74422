package _02_RecursionMath;

public class RecursionMath {

	public static int recursiveMultiplication(int number, int times) {
		// If times is 1
		// Return number
		if (times == 1) {
			return number;
		} else {
			return (number + recursiveMultiplication(number, times - 1));
		}
		// Else return number + recursiveMultiplication(number, times-1)
	}

	// Try this one on your own!
	// Hint: if numberToDivideBy is bigger than number,
	// you can't divide anymore
	public static int recursiveDivision(int number, int numberToDivideBy) {
		if(numberToDivideBy>number) {
			return 0;
		} 
		if(numberToDivideBy == 1) {
        	return number;
        }else {
        	return(1 + recursiveDivision(number-numberToDivideBy, numberToDivideBy));       	
        }
    }

	// Try this one on your own!
	public static int recursivePower(int number, int power) {

		return 0;
	}
}
