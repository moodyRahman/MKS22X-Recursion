import java.util.ArrayList;

public class Recursion{
/*You may write additional private methods */

/*Recursively find the sqrt using Newton's approximation
 *tolerance is the allowed percent error the squared answer is away from n.
 *precondition: n is non-negative

 */

private static double sqrtiter(double n, double tolerance){
	double guess = n / 2;
	return 0.01;
}



private static double sqrthelp(double inp, double guess, double tolerance){
	if (((guess * guess) / inp) - 1 < tolerance){
		return guess;
	}
	else {
		double better = ((inp / guess) + guess) / 2;
		return sqrthelp(inp, better, tolerance);
	}
}


public static double sqrt(double n, double tolerance){
	double guess = n / 2;
	return sqrthelp(n, guess, tolerance);
}

 /*Recursively find the n'th fibbonaci number in linear time
  *fib(0) = 1; fib(1) = 1; fib(5) = 5
  *precondition: n is non-negative
  */
public static int fib(int n){
	return 5;
}

/*As Per classwork*/
public static ArrayList<Integer> makeAllSums(){
	return new ArrayList<Integer>();
}

public static void main(String[] args) {
	System.out.println(sqrt(100, 0.001));
}

}
