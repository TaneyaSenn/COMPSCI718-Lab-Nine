package ictgradschool.industry.lab09.ex04;

/**
 * An Exception to be thrown by a Customer if they're still hungry after lunch.
 */
public class HungryException extends Exception {

    public HungryException(String message) {
        super(message);
    }
}
