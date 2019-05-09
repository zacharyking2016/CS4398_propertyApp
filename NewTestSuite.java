/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propertymanagement;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Dell-pc
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({propertymanagement.ClientTest.class, 
    propertymanagement.MessageTest.class, 
    propertymanagement.LeaseTest.class, 
    propertymanagement.PropertyTest.class,
    propertymanagement.MaintRequest.class})
public class NewTestSuite {
    
}
