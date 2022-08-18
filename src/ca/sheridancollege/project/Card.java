/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 * @author Venthan Ganesh
 * @autho Fallon Higgins
 */
public class Card {

    //default modifier for child classes
    private Suits suit;
    private Value value;

    public Card(Suits suit, Value value) {
        setSuit(suit);
        setValue(value);
    }

    /**
     * @return the suit
     */
    public Suits getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Value value) {
        this.value = value;
    }

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public String toString() {
//        if (this.value == 1 || this.value >= 11 && this.value <= 13) {
//            return faceCard(this.value) + " of " + this.suit;
//        } else {
        return this.value + " of " + this.suit;

        //}
    }

}
