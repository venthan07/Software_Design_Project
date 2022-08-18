

package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author Venthan Ganesh
 * @author Fallon Higgins
 */
public class GameView {
    
    
    public GameView(){
    }
    
    
    public String[]startPromptView(WarGame game){
        System.out.println("Welcome to " + game.getName());

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a name for player 1: ");
        String player1Name = sc.next();
        System.out.print("Please enter a name for player 2: ");
        String player2Name = sc.next();
        sc.nextLine();
    
        String[] playerNames = {player1Name,player2Name};
        return playerNames;
    }

    public void cardsDealtPromptView( int num){
        System.out.println("Each Player has been dealt " + num + " cards!");
    }
    
    public String nextFlipPromptView(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please hit enter to flip: ");
        return sc.nextLine();
    }
    
}
