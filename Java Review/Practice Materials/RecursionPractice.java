/**
* Recursion Practice
* My codingbat.com answers
* By: Anthony Narlock
*
*
* When we do Recursion, we want to always know when the stopping point is.
* And, what is the easiest way to do the problem assigned?
*
* All recursive questions will have a base case - what will end the recursive calls
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

    /*
    * bunnyEars2
    * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies have the normal 2 ears.
    * The even bunnies now have 3 ears, because they each have a raised foot. Recursively return the
    * number of "ears" in the bunny line.
    */

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
          return 0;
        }
        else if(bunnies % 2 == 0) {
          //even
          return 3 + bunnyEars2(bunnies - 1);
        }
        else {
          //odd
          return 2 + bunnyEars2(bunnies - 1);
        }
      }


    /*
    * triangle
    * We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
    * the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication)
    * the total number of blocks in such a triangle with the given number of rows.
    */

    public int triangle(int rows) {
      if (rows == 0) {
        return rows;
      }
      
      return rows + triangle(rows - 1);
    }

    /*
    * sumDigits
    * Given a non-negative int n, return the sum of its digits recursively (no loops). Note that
    * mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes
    * the rightmost digit (126 / 10 is 12)
    */

    public int sumDigits(int n) {
      if(n / 10 < 1) {
        return n;
      }
      
      return (n % 10) + sumDigits(n / 10);
    }
    
    /*
    * count7
    * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for
    * example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit
    * (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12)
    */

    public int count7(int n) {
      if(n % 10 == 7) {
        return 1 + count7(n / 10);
      }
      if (n / 10 < 1) {
        return 0;
      } else {
        return count7(n / 10);
      }
    }
}