package lesson9.exc;

public class UserChooseException extends RuntimeException {

    private final String errorMessage;

    public UserChooseException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getMessage() {
        return errorMessage;
    }

}