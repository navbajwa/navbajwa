
package assignmentprt451;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Assignmentprt451Test {
    
    public Assignmentprt451Test() {  }
    
    @BeforeClass
    public static void setUpClass() {   }
    
    @AfterClass
    public static void tearDownClass() {   }
    
    @Before
    public void setUp() {    }
    
    @After
    public void tearDown() {    }

    
    @Test
    public void testFrequencycount() 
    {
     
        String s = "h,a,z,c,h,d,W,W,h,W,h,W,M,M,M,M";
        String expected="{{h,4},{W,4},{M,4}}";
       String result=Assignmentprt451.frequencycount(s);
        assertEquals(expected,result);
        
       
    }
}