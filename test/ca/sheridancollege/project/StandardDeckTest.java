/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author venth
 */
public class StandardDeckTest {
    
    public StandardDeckTest() {
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
     * Test of generateDeckOfCards method, of class StandardDeck.
     */
    @Test
    public void testGenerateDeckOfCardsGood() {
        System.out.println("generateDeckOfCards good");
        StandardDeck instance = new StandardDeck(52);
        instance.generateDeckOfCards();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testGenerateDeckOfCardsBad() {
        System.out.println("generateDeckOfCards Bad");
        StandardDeck instance = new StandardDeck(50);
        instance.generateDeckOfCards();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testGenerateDeckOfCardsBoundary() {
        System.out.println("generateDeckOfCards Boundary");
        StandardDeck instance = new StandardDeck(52);
        instance.generateDeckOfCards();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
