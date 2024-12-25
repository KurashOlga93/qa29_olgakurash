package lesson9.service.impl;

import lesson9.domain.User;
import lesson9.exc.BetException;
import lesson9.exc.UserChooseException;
import lesson9.service.GameHandler;
import lesson9.service.PlayService;

import java.util.Scanner;

public class GameHandlerImpl implements GameHandler {

    private final PlayService playService;

    public GameHandlerImpl(PlayService playService) {
        this.playService = playService;
    }

    @Override
    public void run() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your name: ");

        String name = sc.nextLine();

        System.out.println("Please, enter your balance: ");

        int balance = sc.nextInt();

        User user = new User(name, balance);

        System.out.println("Hello, " + user.getName() + "! " + "Your balance is : " + user.getBalance());

        while (user.getBalance() > 0) {
            System.out.println("Please, place your bet: ");
            int bet = (sc.nextInt());

            try {
                playService.validate(bet, user);
            } catch (BetException exc) {
                System.out.println(exc.getMessage());
                continue;
            }

            System.out.println("Select a NUMBER from 0 to 5: ");

            int userChoose = sc.nextInt();

            try {
                if (userChoose == -1) {
                    System.out.println("Are you leaving already? It's a pity, we'll see you next time!");
                    break;
                }

                boolean result = playService.play(userChoose);
                playService.change(result, user, bet);

            } catch (UserChooseException exc) {
                System.out.println(exc.getMessage());
            }

            if (user.getBalance() <= 0) {
                System.out.println("Your balance is zero. Game over.");
                break;
            }

        }

    }
}