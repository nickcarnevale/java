//Nick Carnevale
//CSE_17
//HW_4
//Class Customer Queue
//Date Created 10/20

import java.util.Queue; 
import java.util.LinkedList;

//this class creates a customer queue of type linked list
public class CustomerQueue{

    //private data member queue
    private Queue<Customer> customers;

    //public constructor for customer queue
    //initalizes a blank queue
    public CustomerQueue(){
        customers = new LinkedList<Customer>();
    }

    //method to get the next customer
    public Customer getNextCustomer(){
        return customers.poll();
    }

    //method to update wait time for each customer in queue
    public void updateWaitTime(){
        for(Customer c:customers){
            c.incrementWaitingTime();
        }
    }

    //method to add a customer to the queue
    public void addCustomer(Customer c){
        customers.add(c);
    }

    //method to tell if the customer queue is empty
    public boolean isEmpty(){
        if(customers.peek() == null){
            return true;
        }
        return false;
    }

    //method to get the size of the queue
    public int size(){
        return customers.size();
    }

    //to string method
    public String toString(){
        String output = "";
        for(Customer c:customers){
            output += c;
        }
        return output; 
    }

}