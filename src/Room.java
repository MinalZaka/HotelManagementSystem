/**
 *
 * @author Minal Zaka
 */
public class Room 
{
    private int roomNum;
    private String roomType;
    private int capacity;
    private boolean smokingAllowed;
    private int floor;
    private boolean available;

    public Room(int roomNum, String roomType, int capacity, boolean smokingAllowed, int floor, boolean available)
    {
        this.roomNum = roomNum;
        this.roomType = roomType;
        this.capacity = capacity;
        this.smokingAllowed = smokingAllowed;
        this.floor = floor;
        this.available = available;
    }

    public int getRoomNum() 
    {
        return roomNum;
    }
    
    @Override
    public String toString()
    {
        return "Room: \nRoom Number:" + roomNum
                +"\nRoom type: " + roomType
                +"\nCapacity: " + capacity
                +"\nFloor: " + floor
                +"\nSmoking Allowed? : " + smokingAllowed
                +"\nAvailability: " + available
                +"\n";
    }
    
}
