//Nick Carnevale
//CSE_17
//HW_4
//Class Server
//Date Created 10/20

//class to create a server object to be used in the ServerList
public class Server{

    //private data members for Server
    private Customer currentCustomer;
    private boolean status;
    private int serviceTime;

    //blank constructor that sets service time to 0 and status to true (which means free) and current customer to null
    public Server(){
        status = true;
        serviceTime = 0;
        currentCustomer = null; 
    }

    //mehtod to return if the server is free or busy
    public boolean isFree(){
        return status;
    }

    //method to set the server to busy
    public void setBusy(){
        status = false;
    }

    //method to set the server to free
    public void setFree(){
        status = true;
    }

    //method to get the service time
    public int getServiceTime(){
        return serviceTime;
    }

    //method to set the service time
    public void setServiceTime(int sTime){
        serviceTime = sTime;
    }

    //method to decrement the service time
    public void decrementServiceTime(){
        serviceTime--; 
    }

    //method to set the current customer of the server
    public void setCurrentCustomer(Customer c){
        currentCustomer = c;
    }

    //method to get the current customer
    public Customer getCurrentCustomer(){
        return currentCustomer;
    }

    //to string method
    //never bothered to initialize this correctly because it was not used.
    public String toString(){
        return "";
    }

}
