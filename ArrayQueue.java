/*
 * This class has array based queue.
 */
public class ArrayQueue {
	
	private int head;
    private int tail;
    private final int SIZE;

    private Integer []queue;
    
    // Takes the input from objects instantiated from
    // ArrayQueue class.
    public ArrayQueue(int SIZE) {
        this.SIZE = SIZE;
        queue = new Integer[SIZE];
        head = 0;
        tail = -1;
    }
    
    public ArrayQueue() {
    	queue = (Integer[]) new Object[1];
    	SIZE= head = 0;
    	tail = -1;
    }

    // INPUT: None
    // OUTPUT: return true is an item is added to queue 
    //		   or false. 
    // Parameter: takes integer data passed from doIt() method
    //            in driver class
    // This method adds element to the tail of 
    // the array.
    public boolean add(int number){
        if (isFull()) {
        	resize();
        }
            tail ++;
            queue[tail] = number;
            return true;
    }
    // INPUT: None
    // OUTPUT: integer data from number.
    
    // This method removes elements from the head
    // and shifts the array. 
    public Integer remove(){
        if (isEmpty()) {
        	return null;
        }
            int item = queue[head];
            for(int i=0; i<=tail; i++){
               queue[i] = queue[i+1];
            }
            tail --;
            return item;
    }
    
    public void resize() {
    	Integer []newQueue = (Integer[]) new Object[10];
    	for (int i = 0; i < SIZE; i++) {
    	}
    	queue = newQueue;
    }

    // INPUT: none
    // OUTPUT: a boolean data true or false.
    // Parameter: position.
    
    // This method removes a data at specific 
    // position and shifts the Array. 
    public boolean removePosition(int position){
        if(position<=tail){
            for(int i=position; i<tail; i++){
                queue[i] = queue[i+1];
            }
            tail --;
            return true;
        }
        return false;
    }
   
    // INPUT: None
    // OUTPUT: last integer data of queue
    // Parameter: None
    // The last data of the queue.
    public int tail(){
        return this.tail;
    }

    // INPUT: None
    // OUTPUT: position of a data in queue.
    // Parameter: position. 
    
    // This method returns the data at
    // specific position form the queue.
    public int peek(int position){
        if(position<=tail){
            return queue[position];
        }
        return -1;
    }
    
    public boolean isEmpty(){
        return tail == -1;
    }

    public boolean isFull(){
        return tail == SIZE - 1;
    }
    
    // INPUT: none
    // OUTPUT: none
    // Parameter: none
    
    // This method displays all numbers and 
    // prime numbers 10 items per line. 
    public void display(){
        for(int i= 0; i<tail ; i++){
        	if (i % 10 == 0 && i > 0) {
        		System.out.println();
        	}
            System.out.print(queue[i] + ", ");
        }
        System.out.print(queue[tail] +"\n");
    }
    
}
