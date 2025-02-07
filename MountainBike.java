public class MountainBike extends Type{
    
    private int GearsNum;
    private String ShocksType;
    private String BreaksType;
    
 

    public MountainBike(int passengersNumber, String color, int GearsNum, String ShocksType, String BreaksType) {
        super(passengersNumber, color);
            
        this.GearsNum = GearsNum;
        this.ShocksType = ShocksType;
        this.BreaksType = BreaksType;

       // write methods such as the one below 
        }
            public int getTopTime() {
            return TopSpeed;
            }
    
        }
}
