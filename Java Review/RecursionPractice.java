/**
* Recursion Practice
* My codingbat.com answers
* By: Anthony Narlock
*
*
* When we do Recursion, we want to always know when the stopping point is.
* And, what is the easiest way to do the problem assigned?
*/

public class RecursionPractice() {

    /*
    * factorial:
    * Given n of 1 or more, return the factorial of n
    */

    public int factorial(int n) {
        if(n == 1) {
        return 1;
        }
        
        return n * factorial(n-1);
    }

    /*
    * bunnyEars:
    * We have a number of bunnies and each bunny has two big floppy ears
    * We want to compute the total number of ears across all the bunnies recursively
    */

    public int bunnyEars(int bunnies) {
        if(bunnies == 0)
        return 0;
        
        if(bunnies == 1)
        return 2;
        
        return 2 + bunnyEars(bunnies - 1);
    }

    /*
    * fibonacci
    */

    public int fibonacci(int n) {
        if(n <= 1) {
        return n;
        }
        else {
        return fibonacci(n-1) + fibonacci(n-2);
        }
        
    }

}