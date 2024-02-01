import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed1() {
    int[] input1 = {4,6,7,9};
    assertArrayEquals(new int[]{9,7,6,4}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace1() {
    int[] input1 = {4,6,7,9};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{9,7,6,4}, input1);
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {17,-4,-7,2,1};
    double x = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(4.0, x, 0);
  }

}
