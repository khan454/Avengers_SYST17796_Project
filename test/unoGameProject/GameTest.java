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
public class GameTest {
    
    public GameTest() {
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
     * Test of askForPlayers method, of class Game (Good).
     */
    @Test
    public void testAskForPlayersGood() {
        System.out.println("Test askForPlayers: Good TestCase");
        Game instance = new Game();
        int goodNum = 3;
        instance.askForPlayers();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of askForPlayers method, of class Game (Bad).
     */
    @Test
    public void testAskForPlayersBad() {
        System.out.println("Test askForPlayers: Bad TestCase");
        Game instance = new Game();
        instance.askForPlayers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of askForPlayers method, of class Game (Boundary).
     */
    @Test
    public void testAskForPlayersBoundary() {
        System.out.println("Test askForPlayers: Boundary TestCase");
        Game instance = new Game();
        instance.askForPlayers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
