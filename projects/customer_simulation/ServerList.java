//Nick Carnevale
//CSE_17
//HW_4
//Class ServerList
//Date Created 10/20

import java.util.ArrayList;

//this class creates the server list of type array list
public class ServerList{

    //private data members
    private ArrayList<Server> list;

    //constructor that creates an arraylist of servers for the number of servers in the parameter
    public ServerList(int servers){
        list = new ArrayList<Server>(servers);
        for(int i = 0; i < servers; i++){
            list.add(new Server());
        }
    }

    //method to get a free server from the array list
    public int getFreeServer(){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).isFree()){
                return i; 
            }
        }
        return -1;
    }

    //method to set a specific index of a the server list to busy
    public void setServerBusy(int i, Customer c, int serviceTime){
        list.get(i).setCurrentCustomer(c);
        list.get(i).setServiceTime(serviceTime);
        list.get(i).setBusy();
    }

    //method to update the service times of all of the busy servers in the array list
    //also sets servers to free if their service time is 0
    public void updateServiceTime(){
        for(Server server : list){
            
            if(!server.isFree() && server.getServiceTime() == 0){
                server.setFree();
            }
            else if(!server.isFree()){
                server.decrementServiceTime();
            }
        }      
    }

    //method to get the number of busy servers in the array list
    public int getBusyServers(){
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(!list.get(i).isFree()){
                count++; 
            }
        }
        return count;
    }

    //blank to string method because server list was never needed to be printed in Simulation.java
    public String toString(){
        return "";
    }
  

}