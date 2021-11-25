package CatCafe.exception;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(double moneyLeft){
    System.out.println("余额不足！还剩" + moneyLeft + "元");
    }
}
