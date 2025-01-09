package lesson9.exc;

public class BetException extends RuntimeException {

  private final String errorMessage;

  public BetException(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public String getMessage() {
    return errorMessage;
  }
}
