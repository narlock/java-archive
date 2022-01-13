
/**
 * Encapsulate a message and methods for printing it out.
 *
 * @author Mithat Konar
 * @author TODO: Anthony Narlock
 */
public class MessageMaker {

    protected String message;

    /**
     * Default ctor.
     */
    public MessageMaker() {
        message = "";
    }

    /**
     * parameterized ctor.
     *
     * @param message  the message associated with this MessageMaker.
     */
    public MessageMaker(String message) {
        this.message = message;
    }

    /**
     * Mutator for message.
     *
     * @param message  the message associated with this MessageMaker.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return The message associated with this MessageMaker.
     */
    @Override
    public String toString() {
        return message;
    }

    /**
     * Print the message without a new line terminator.
     */
    public void print() {
        System.out.print(message);
    }

    /**
     * Print the message with a new line terminator.
     */
    public void println() {
        System.out.println(message);
    }
    
    // TODO: Add a method that prints the message in SHOUT CASE without newline.
    public void shout() {
    	System.out.print(message.toUpperCase());
    }
    
    // TODO: Add a method that prints the message in SHOUT CASE with newline.
    public void shoutln() {
    	System.out.println(message.toUpperCase());
    }

}
