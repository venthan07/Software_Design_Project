package ca.sheridancollege.project;


/**
 *
 * @author Venthan Ganesh
 * @autho Fallon Higgins
 */
public class PlayGame {

    public static void main(String[] args) {

        WarGame game = new WarGame("War");
        GameView view = new GameView();
        gameController gameCtrl = new gameController(game, view);
        gameCtrl.startGame();

        Player player1 = gameCtrl.setPlayers(0);
        Player player2 = gameCtrl.setPlayers(1);

        gameCtrl.deal(player1, player2);

        gameCtrl.rounds();
        gameCtrl.clearHands(player1, player2);

        game.declareWinner(player1, player2);
//        System.out.println("Player1 winningPile: ");
//        for (Card card : player1.getWinningPile()) {
//            System.out.println(card);
//        }
//
//        System.out.println("Player2 winningPile: ");
//        for (Card card : player2.getWinningPile()) {
//            System.out.println("Player2 winningpile cards: " + card);
//        }
    }

}
