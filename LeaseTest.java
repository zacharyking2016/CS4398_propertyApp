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
public class LeaseTest {
    
    public Lease lease = null;
    
/**
     * This is a before method which will run before every method to initialize 
     * the HardwareStore class
     * 
     */
    @Before
    public void createMethodEnvironment(){
        lease = new Lease();
    }

    /**
     * this is a after method which will run after every method has been tested 
     * and will make the HardwareStore object null
     */
    @After
    public void clearMethodEnvironment(){
        lease = null;
    }
    
    /**
     * Test of getLeaseStart method, of class Lease.
     */
    @Test
    public void testGetLeaseStart() {
        lease = new Lease();
        lease.setLeaseStart("May 02nd, 2019");
        String expResult = "May 02nd, 2019";
        String result = lease.getLeaseStart();
        assertEquals(expResult, result);
        
//        System.out.println("getLeaseStart");
//        Lease instance = new Lease();
//        Date expResult = null;
//        Date result = instance.getLeaseStart();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeaseEnd method, of class Lease.
     */
    @Test
    public void testGetLeaseEnd() {
        lease = new Lease();
        lease.setLeaseEnd("May 01st, 2020");
        String expResult = "May 01st, 2020";
        String result = lease.getLeaseEnd();
        assertEquals(expResult, result);
        
//        System.out.println("getLeaseEnd");
//        Lease instance = new Lease();
//        Date expResult = null;
//        Date result = instance.getLeaseEnd();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getRentPrice method, of class Lease.
     */
    @Test
    public void testGetRentPrice() {
        lease = new Lease();
        lease.setRentPrice(2400);
        Double expResult = 2400.00;
        Double result = lease.getRentPrice();
        assertEquals(expResult, result);
    }
    
}
