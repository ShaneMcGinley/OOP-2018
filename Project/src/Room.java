public class Room {
    private int roomNo;
    private String roomType;
    private boolean occupancy;
    private boolean balcony;
    private boolean smoking;

    public Room(){
        this(0,"Unknown",false,false,false);
    }

    public Room(int roomNo, String roomType, boolean occupancy, boolean balcony, boolean smoking) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.occupancy = occupancy;
        this.balcony = balcony;
        this.smoking = smoking;
    }

    public double getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String rooType) {
        this.roomType = rooType;
    }

    public boolean isOccupancy() {
        return occupancy;
    }

    public void setOccupancy(boolean occupancy) {
        this.occupancy = occupancy;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    @Override
    public String toString() {
        return "Room Number: " + this.getRoomNo() + "\nRoom Type: " + this.getRoomType() + "\nRoom Taken? " + this.isOccupancy()
                + "\nBalcony? " + this.isBalcony() + "\nSmoking? " + this.isSmoking();
    }
}
