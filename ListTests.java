import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    @test
    public void testReverseInPlace() {
        int[] input1 = { 3 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{ 3 }, input1);
    }
}
