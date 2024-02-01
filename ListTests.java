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


    @Test
    public void testMerge(){
        List<String> x = new ArrayList<String>(), y = new ArrayList<String>() ;
        y.add("a"); 
        y.add("d"); 
        y.add("z"); 
        x.add("b"); 
        x.add("c"); 
        List<String> ans1 = ListExamples.merge(x, y);
        ArrayList<String> ans = new ArrayList<>();
        ans.add("a"); 
        ans.add("b");
        ans.add("c");
        ans.add("d");
        ans.add("z");
        assertEquals(ans, ans1);

    }

}


