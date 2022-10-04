package com.company.lesson20BlackJack;

import java.util.Scanner;

public class Game {

    public void play () throws  InterruptedException {
    Scanner in = new Scanner(System.in);
    char answer = 'y';
        while (answer == 'y') {
            deck = new Deck();
            player = new Player();
            dealer = new Dealer();
            //надо собрать карты с рук в колоду
            //колоду претусовать
             player.play(deck);
            //проверка как сыграл player
            //if (player.endGame) return;
            if (player.calcScore() == 21) {
                System.out.println("Player wins!");
                playerWin++;
                continue;
            } else if (player.calcScore() > 21) {
                System.out.println("Player loses");
                return;
            }
            Dealer dealer = new Dealer();
            dealer.play(deck);
            //проверка как сыграл диллер
            // dealer.endGame(player);
            if (dealer.calcScore() == 21) {
                System.out.println("Dealer wins!");
                dealerWin++;
            } else if (dealer.calcScore() > 21) {
                System.out.println("Dealer loses!");
                playerWin++;
            } else if (player.calcScore() > dealer.calcScore()) {
                System.out.println("Player wins!");
                playerWin++;
            } else if (player.calcScore() < dealer.calcScore()) {
                System.out.println("Dealer wins!");
                dealerWin++;
            } else if (player.calcScore() == dealer.calcScore()) {
                System.out.println("Draw");
                draws++;
            }
            System.out.println("Player won: " + playerWin);
            System.out.println("Dealer won: " + dealerWin);
            System.out.println("Draws: " + draws);
            System.out.println("Do you want another game? (type y for yes, any other key  for no) ");
            answer = in.nextLine().charAt(0);
        }
    }
    private Deck deck;
    private Player player;
    private Dealer dealer;
    private int playerWin;
    private int dealerWin;
    private int draws;
}
