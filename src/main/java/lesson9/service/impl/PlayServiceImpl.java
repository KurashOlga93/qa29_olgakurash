package lesson9.service.impl;

import lesson9.domain.User;
import lesson9.exc.BetException;
import lesson9.exc.UserChooseException;
import lesson9.service.PlayService;

import java.util.Random;

public class PlayServiceImpl implements PlayService {

    Random random = new Random();
    int randomValue = random.nextInt(5);

    @Override
    public boolean validate(int bet, User user) {

        if (user.getBalance() < bet) {
            throw new BetException("Your current balance is: " + user.getBalance() + ". " + "It's not enough to place this bet");
        }
        if (bet > 100) {
            throw new BetException("Maximum bet is 100");
        }
        if (bet <= 0) {
            throw new BetException("Bet must be greater than 0");
        }
        return true;
    }

    @Override
    public boolean play(int userChoose) {

        if (userChoose < -1 || userChoose > 5){
            throw new UserChooseException("Number should be from 0 to 5");
        }
        if (userChoose == -1) {
            return false;
        }
        return userChoose == randomValue;
    }

    @Override
    public void change(boolean result, User user, int bet) {
        if (result) {
            user.setBalance((user.getBalance() + bet));
            int win = user.getBalance();
            System.out.println("You WIN! Your balance is: " + win);
        } else {
            user.setBalance(user.getBalance() - bet);
            int win = user.getBalance();
            System.out.println("You lose! Your balance is: " + win);
        }
    }
}