/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propertymanagement;

import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.hamcrest.CoreMatchers.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.*;

/**
 *
 * @author Dell-pc
 */
public class PropertyTest {
    
    public Property property = null;
    
/**
     * This is a before method which will run before every method to initialize 
     * the HardwareStore class
     * 
     */
    @Before
    public void createMethodEnvironment(){
        property = new Property();
    }

    /**
     * this is a after method which will run after every method has been tested 
     * and will make the HardwareStore object null
     */
    @After
    public void clearMethodEnvironment(){
        property = null;
    }

    /**
     * Test of getAddress method, of class Property.
     */
    @Test
    public void testGetAddress() {
        property = new Property("5656 University Circle", "Jan 02nd, 1995");
        String expResult = "5656 University Circle";
        String result = property.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDate method, of class Property.
     */
    @Test
    public void testGetDate() {
        property = new Property("5656 University Circle", "Jan 02nd, 1995");
        String expResult = "Jan 02nd, 1995";
        String result = property.getDate();
        assertEquals(expResult, result);
//        System.out.println("getDate");
//        Property instance = new Property();
//        Date expResult = null;
//        Date result = instance.getDate();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
