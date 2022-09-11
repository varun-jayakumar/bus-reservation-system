package busResv;

import java.util.*;
public class BusDemo {
    public static void main(String args[])
    {
        //ArrayList of buses 
        ArrayList<Bus> buses= new ArrayList<Bus>();
        ArrayList<Booking> bookings=new ArrayList<Booking>();
       
        buses.add(new Bus(1, false, 45));
        buses.add(new Bus(2, true, 32));
        buses.add(new Bus(3, true, 47));
       
        int userOption=1;
        Scanner sc= new Scanner(System.in);
      
        while(true)
        {
            if(userOption==1)
            {
            System.out.println("press 1 to book, press 2 two view booking info and press 3 to quit");
            userOption = sc.nextInt();

            for(Bus b:buses)
            {
                b.displayBusInfo();
            }

            if(userOption==1)
            {
                Booking newBooking=new Booking();
                //checking if booking is available
               
               if(newBooking.isAvailable(bookings, buses))
               {
                bookings.add(new Booking(newBooking.getPassangerName(),newBooking.getBusNo(), newBooking.getDate()));
               }
               else
               {
                System.out.println("try another bus or date");
               }
            }
        }

        if(userOption==2)
        {
            System.out.println("here is the booking info:");
            for(Booking booking:bookings)
            {
                booking.viewBookingInfo();
            }

            System.out.println("press 1 to initiate another booking press 3 to quit");
            userOption=sc.nextInt();
        }

        if(userOption==3)
        {
            System.out.println("You have successfully quit the app");
            
            break;
        }

       
         } sc.close();
      
    }

}

