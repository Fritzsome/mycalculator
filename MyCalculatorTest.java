import java.util.Scanner;

import junit.framework.Assert;

import org.junit.Test;


public class MyCalculatorTest {

	private Scanner sc;
	@Test
	public void add() {
		System.out.println("ADDITION");

		sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		float x = (float)(sc.nextFloat());
		System.out.println("Enter second number");
		float y = (float)(sc.nextFloat());
		System.out.println("Enter expected output");
		float expectedSum = (float)(sc.nextFloat());
		float sum = (float)MyCalculator.add(x,y);
		Assert.assertEquals(expectedSum, sum); // true
		System.out.println(x+" plus "+y+" is"+" equal to "+sum);
	}
	@Test
	public void subtract() {
		System.out.println("SUBTRACTION");

		sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		float x = (float)(sc.nextFloat());
		System.out.println("Enter second number");
		float y = (float)(sc.nextFloat());
		System.out.println("Enter expected output");
		float expectedDiff = (float)(sc.nextFloat());
		float diff = (float)MyCalculator.subtract(x,y);
		Assert.assertEquals(expectedDiff, diff); // true
		System.out.println(x+" minus "+y+" is"+" equal to "+diff);	
	}
	@Test
	public void multiply() {
		System.out.println("MULTIPLICATION");

		sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		float x = (float)(sc.nextFloat());
		System.out.println("Enter second number");
		float y = (float)(sc.nextFloat());
		System.out.println("Enter expected output");
		float expectedProd = (float)(sc.nextFloat());
		float product = (float)MyCalculator.multiply(x,y);
		Assert.assertEquals(expectedProd, product); // true
		System.out.println(x+" times "+y+" is"+" equal to "+product);	
	}
	@Test
	public void divide() {
		System.out.println("DIVISION");

		sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		float x = (float)(sc.nextFloat());
		System.out.println("Enter second number");
		float y = (float)(sc.nextFloat());
		System.out.println("Enter expected output");
		float expectedQuot = (float)(sc.nextFloat());
		float quotient = (float)MyCalculator.divide(x,y);
		Assert.assertEquals(expectedQuot, quotient); // true
		System.out.println(x+" divided by "+y+" is"+" equal to "+quotient);	
	}
	@Test
	public void square() {
		System.out.println("SQUARE");

		sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		float x = (float)(sc.nextFloat());
		System.out.println("Enter expected output");
		float expectedSquared = (float)(sc.nextFloat());
		float squared = (float)MyCalculator.square(x);
		Assert.assertEquals(expectedSquared, squared); // true
		System.out.println(x+" squared is equal to "+squared);	
	}
	@Test
	public void cube() {
		System.out.println("CUBE");

		sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		float x = (float)(sc.nextFloat());
		System.out.println("Enter expected output");
		float expectedCubed = (float)(sc.nextFloat());
		float cubed = (float)MyCalculator.cube(x);
		Assert.assertEquals(expectedCubed, cubed); // true
		System.out.println(x+" cubed is equal to "+cubed);	
	}
	@Test
	public void nfactorial() {
		System.out.println("N-FACTORIAL");

		sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = (int)(sc.nextInt());
		System.out.println("Enter expected output");
		int expectedFactorial = (int)(sc.nextInt());
		int fact = (int)MyCalculator.nfactorial(x);
		Assert.assertEquals("The answer shoud be "+expectedFactorial,expectedFactorial, fact); // true
	}
	@Test
	public void binarySearch(){
		System.out.println("BINARY SEARCH ALGORITHM");

		sc = new Scanner(System.in);
		System.out.println("Enter the number of integers in an array:");
		int x = (int)(sc.nextInt());
		int array[] = new int[x];
		
		for(int i=0; i<x; i++){
			System.out.println("Enter an element of the array:");
			int element = (int)(sc.nextInt());
			array[i] = element;
		}
		
		System.out.println("Enter the number to be found():");
		int findelement = (int)(sc.nextInt());
		System.out.println("Enter expected index to appear:");
		int expectedIndex = (int)(sc.nextInt());
		int index = (int)MyCalculator.binarySearch(array, findelement);
		Assert.assertEquals(expectedIndex, index); // true
		System.out.println(findelement+" is at index "+index);	

	}
}
