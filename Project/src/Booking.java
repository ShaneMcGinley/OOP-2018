import java.text.*;
import java.util.*;

public class Booking {
    private Customer customer;
    private Room room;
    private GregorianCalendar dateIn;
    private GregorianCalendar dateOut;


    SimpleDateFormat f3 = new SimpleDateFormat("EEEE MMMM dd'th', yyyy");

    public GregorianCalendar getDateIn() {
        return dateIn;
    }

    public void setDateIn(GregorianCalendar dateIn) {
        this.dateIn = dateIn;
    }

    public GregorianCalendar getDateOut() {
        return dateOut;
    }

    public void setDateOut(GregorianCalendar dateOut) {
        this.dateOut = dateOut;
    }

    public Booking(){

        this.customer = new Customer("Unknown","Unknown","Unknown","Unknown","Unknown","Unknown",0);
        this.room = new Room(0,"Unknown",false,false,false);
        this.dateIn = new GregorianCalendar();
        this.dateOut = new GregorianCalendar();;
    }

    public Booking(Customer customer, Room room, GregorianCalendar dateIn, GregorianCalendar dateOut){
        this.customer = customer;
        this.room = room;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String toString(){
        return this.getCustomer() + "\n" + f3.format(dateIn.getTime());
    }


}
