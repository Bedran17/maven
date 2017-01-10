package ch.bbw;

public class Calculator {
	
	public int result;
	
	public Calculator() {
//		Leerer Konstruktor
	}
	
	public int addition(int number1, int number2) {
		result = number1 + number2;
		return result;
	}

//	Getters & Setters
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
}
