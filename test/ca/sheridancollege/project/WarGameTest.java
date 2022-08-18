/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
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
public class WarGameTest {

    public WarGameTest() {
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
     * Test of play method, of class WarGame.
     */
    @Test
    public void testPlayGood() {
        System.out.println("play player1 wins good");
        int index = 0;
        Player player1 = new WarPlayers("player1");
        player1.getHand().add(new Card(Suits.CLUBS, Value.ACE));
        Player player2 = new WarPlayers("player2");
        player2.getHand().add(new Card(Suits.CLUBS, Value.TWO));
        WarGame instance = new WarGame("war");
        int expResult = 0;
        int result = instance.play(index, player1, player2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPlayBad() {
        System.out.println("play player1 wins bad");
        int index = 0;
        Player player1 = new WarPlayers("player1");
        player1.getHand().add(new Card(Suits.CLUBS, Value.TWO));
        Player player2 = new WarPlayers("player2");
        player2.getHand().add(new Card(Suits.CLUBS, Value.ACE));
        WarGame instance = new WarGame("war");
        int expResult = 0;
        int result = instance.play(index, player1, player2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   

    /**
     * Test of declareWinner method, of class WarGame.
     */
    @Test
    public void testDeclareWinnerGood() {
        System.out.println("declareWinner Player 1 wins good");
        Player player1 = new WarPlayers("player1");
        player1.getWinningPile().add(new Card(Suits.CLUBS, Value.ACE));
        // System.out.println("Player 1: winning pile size:" + player1.getWinningPile().size());
        Player player2 = new WarPlayers("player2");
        //   System.out.println("Player 2: winning pile size:" + player2.getWinningPile().size());
        WarGame instance = new WarGame("war");

        instance.declareWinner(player1, player2);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testDeclareWinnerPBad() {
        System.out.println("declareWinner player 1 wins bad");
        Player player1 = new WarPlayers("player1");

        Player player2 = new WarPlayers("player2");
        player2.getWinningPile().add(new Card(Suits.CLUBS, Value.ACE));
        WarGame instance = new WarGame("war");
        instance.declareWinner(player1, player2);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testDeclareWinnerBoundary() {
        System.out.println("declareWinner boundary ");
        Player player1 = new WarPlayers("player1");
        player1.getWinningPile().add(new Card(Suits.CLUBS, Value.ACE));
        Player player2 = new WarPlayers("player2");
        player2.getWinningPile().add(new Card(Suits.CLUBS, Value.ACE));
        WarGame instance = new WarGame("war");
        instance.declareWinner(player1, player2);
        // TODO review the generated test code and remove the default call to fail.
    }
}
