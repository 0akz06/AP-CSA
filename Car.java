public class Car extends Type{
    private int TopSpeed; 

public Car(int TopSpeed, int passengersNumber, String color) {
    super(passengersNumber, color);
        
    this.TopSpeed = TopSpeed;
   
    }
        public int getTopTime() {
        return TopSpeed;
        }

    }



