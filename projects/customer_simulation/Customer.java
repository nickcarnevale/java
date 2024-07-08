//Nick Carnevale
//CSE_17
//HW_4
//Class Customer
//Date Created 10/20

//class to create a customer object to be used in the customer queue
public class Customer{

    //private data members to be used by Customer
    private int customerNo;
    private int arrivalTime;
    private int waitingTime;

    //customer with three parameters
    //sets customerNo, arrivalTime, waitingTime
    public Customer(int cn, int at, int wt){
        customerNo = cn;
        arrivalTime = at;
        waitingTime = wt;
    }

    //method to get customer number
    public int getCustomerNo(){
        return customerNo;
    }

    //method to get arrival time
    public int getArrivalTime(){
        return arrivalTime;
    }

    //method to get waiting time
    public int getWaitingTime(){
        return waitingTime;
    }

    //method to set customer number
    public void setCustomerNo(int cn){
        customerNo = cn;
    }

    //method to set arrival time
    public void setArrivalTime(int at){
        arrivalTime = at;
    }

    //method to set arrival time
    public void setWaitingTime(int wt){
        waitingTime = wt;
    }

    //method to increment waiting time
    public void incrementWaitingTime(){
        waitingTime++;
    }

    //to string method
    public String toString(){
        return " Customer " + customerNo + ", ";
    }

}