package CalculatorPartI;

public class CalculatorTest {

	public static void main(String[] args) {
	Calculator calculator = new Calculator();
		calculator.setOperandOne(10.5);
		calculator.setOperation("+");
		calculator.setOperandtwo(5.2);
		calculator.performOperation();
		calculator.getResults();

	}

}
