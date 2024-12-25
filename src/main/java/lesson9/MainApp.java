package lesson9;

import lesson9.domain.User;
import lesson9.exc.BetException;
import lesson9.service.GameHandler;
import lesson9.service.PlayService;
import lesson9.service.impl.GameHandlerImpl;
import lesson9.service.impl.PlayServiceImpl;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        GameHandler gameHandler = new GameHandlerImpl(
                new PlayServiceImpl()
        );

        gameHandler.run();

    }
}