import org.junit.jupiter.api.Test;import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SimpleCalculatorTest {

	@Test
	public void testTwoPlusTwoShouldEqualFour() {
	
	//create an object "SimpleCalculator" to call "add" method
	SimpleCalculator calculator = new SimpleCalculator();
	
	//ca on calling the "add" method on this calculator object
	
	assertEquals(4, calculator.add(2, 2));
}


}