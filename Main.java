public class Main{
    public static void main(String[]args){
        // object of car class
          car a = new car("MARUTI","800",4,4,"Automatic");
          a.Start_Engine();
          a.Start_AC();
          a.Stop_Engine();

        // object of bike class
        bike b = new bike("passion","honda",2,"U","soft");
        b.Start_Engine();
        b.wheelie();
        b.Stop_Engine();

    } 
}


/* VEHICLE CLASS DEFINED */


class vehicle{// PARENT CLASS
    String name;
    String model;
    int NoOfWheels;

    vehicle(){
        this.name="";
        this.model="";
        this.NoOfWheels=0;
    }

    vehicle(String name, String model, int NoOfWheels){
        this.name=name;
        this.model = model;
        this.NoOfWheels = NoOfWheels;
    }

    public void Start_Engine(){
        System.out.println("Engine Started : " + name);
    }
    public void Stop_Engine(){
        System.out.println("Engine Stopped : " + name);
    }
    
}

/* CAR CLASS DEFINED */

class car extends vehicle{
    int NoOfDoors;
    String TransmissionType;

    car(String name, String model, int NoOfTyres, int NoOfDoors, String TransmissionType){
        super(name,model,NoOfTyres);// CALLING PARENT CLASS CONSTRUCTOR(REFER TO THE INSTINCE OF PARENT CLASS)
        this.NoOfDoors = NoOfDoors;
        this.TransmissionType = TransmissionType;
    }

    public void Start_AC(){
        System.out.println("AC Started : " + name);
    }
}

/* BIKE CLASS DEFINED */

class bike extends vehicle{
    String TypeOfHandle;
    String SuspensionType;

    bike(String name, String model, int NoOfTyres, String TypeOfHandle, String SuspensionType){
         super(name,model,NoOfTyres);// CALLING PARENT CLASS CONSTRUCTOR(REFER TO THE INSTINCE OF PARENT CLASS)
         this.TypeOfHandle = TypeOfHandle;
         this.SuspensionType = SuspensionType;

    }

    public void wheelie(){
        System.out.println("Your Bike Started Wheelie : " + name);
    }
}