import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{3, 2, 1} , input2);

	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {1, 2, 3};

    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {1, 2, 3};
    double[] input2 = {5, 5, 5};

    ArrayExamples.averageWithoutLowest(input1);

    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input1), 0.0);
    assertEquals(0, ArrayExamples.averageWithoutLowest(input2), 0.0);
  }
}
