
/**
 * Sample Java application that uses multiple files.
 *
 * @author Mithat Konar
 * @author TODO: Anthony Narlock
 */
public class SampleApp {

    public static void main(String[] args) {
        MessageMaker msg1 = new MessageMaker();

        msg1.setMessage("Eat blueberries.");
        msg1.print();
        msg1.println();
        
        MessageMaker msg2 = new MessageMaker("O hai.");
        msg2.print();
        msg2.println();

        System.out.println(msg1 + " " + msg2);
        
        msg2.setMessage("I ate 20.");
        msg2.print();
        msg2.println();
        
        System.out.println(msg2);
        
        // TODO: After finishing the changes to the MessageMaker class 
        //       uncomment the statements below.
        msg1.shout();
        msg1.shoutln();
        msg2.shout();
        msg2.shoutln();
    }
}
