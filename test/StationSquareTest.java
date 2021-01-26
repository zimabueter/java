import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StationSquareTest {
@Test
    public void checkPassenger(){
    Passenger gio= new Passenger("Gio",true);
    Passenger nika = new Passenger("Nika",false);
    Passenger ana = new Passenger("Ana",true);
    Train train = new Train();
    train.addPassenger(gio);
    train.addPassenger(nika);
    train.addPassenger(ana);
//    assertTrue(train.getPassengerList().contains(gio));
    assertTrue(train.getPassengerList().contains(nika));
}
}