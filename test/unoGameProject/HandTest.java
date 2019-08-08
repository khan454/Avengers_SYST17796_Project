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
public class HandTest {
    
    public HandTest() {
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
     * Test of matchWith method, of class Hand (Good).
     */
    @Test
    public void testMatchWithGoodColour() {
        System.out.println("matchWith Good Colour");
        Card cardOnStack = new Card(Card.Color.RED, Card.Value.ONE);
        
        Card c1 = new Card(Card.Color.RED, Card.Value.TWO);
        Card c2 = new Card(Card.Color.GREEN, Card.Value.TWO);
        Card c3 = new Card(Card.Color.YELLOW, Card.Value.NINE);
        
        Hand instance = new Hand();
        instance.add(c1);
        instance.add(c2);
        instance.add(c3);
        
        int expResult = 1;
        int result = instance.matchWith(cardOnStack);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMatchWithGoodNumber() {
        System.out.println("matchWith Good Number");
        Card cardOnStack = new Card(Card.Color.RED, Card.Value.ONE);
        
        Card c1 = new Card(Card.Color.YELLOW, Card.Value.ONE);
        Card c2 = new Card(Card.Color.GREEN, Card.Value.TWO);
        Card c3 = new Card(Card.Color.YELLOW, Card.Value.NINE);
        
        Hand instance = new Hand();
        instance.add(c1);
        instance.add(c2);
        instance.add(c3);
        
        int expResult = 1;
        int result = instance.matchWith(cardOnStack);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of matchWith method, of class Hand (Bad).
     */
    @Test
    public void testMatchWithBad() {
        System.out.println("matchWith Bad");
        Card cardOnStack = new Card(Card.Color.RED, Card.Value.EIGHT);
        
        Card c1 = new Card(Card.Color.YELLOW, Card.Value.ONE);
        Card c2 = new Card(Card.Color.GREEN, Card.Value.TWO);
        Card c3 = new Card(Card.Color.YELLOW, Card.Value.NINE);
        
        Hand instance = new Hand();
        instance.add(c1);
        instance.add(c2);
        instance.add(c3);
        
        int expResult = 0;
        int result = instance.matchWith(cardOnStack);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of matchWith method, of class Hand (Boundary).
     */
    @Test
    public void testMatchWithBoundary() {
        System.out.println("matchWith Boundary");
        Card cardOnStack = new Card(Card.Color.RED, Card.Value.EIGHT);
        
        Card c1 = new Card(Card.Color.YELLOW, Card.Value.ONE);
        Card c2 = new Card(Card.Color.GREEN, Card.Value.TWO);
        Card c3 = new Card(Card.Color.YELLOW, Card.Value.NINE);
        
        Hand instance = new Hand();
        instance.add(c1);
        instance.add(c2);
        instance.add(c3);
        
        int expResult = 0;
        int result = instance.matchWith(cardOnStack);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of playCardToStack method, of class Hand (Good).
     */
    @Test
    public void testPlayCardToStackGoodIndex() {
        System.out.println("playCardToStack Good Index");
        
        Card c1 = new Card(Card.Color.YELLOW, Card.Value.ONE);
        Card c2 = new Card(Card.Color.GREEN, Card.Value.TWO);
        Card c3 = new Card(Card.Color.YELLOW, Card.Value.NINE);
        
        int cardNumber = 1;
        Stack stack = new Stack();
        stack.createStack();
        
        Hand instance = new Hand();
        instance.add(c1);
        instance.add(c2);
        instance.add(c3);
        int handSize = instance.size();
        int stackSize = stack.deck.size();
        
        boolean result = instance.playCardToStack(cardNumber, stack);
        boolean expResult = (handSize == 2 && stackSize == 41);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }  
    
    /**
     * Test of playCardToStack method, of class Hand (Bad).
     */
    @Test
    public void testPlayCardToStackBadIndex() {
        System.out.println("playCardToStack Bad Index");
        
        Card c1 = new Card(Card.Color.YELLOW, Card.Value.ONE);
        Card c2 = new Card(Card.Color.GREEN, Card.Value.TWO);
        Card c3 = new Card(Card.Color.YELLOW, Card.Value.NINE);
        
        int cardNumber = 0;
        Stack stack = new Stack();
        stack.createStack();
        
        Hand instance = new Hand();
        instance.add(c1);
        instance.add(c2);
        instance.add(c3);
        int handSize = instance.size();
        int stackSize = stack.deck.size();
        
        boolean result = instance.playCardToStack(cardNumber, stack);
        boolean expResult = false;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }  
    
    /**
     * Test of playCardToStack method, of class Hand (Bad Match).
     */
    @Test
    public void testPlayCardToStackBadMatch() {
        System.out.println("playCardToStack Bad Match");
        
        Card c1 = new Card(Card.Color.YELLOW, Card.Value.ONE);
        Card c2 = new Card(Card.Color.GREEN, Card.Value.TWO);
        Card c3 = new Card(Card.Color.YELLOW, Card.Value.NINE);
        
        int cardNumber = 1;
        Stack stack = new Stack();
        stack.createStack();
        
        Hand instance = new Hand();
        instance.add(c1);
        instance.add(c2);
        instance.add(c3);
        int handSize = instance.size();
        int stackSize = stack.deck.size();
        
        boolean result = instance.playCardToStack(cardNumber, stack);
        boolean expResult = false;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
    
    /**
     * Test of playCardToStack method, of class Hand (Bad Match).
     */
    @Test
    public void testPlayCardToStackGoodMatch() {
        System.out.println("playCardToStack Good Match");
        
        Card c1 = new Card(Card.Color.RED, Card.Value.ZERO);
        Card c2 = new Card(Card.Color.GREEN, Card.Value.TWO);
        Card c3 = new Card(Card.Color.YELLOW, Card.Value.NINE);
        
        int cardNumber = 1;
        Stack stack = new Stack();
        stack.createStack();
        
        Hand instance = new Hand();
        instance.add(c1);
        instance.add(c2);
        instance.add(c3);
        int handSize = instance.size();
        int stackSize = stack.deck.size();
        
        boolean result = instance.playCardToStack(cardNumber, stack);
        boolean expResult = true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of playCardToStack method, of class Hand (Boundary).
     */
    @Test
    public void testPlayCardToStackBoundaryUpper() {
        System.out.println("playCardToStack Boundary Upper");
        
        Card c1 = new Card(Card.Color.YELLOW, Card.Value.ONE);
        Card c2 = new Card(Card.Color.GREEN, Card.Value.TWO);
        Card c3 = new Card(Card.Color.RED, Card.Value.NINE);
        
        int cardNumber = 3;
        Stack stack = new Stack();
        stack.createStack();
        
        Hand instance = new Hand();
        instance.add(c1);
        instance.add(c2);
        instance.add(c3);
        int handSize = instance.size();
        int stackSize = stack.deck.size();
        
        boolean result = instance.playCardToStack(cardNumber, stack);
        boolean expResult = true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }  
}
