package busResv;

public class Bus {
   private int busNo;
   private boolean ac;
   private int capacity;

   // constructor
    public Bus(int busNo, boolean ac, int capacity) {
        this.busNo = busNo;
        this.ac = ac;
        this.capacity = capacity;
    }

   
    //getters and setters or accessor and mutator
    public int getBusNo() {
        return busNo;
    }


    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    //end of getters and settes
    
    public void displayBusInfo(){
        System.out.println("Bus no:" + this.busNo+ " AC:"+ this.ac +" Capacity: "+capacity);
    }
}
