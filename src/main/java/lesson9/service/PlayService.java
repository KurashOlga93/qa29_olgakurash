package lesson9.service;

import lesson9.domain.User;

public interface PlayService {

    public boolean validate(int bet, User user);

    public boolean play(int userChoose);

    public void change(boolean result, User user, int bet);
}
