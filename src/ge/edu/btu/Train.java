package ge.edu.btu;

import java.util.ArrayList;
import java.util.List;

public class Train {
    List<Passenger> passengerList = new ArrayList<>();
public void addPassenger(Passenger passenger){
    if (passenger.haveTicket()==true){
        passengerList.add(passenger);
    }else {
        System.out.println(passenger.getName() +" does not have a ticket");
    }
}
public List<Passenger> getPassengerList(){
    return passengerList;
}
}
