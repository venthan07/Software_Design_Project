package ca.sheridancollege.project;

/**
 *
 * @author Venthan Ganesh
 * @author Fallon Higgins
 */
public class StandardDeck extends GroupOfCards {

    public StandardDeck(int size) {
        super(size);
    }

    public void generateDeckOfCards() {
        if (super.getSize() == 52) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    Card card = new Card(Suits.values()[i], Value.values()[j]);
                    getCards().add(card);
                }
            }
        }else{
            System.out.println("The size of a standard deck of playing cards must be 52");
        }

    }

}
