/*
 * Author: Nirajan Pandey
 * Instructor: Vic Berry
 * Due: Nov 18th
 * 
 * This program utilizes the Sieve of Eratosthenes to calculate 
 * all prime numbers up to some integer n. It implements Array 
 * Based Queue to perform all calculations. 
 * 
 * I am however unable to resize the array.
 */
public class Driver {
    public static void main(String[] args) {
        Driver me = new Driver();
        me.doIt();
    }

    public void doIt(){
    		SieveOfE.findPrime();
    }
}
