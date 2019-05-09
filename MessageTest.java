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
public class MessageTest {

    public Message message = null;
    
/**
     * This is a before method which will run before every method to initialize 
     * the HardwareStore class
     * 
     */
    @Before
    public void createMethodEnvironment(){
        message = new Message();
    }

    /**
     * this is a after method which will run after every method has been tested 
     * and will make the HardwareStore object null
     */
    @After
    public void clearMethodEnvironment(){
        message = null;
    }

    /**
     * Test of getMessage method, of class Message.
     */
    @Test
    public void testGetMessage() {
        message = new Message("I got ur message", "1");
        String expResult = "I got ur message";
        String result = message.getMessage();
        assertEquals(expResult, result);
    }

    

    /**
     * Test of getReciever method, of class Message.
     */
    @Test
    public void testGetReciever() {
        message = new Message("I got ur message", "A04785461");
        String expResult = "A04785461";
        String result = message.getReciever();
        assertEquals(expResult, result);
//        System.out.println("getReciever");
//        Message instance = new Message();
//        String expResult = "";
//        String result = instance.getReciever();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
