/**
 *
 * @author Minal Zaka
 */
public class Room 
{
    private final int roomNum;
    private final String roomType;
    private final int capacity;
    private final boolean smokingAllowed;
    private final int floor;
    private final boolean available;

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

    public String getRoomType()
    {
        return roomType;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public boolean isSmokingAllowed()
    {
        return smokingAllowed;
    }

    public int getFloor()
    {
        return floor;
    }

    public boolean isAvailable()
    {
        return available;
    }
    
    @Override
    public String toString()
    {
        return "Room: "
                + "\nRoom Number: " + roomNum
                + "\nRoom type: " + roomType
                + "\nCapacity: " + capacity
                + "\nFloor: " + floor
                + "\nSmoking Allowed?: " + smokingAllowed
                + "\nAvailability: " + available
                + "\n";
    }
}
