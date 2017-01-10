package ch.bbw;

import java.util.Scanner;

public class CalculatorApp {
	
	public static void main(String[] args) {
		int result;
		
//		Eingabe Zahl1
		System.out.println("Zahl 1 eingeben: ");
	    Scanner scanner = new Scanner(System.in);
	    int number1 = scanner.nextInt();
	    
//	    Eingabe Zahl2
	    System.out.println("Zahl 2 eingeben: ");
	    int number2 = scanner.nextInt();
	    scanner.close();
	      
//		Berechnung
	    Calculator calculator = new Calculator();
		result = calculator.addition(number1, number2);
		System.out.println(result);
	}
}