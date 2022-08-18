package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Venthan Ganesh
 * @author Fallon Higgins
 */
public class WarGame extends Game {

    private ArrayList<Card> warCards;

    public WarGame(String title) {
        super(title);
        warCards = new ArrayList();
    }

    public void deal(StandardDeck deck, Player player1, Player player2) {
        for (int i = 0; i < deck.getSize(); i++) {
          
            if (i % 2 == 0) {
                player1.getHand().add(deck.getCards().get(i));
            } else {
                player2.getHand().add(deck.getCards().get(i));
            }

        }

    }

    public ArrayList<Card> getWarCards() {
        return this.warCards;
    }

    public void setPlayers(String player1args, String player2args) {
        Player player1 = new WarPlayers(player1args);
        Player player2 = new WarPlayers(player2args);
        ArrayList<Player> playersList = new ArrayList<>();
        playersList.add(player1);
        playersList.add(player2);
        super.setPlayers(playersList);
    }
    

    @Override
    public int play(int index, Player player1, Player player2) {

        System.out.println("Player1 has: " + player1.getHand().get(index) + " and Player2 has: " + player2.getHand().get(index));
        if (player1.getHand().get(index).getValue().getVal() > player2.getHand().get(index).getValue().getVal()) {
            addWinnerCards(player1, player2, index, player1.getName());

        } else if (player1.getHand().get(index).getValue().getVal() < player2.getHand().get(index).getValue().getVal()) {
            addWinnerCards(player2, player1, index, player2.getName());
        } else {
            if (index == 25) {
                System.out.println("Tie on last hand: All remaining cards will be split evenly");
                player1.getWinningPile().add(player1.getHand().get(index));
                player2.getWinningPile().add(player2.getHand().get(index));

                if (!warCards.isEmpty()) {
                    for (int i = 0; i < warCards.size(); i++) {
                        if (i % 2 == 0) {
                            player1.getWinningPile().add(warCards.get(i));
                        } else {
                            player2.getWinningPile().add(warCards.get(i));
                        }
                    }
                }
            } else {
                System.out.println("WAR is triggered");
                warCards.add(player1.getHand().get(index));
                warCards.add(player2.getHand().get(index));
                return handleWar(index, player1, player2);
            }

        }
        return 0;
    }

    private void addWinnerCards(Player winner, Player loser, int index, String name) {
        System.out.println(name + " has a the bigger hand");
        winner.getWinningPile().add(winner.getHand().get(index));
        winner.getWinningPile().add(loser.getHand().get(index));

        for (Card warCard : warCards) {
            System.out.println("War cards are added to player 1");
            winner.getWinningPile().add(warCard);
        }
        warCards.clear();
    }

    private int handleWar(int index, Player player1, Player player2) {
        int returnVal;

        switch (index) {
            case 22:
                for (int j = 0; j < 2; j++) {
                    index++;
                    addCardsToWarCards(player1, player2, index);
                }
                returnVal = 2;
                break;
            case 23:
                for (int j = 0; j < 1; j++) {
                    index++;
                    addCardsToWarCards(player1, player2, index);
                }
                returnVal = 3;
                break;
            case 24:
                returnVal = 0;
                break;
            default:
                for (int j = 0; j < 3; j++) {
                    index++;
                    addCardsToWarCards(player1, player2, index);
                }
                returnVal = 1;
        }
        return returnVal;
    }

    private void addCardsToWarCards(Player player1, Player player2, int index) {
       
        warCards.add(player1.getHand().get(index));
        warCards.add(player2.getHand().get(index));
    }

    @Override
    public void declareWinner(Player player1, Player player2) {
        if (player1.getWinningPile().size() > player2.getWinningPile().size()) {
            System.out.println("CONGRATULATIONS: " + player1.getName() + " WINS");
        } else if (player1.getWinningPile().size() < player2.getWinningPile().size()) {
            System.out.println("CONGRATULATIONS: " + player2.getName() + " WINS");
        } else {
            System.out.println("IT'S A TIE");
        }
    }

}
