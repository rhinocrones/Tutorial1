package core.less6.hw;

public class Wheel {
    private int wheelSize;
 
    private WheelType wheelType;
 
    public Wheel() {
    }
 
    public Wheel(int wheelSize, WheelType wheelType) {
        this.wheelSize = wheelSize;
        this.wheelType = wheelType;
    }
 
    public int getWheelSize() {
        return wheelSize;
    }
 
    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }
 
    public WheelType getWheelType() {
        return wheelType;
    }
 
    public void setWheelType(WheelType wheelType) {
        this.wheelType = wheelType;
    }
 
    public void changeWheel(int newSize, String wheelType) {
        if (wheelSize >= 15
                && (WheelType.SUMMER.name()).equals(wheelType.toUpperCase())) {
            wheelSize = newSize;
            System.out.println("Замінено колесо, новий розмір: " + wheelSize);
        } else {
            System.out.println("Неможливо замінити колесо!!");
        }
    }
 
    @Override
    public String toString() {
        return "Wheel [wheelSize=" + wheelSize + ", wheelType=" + wheelType
                + "]";
    }
 
}
