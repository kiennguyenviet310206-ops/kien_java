public class SMARTDOOR extends DOOR {
    private int batteryLevel;
    private String connectionStatus;
    private String unlockMethod;

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public boolean checkConnection() {
        if (connectionStatus == null || connectionStatus.equals("")) {
            return false;
    }   else {
            return true;
    }
}

    public String getUnlockMethod() {
        return unlockMethod;
    }

    public void setUnlockMethod(String unlockMethod) {
        this.unlockMethod = unlockMethod;
    }
}