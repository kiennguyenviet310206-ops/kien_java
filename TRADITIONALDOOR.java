public class TRADITIONALDOOR extends DOOR {
    private int doorLeaves;
    private String openDirection;
    private int numKeysIncluded;

    public int getDoorLeaves() {
        return doorLeaves;
    }

    public void setDoorLeaves(int doorLeaves) {
        this.doorLeaves = doorLeaves;
    }

    public String getOpenDirection() {
        return openDirection;
    }

    public void setOpenDirection(String openDirection) {
        this.openDirection = openDirection;
    }

    public int getNumKeysIncluded() {
        return numKeysIncluded;
    }

    public void setNumKeysIncluded(int numKeysIncluded) {
        this.numKeysIncluded = numKeysIncluded;
    }
}
