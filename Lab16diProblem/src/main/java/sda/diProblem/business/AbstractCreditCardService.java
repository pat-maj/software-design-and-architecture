package sda.diProblem.business;

public abstract class AbstractCreditCardService {

    public abstract boolean takePayment(double amount, String cardNumber, int expiryYear, int expiryMonth);

}
