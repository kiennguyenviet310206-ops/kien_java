public class DOOR {
    private String iddoor;
    private String material;
    private boolean isopen;

    public String getId() {
        return iddoor;
    }

    public void setID(String iddoor) {
        this.iddoor = iddoor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isOpened() {
        return isopen;
    }

    public void setOpened(boolean isopen) {
        this.isopen = isopen;
    }
}
