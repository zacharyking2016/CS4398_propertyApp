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
public class ClientTest {
    
    public Client client = null;
    
/**
     * This is a before method which will run before every method to initialize 
     * the HardwareStore class
     * 
     */
    @Before
    public void createMethodEnvironment(){
        client = new Client();
    }

    /**
     * this is a after method which will run after every method has been tested 
     * and will make the HardwareStore object null
     */
    @After
    public void clearMethodEnvironment(){
        client = null;
    }

    /**
     * Test of getClientId method, of class Client.
     */
    @Test
    public void testGetClientId() {
        client = new Client(1, "Owais", "222Chavez", "Austin", "Texas", "78233", "5127729119", "o@txstate.edu", "owner");
        int expResult = 1;
        int result = client.getClientId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getName method, of class Client.
     */
    @Test
    public void testGetName() {
        client = new Client(1, "Owais", "222Chavez", "Austin", "Texas", "78233", "5127729119", "o@txstate.edu", "owner");
        String expResult = "Owais";
        String result = client.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAddress method, of class Client.
     */
    @Test
    public void testGetAddress() {
        client = new Client(1, "Owais", "222 Chavez", "Austin", "Texas", "78233", "5127729119", "o@txstate.edu", "owner");
        String expResult = "222 Chavez";
        String result = client.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCity method, of class Client.
     */
    @Test
    public void testGetCity() {
        client = new Client(1, "Owais", "222 Chavez", "Austin", "Texas", "78233", "5127729119", "o@txstate.edu", "owner");
        String expResult = "Austin";
        String result = client.getCity();
    }

    /**
     * Test of getState method, of class Client.
     */
    @Test
    public void testGetState() {
        client = new Client(1, "Owais", "222 Chavez", "Austin", "Texas", "78233", "5127729119", "o@txstate.edu", "owner");
        String expResult = "Texas";
        String result = client.getState();
        assertEquals(expResult, result);
        

    }

    /**
     * Test of getZip method, of class Client.
     */
    @Test
    public void testGetZip() {
        client = new Client(1, "Owais", "222 Chavez", "Austin", "Texas", "78233", "5127729119", "o@txstate.edu", "owner");
        String expResult = "78233";
        String result = client.getZip();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPhone method, of class Client.
     */
    @Test
    public void testGetPhone() {
        client = new Client(1, "Owais", "222 Chavez", "Austin", "Texas", "78233", "5127729119", "o@txstate.edu", "owner");
        String expResult = "5127729119";
        String result = client.getPhone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmail method, of class Client.
     */
    @Test
    public void testGetEmail() {
        client = new Client(1, "Owais", "222 Chavez", "Austin", "Texas", "78233", "5127729119", "o_l41@txstate.edu", "owner");
        String expResult = "o_l41@txstate.edu";
        String result = client.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUserType method, of class Client.
     */
    @Test
    public void testGetUserType() {
        client = new Client(1, "Owais", "222 Chavez", "Austin", "Texas", "78233", "5127729119", "o_l41@txstate.edu", "owner");
        String expResult = "owner";
        String result = client.getUserType();
        assertEquals(expResult, result);
    }
}
