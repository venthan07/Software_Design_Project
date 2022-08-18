package ca.sheridancollege.project;

/**
 *
 * @author Venthan Ganesh
 * @author Fallon Higgins
 */
public class gameController {

    private WarGame model;
    private GameView view;

    public gameController(WarGame game, GameView view) {

        setGame(game);
        setGameView(view);
    }

    public void setGame(WarGame game) {
        this.model = game;

    }

    public void setGameView(GameView view) {
        this.view = view;
    }

    public void startGame() {
        String[] players = view.startPromptView(model);
        model.setPlayers(players[0], players[1]);

    }

    public Player setPlayers(int index) {
        return model.getPlayers().get(index);
    }

    private StandardDeck readyDeck() {
        StandardDeck standardDeck = new StandardDeck(52);
        standardDeck.generateDeckOfCards();
        standardDeck.shuffle();
        return standardDeck;
    }

    public void deal(Player player1, Player player2) {

        model.deal(readyDeck(), player1, player2);
    }

    public void clearHands(Player player1, Player player2) {
        player1.getHand().clear();
        player2.getHand().clear();
    }

    public void rounds() {

        view.cardsDealtPromptView(26);

        int index = 0;
        while (index < 26) {
            String flip = view.nextFlipPromptView();

            if (flip.equals("")) {
                
                int war = model.play(index, model.getPlayers().get(0), model.getPlayers().get(1));
             
                switch (war) {
                    case 0:
                        index++;
                        break;
                    case 1:
                        index += 4;
                        break;
                    case 2:
                        index += 3;
                        break;
                    case 3:
                        index += 2;
                        break;
                }
            }
        }

    }

}
