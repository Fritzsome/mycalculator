/**
 * Author: Kristine Elaine P. Bautista
 * Program Description: Calculator of Simple Mathematical Functions
**/

public class MyCalculator {
	// add two numbers
	public static float add(float a,float b){
		return a+b;
	}
	
	// subtract two numbers
	public static float subtract(float a,float b){
		return a-b;
	}
	
	// multiply two numbers
	public static float multiply(float a,float b){
		return a*b;
	}
	
	// divide two numbers
	public static float divide(float a,float b){
		return a/b;
	}
	
	// x^2 of two numbers
	public static float square(int x){
		return x*x;
	}
	
	// x^3 of three numbers
	public static float cube(int x){
		return x*x*x;
	}
	
	// n! of an integer
	public static int nfactorial(int n){
		int factorial = 1;
		
		for(int i=1;i<=n;i++)//it should be i<=n
			factorial *= i;
		
		return factorial;
	}
	
	// binary search in an array
	static int binarySearch(int[] a,int x){
		int n = a.length; // get number of elements in the array
		int lower, upper, middle; // variables for positions in the array
		lower = 0; upper = n-1; // initialize values of lower and upper points
		
		while(lower<=upper){
			middle = (lower+upper)/2;
			if(x>a[middle]) lower = middle + 1;
			else if(x<a[middle]) upper = middle - 1;
			else return middle;
		}
		
		return 1;
	}
	
}
