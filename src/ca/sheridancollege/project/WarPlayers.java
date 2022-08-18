

package ca.sheridancollege.project;

import java.util.*;
/**
 *
 * @author Venthan Ganesh
 * @author Fallon Higgins
 */
public class WarPlayers extends Player{

    private ArrayList<Card> hand;
    private ArrayList<Card> winningPile;
    
    public WarPlayers(String name){
        super(name);
        hand = new ArrayList();
        winningPile = new ArrayList();
        
    }

    
    public ArrayList<Card> getHand(){
        return this.hand;
    }
    
    public ArrayList<Card> getWinningPile(){
        return this.winningPile;
    }
    
    public void setWinningPileSize(int size){
        
    }
    
   
    
    @Override
    public void play() {
    }

}
