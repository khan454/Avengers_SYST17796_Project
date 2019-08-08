/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoGameProject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jawad
 */
public class PlayerTest {
    
    public PlayerTest() {
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
    
    /**
     * Test of isHandEmpty method, of class Player (Good).
     */
    @Test
    public void testIsHandEmptyGood() {
        System.out.println("isHandEmpty Good");
        
        Player instance = new Player("Hasan");
        Hand hand = instance.getHand();
        
        boolean expResult = true;
        boolean result = instance.isHandEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of isHandEmpty method, of class Player (Bad).
     */
    @Test
    public void testIsHandEmptyBad() {
        System.out.println("isHandEmpty Bad");
        
        Card c1 = new Card(Card.Color.RED, Card.Value.TWO);
        
        Player instance = new Player("Hasan");
        instance.getHand().add(c1);
        
        boolean expResult = false;
        boolean result = instance.isHandEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of isHandEmpty method, of class Player (Boundary).
     */
    @Test
    public void testIsHandEmptyBoundaryLower() {
        System.out.println("isHandEmpty Boundary Lower");
        
        Player instance = new Player("Hasan");
        Hand hand = instance.getHand();
        
        boolean expResult = true;
        boolean result = instance.isHandEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
