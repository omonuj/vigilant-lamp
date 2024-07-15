import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {


	@Test
	public void testOtherWaysToMultiply() {
	
	//given
	Multiplication calculator = new Multiplication();
	//when
	int result = calculator.product(4, 2);
	//assert
	assertEquals(8, result);


}

}