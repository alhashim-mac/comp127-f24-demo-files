package c0916_classes;

public class Toaster {
    private boolean operationStaus;
    private String color;
    private int currentTemp;

    public Toaster(boolean os, String c, int ct) {
        operationStaus = os;
        color = c;
        setCurrentTemp(ct);
    }

    public String getColor() {
        return color;
    }

    public boolean getOperationStatus() {
        return operationStaus;
    }

    public void setCurrentTemp(int newTemp) {
        if(newTemp > 0 && newTemp < 100) {
            currentTemp = newTemp;
        }
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    @Override
    public String toString() {
        return operationStaus + " " + color + " " + currentTemp;
    }
}
