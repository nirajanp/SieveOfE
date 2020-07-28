/*
 * This class takes the input from the user and finds all the 
 * prime numbers upto number entered by user.
 */
import java.util.Scanner;

public class SieveOfE {
		
	 public static void findPrime(){
	        Scanner kbd = new Scanner(System.in);
	        int maxNum = 0;
	        
	        // This if-else statement excludes numbers
	        // less than 2.
	        if (maxNum >= 2) {
	        System.out.println("Enter MAX no to find prime all prime numbers upto MAX:");
	        maxNum = kbd.nextInt();
	        }
	        else {
	        do {
	        	System.out.println("Enter MAX no to find prime all prime numbers upto MAX:");
		        maxNum = kbd.nextInt();
	        } while (maxNum < 2);
	        }
	        
	        // Objects of ArrayQueue class.
	        ArrayQueue numbers = new ArrayQueue(maxNum);  
	        ArrayQueue prime = new ArrayQueue(maxNum);

	        // Adds consecutive integers from 2 through n to number
	        // queue.
	        for(int i=2; i<=maxNum; i++) {
	            numbers.add(i);
	        }
	 
	       int p;
	        do{
	        	// removes first value from the number queue.
	            p = numbers.remove();
	            // adds deleted value to the prime queue.
	            prime.add(p);
	            // walk the queue of numbers, eliminating numbers 
	            // divisible by p.
	            for(int i =0; i<= numbers.tail() ; i++){
	                if(numbers.peek(i) % p == 0){
	                    numbers.removePosition(i);
	                }
	            }
	        }while (p<Math.sqrt(maxNum));

	        // This while is removing remaining prime numbers 
	        // from number queue and adding them to prime number
	        // queue.
	        while (numbers.tail()>=0){
	            prime.add(numbers.remove());
	        }
	        
	        System.out.println("\nPrime numbers");
	        // Displays the queue of prime numbers, 10 numbers 
	        // per line. 
	        prime.display();
	    }
}
