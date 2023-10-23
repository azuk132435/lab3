import static org.junit.Assert.*;
import org.junit.*; 

public class ListTests{
    @Test
    public void testFilter(){
        List<String> List = new ArrayList<>();
        List.add("car");
        List.add("sun");
        String s = "car";
        assertArrayEquals(new String[] {"car","sun"}, ListExamples.filter(List<String> List, s));

    }
    
    @Test 
    public void testMerge(){

    }
}