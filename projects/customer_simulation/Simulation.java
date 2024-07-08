//Nick Carnevale
//CSE_17
//HW_4
//Class Simulation
//Date Created 10/20

import java.util.Scanner;

public class Simulation{

    public static void main(String[] args){

        //delcare variables to be used in main
        Scanner scanner = new Scanner(System.in);
        
        //parameters
        int simulationTime = 0; 
        int numServers = 0;
        int customerArrivalRate = 0;
        int serviceTime = 0;
        
        //to repeat until getting a correct parameter
        boolean correct = true;   
        
        //used in simulation
        int customerCounter = 0; 
        int customersServed = 0; 
        double waitingTime = 0.0;

        System.out.println("\nEnter the simulation parameters:");
        
        //get simulation time from user
        //repeat until valid input
        while(correct){
            System.out.print("Simulation time in minutes: ");
            if(scanner.hasNextInt()){
                try{
                simulationTime = Integer.parseInt(scanner.nextLine());
                correct = false;
                }catch(Exception e){
                    System.out.println("Please enter an integer.");
                    scanner.nextLine();
                    correct = true;
                }
            }
            else{
                System.out.println("Please enter an integer.");
                scanner.nextLine();
                correct = true;
            }
        }

        //reset correct for next for loop
        correct = true;
        
        //get number of servers from user
        //repeat until valid input
        while(correct){
            System.out.print("Number of servers: ");
            if(scanner.hasNextInt()){
                try{
                numServers = Integer.parseInt(scanner.nextLine());
                correct = false;
                }catch(Exception e){
                    System.out.println("Please enter an integer.");
                    scanner.nextLine();
                    correct = true;
                }
            }
            else{
                System.out.println("Please enter an integer.");
                scanner.nextLine();
            }
        }

        //reset correct for next loop
        correct = true;

        //get customer arrival rate from user
        //repeat until valid input
        while(correct){
            System.out.print("Customer arrival rate (customers/hour): ");
            if(scanner.hasNextInt()){
                try{
                customerArrivalRate = Integer.parseInt(scanner.nextLine());
                correct = false;
                }catch(Exception e){
                    System.out.println("Please enter an integer.");
                    scanner.nextLine();
                    correct = true;
                }
            }
            else{
                System.out.println("Please enter an integer.");
                scanner.nextLine();
            }
        }

        //reset correct for next loop
        correct = true;

        //get service time from user
        //repeat until valid input
        while(correct){
            System.out.print("Service time in minutes: ");
            if(scanner.hasNextInt()){
                try{
                serviceTime = Integer.parseInt(scanner.nextLine());
                correct = false;
                }catch(Exception e){
                    System.out.println("Please enter an integer.");
                    scanner.nextLine();
                    correct = true;
                }
            }
            else{
                System.out.println("Please enter an integer.");
                scanner.nextLine();
            }
        }

        //initalize a SeverList with number of servers retrieved from user
        ServerList servers = new ServerList(numServers);

        //initalize a blank customer queue
        CustomerQueue customers = new CustomerQueue();

        System.out.println("\nSimulation started ...");

        //simulation for loop
        //iterate till the number of times specified by user in simulationTime
        for(int clock = 0; clock < simulationTime; clock++){
            
            //get time from the for loop
            int time = clock+1;
            
            //update busy server times
            servers.updateServiceTime();
            
            //if customer queue is not empty update their wait time
            if(!customers.isEmpty()){
                customers.updateWaitTime();
            }

            //random variable to see if a customer has arrived
            double p = Math.random();

            //if customer has arrived
            if(p < (double) customerArrivalRate/60){
                
                //incriment customer counter
                customerCounter++;
                
                //add a new customer to the queue with their #, arrival time, and inital waiting time
                customers.addCustomer(new Customer(customerCounter,time,0)); 
                
                //print
                System.out.println("Customer number " + customerCounter + " arrived at time " + time);
            }

            //create a variable from next free server
            int serverNum = servers.getFreeServer();
            
            //if there is a next free server and the customer queue is not empty
            if(serverNum > -1 && !customers.isEmpty()){
                
                //get the next customer
                Customer current = customers.getNextCustomer();
                
                //set the free server to busy with current customer and service time from user
                servers.setServerBusy(serverNum, current, serviceTime);
                
                //add the current customer's waiting time to the total
                waitingTime += current.getWaitingTime();
                
                //incriment customers served
                customersServed++;
                
                //print
                System.out.println("Customer " + current.getCustomerNo() + " assigned to server " + (serverNum+1));
            }
            
        }

        //print all final data after simulation is over
        System.out.println("Simulation completed.");
        
        System.out.println("\n\nThe simulation ran for " + simulationTime + " minutes");
        System.out.println("Number of servers: " + numServers);
        System.out.println("Average service time: " + serviceTime);
        System.out.println("Average number of customers " + customerArrivalRate + " customers/hour");
        
        System.out.println("\nTotal number of customers: " + customerCounter);
        System.out.println("Number of customers servered: " + customersServed);
        System.out.println("Number of customers left in queue: " + (customerCounter-customersServed-servers.getBusyServers()));
        System.out.println("Number of customers being serverd: " + servers.getBusyServers());

        System.out.println("\nTotal waiting time: " + waitingTime);
        System.out.printf("Average waiting time: %.2f\n\n",(waitingTime/customersServed));


    }

}