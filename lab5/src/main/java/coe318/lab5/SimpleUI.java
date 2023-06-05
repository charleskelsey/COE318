package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        System.out.println("House holds:");
        System.out.println(game.getHouseCards());
        
        System.out.println("You hold:");
        System.out.println(game.getYourCards());
        //FIX THIS
    }

  @Override
    public boolean hitMe() {
        String message;
        System.out.println("Another card?(y or n):");
        message = user.nextLine();
        if (message.equals("y")) {
            return true;
        } else {
            return false;
        }
        //FIX THIS
    }

  @Override
    public void gameOver() {
        System.out.println("Game over");
        
        System.out.println("House holds:");
        System.out.println(game.getHouseCards());
        
        System.out.println("You hold:");
        System.out.println(game.getYourCards());
        
        System.out.println("You score:" + game.score(game.getYourCards()));
        System.out.println("House score:" + game.score(game.getHouseCards()));
        
        if (game.score(game.getHouseCards()) > 21) {
            System.out.println("You win");
        } else if (game.score(game.getYourCards()) > 21) {
            System.out.println("House wins");
        } else {
            if (game.score(game.getHouseCards()) > game.score(game.getYourCards())) {
                System.out.println("House wins");
            } else if (game.score(game.getHouseCards()) == game.score(game.getYourCards())) {
                System.out.println("It's a tie");
            } else {
                System.out.println("You win");
            }
        }
        //FIX THIS
    }

}
