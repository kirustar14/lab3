import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter(){
        StringChecker a = new checkString1(); 
        List<String> x = new ArrayList<String>(); 
        x.add("Fire"); 
        x.add("water111"); 
        x.add("ye"); 
        ArrayList<String> ans = new ArrayList<>(); 
        ans.add("Fire"); 
        ans.add("ye"); 
        List<String> ans1 = ListExamples.filter(x, a); 
        assertEquals(ans, ans1 ); 
    }

}


  // Returns a new list that has all the elements of the input list for which
  // the StringChecker returns true, and not the elements that return false, in
  // the same order they appeared in the input list;
