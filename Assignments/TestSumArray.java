import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.assertArrayEquals;


public class TestSumArray {


	@Test

	public void testSumElementsInAnArray() {

	//given
	SumArray  verify = new SumArray();


	int [] array = {20, 30, 40, 56, 87};
	//when 
	int result = verify.sumNumbers(array);

	assertEquals(233, result);

    }

}