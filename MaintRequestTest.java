/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propertymanagement;

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
public class MaintRequestTest {
    
    public MaintRequest maint;
    
/**
     * This is a before method which will run before every method to initialize 
     * each class
     * 
     */
    @Before
    public void createMethodEnvironment(){
        maint = new MaintRequest();
    }

    /**
     * this is a after method which will run after every method has been tested 
     * and will make the HardwareStore object null
     */
    @After
    public void clearMethodEnvironment(){
        maint = null;
    }

    /**
     * Test of getIssue method, of class MaintRequest.
     */
    @Test
    public void testGetIssue() {
        maint.setIssue("Please fix my flush problem");
        String expResult = "Please fix my flush problem";
        String result = maint.getIssue();
        assertEquals(expResult, result);
//        System.out.println("getIssue");
//        MaintRequest instance = new MaintRequest();
//        String expResult = "";
//        String result = instance.getIssue();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class MaintRequest.
     */
    @Test
    public void testGetStatus() {
        maint.setStatus(false);
        boolean expResult = false;
        boolean result = maint.getStatus();
        assertEquals(expResult, result);
//        System.out.println("getStatus");
//        MaintRequest instance = new MaintRequest();
//        boolean expResult = false;
//        boolean result = instance.getStatus();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
