package busResv;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    private String passangerName;
    private int busNo;
    private Date date;

    public String getPassangerName() {
        return passangerName;
    }

    public void setPassangerName(String passangerName) {
        this.passangerName = passangerName;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Booking(String passangerName, int busNo, Date date) {
        this.passangerName = passangerName;
        this.busNo = busNo;
        this.date = date;
    }

    Booking()
    {
        String dateInput;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Passenger Name:");
        passangerName=sc.nextLine();
        System.out.println("Enter the bus number");
        busNo=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the date you want to book on dd-mm-yyyy");
        dateInput=sc.nextLine();
        
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(dateInput);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses)
    {
        //count number of bookings on same date and bus
        int count=0;
        for(Booking booking:bookings)
        {
            if(this.busNo==booking.getBusNo()&&this.getDate()==booking.getDate())
            {
                count++;
            }
        }

        
        for(Bus bus:buses)
        {
            if(bus.getBusNo()==this.getBusNo())
            {
                if(count<bus.getCapacity())
                return true;
            }
        }
        return false;
    }

    public void viewBookingInfo()
    {
        System.out.println("Booking name: " + this.passangerName + " Bus Booked:" + this.busNo + " date:"+ this.date);
    }
    
}
