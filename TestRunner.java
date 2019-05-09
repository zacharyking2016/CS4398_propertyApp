/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propertymanagement;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;  
import org.junit.runners.Suite;  
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author Dell-pc
 */
public class TestRunner {
    
    public static void main(String[] args){
        
        Result result = JUnitCore.runClasses(MessageTest.class);
        for (Failure failure : result.getFailures()){
        System.out.println(failure.toString());
        }
        
        if (result.wasSuccessful()){
            System.out.println("All tests finished successfully...");
        }
        
    }
}
