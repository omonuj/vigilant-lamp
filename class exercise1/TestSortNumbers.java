import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.assertArrayEquals;

public class TestSortNumbers {

	@Test
	
	public void testChecksIfNumbersAreInAscendingOrder() {

	//given
	SurtNum verify = new SurtNum();
	int array [] = {23, 2, 3, 5, 67, 7, 43, -100, -2, -3, -4};
	
	//when
	int [] result = verify.sortNumbers(array);
	
	int [] number = {-100, -4, -3, -2, 2, 3, 5, 7, 23, 43, 67};
	assertArrayEquals(number, result);


}
}