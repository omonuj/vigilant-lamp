import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class CalculatorTest {

	@Test //annotation, it tells the junit that this is a test case, it differentiate test cases to the compiler
	public void testThatCalculatesAndAddTwoPossitiveNumbers() {

		//given
		Calculator calculator = new Calculator();
		//when
		int result = calculator.add(9, 8);
		//assert
		assertEquals(17, result);

}



	@Test
	public void testThatCalculatesAndSubtractPossitiveNumbers() {

	//given
	Calculator calculator = new Calculator();
	//when
	int result = calculator.difference(9, 8);
	//assert
	assertEquals(1, result);
}

	@Test
	public void testThatCalculatesAndMultiplyNumbers() {
	
	//given
	Calculator calculator = new Calculator();
	//when
	int result = calculator.multiply(4, 2);
	//assert
	assertEquals(8, result);

}

	@Test
	public void testThatDivideNumberByZero() {
	
	//given
	Calculator calculator = new Calculator();
	//when
	//int result = calculator.divide(4, 0);
	//assert
	assertThrows(ArithmeticException.class, ()->calculator.divide(4, 0));
	

}

	@Test
	public void testOtherWaysToMultiply() {
	
	//given
	Calculator calculator = new Calculator;
	//when
	int result = calculator.product(4, 2);
	//assert
	assertEquals(8, result);

}


}