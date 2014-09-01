/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Client
 */
public class assignment452Test {
    
    public assignment452Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testFrequencycount() 
    {
     
        String s = "h,a,z,c,h,d,W,W,h,W,h,W";
        String expected="{{h,4},{W,4}}";
       String result=assignment452.frequencycount(s);
        assertEquals(expected,result);
        
       
    }
}