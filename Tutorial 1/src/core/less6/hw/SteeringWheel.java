package core.less6.hw;

public class SteeringWheel {
	 
    private SteeringWheelType steeringWheelType;
 
    private SteeringWheelButtons steeringWheelButtons;
 
    private String sWProducer;
 
    private int steeringWheelSize;
 
    public SteeringWheel() {
    }
 
    public SteeringWheel(SteeringWheelType steeringWheelType,
            SteeringWheelButtons steeringWheelButtons, String sWProducer,
            int steeringWheelSize) {
        this.steeringWheelType = steeringWheelType;
        this.steeringWheelButtons = steeringWheelButtons;
        this.sWProducer = sWProducer;
        this.steeringWheelSize = steeringWheelSize;
    }
 
    public int getSteeringWheelSize() {
        return steeringWheelSize;
    }
 
    public void setSteeringWheelSize(int steeringWheelSize) {
        this.steeringWheelSize = steeringWheelSize;
    }
 
    public SteeringWheelButtons getSteeringWheelButtons() {
        return steeringWheelButtons;
    }
 
    public void setSteeringWheelButtons(
            SteeringWheelButtons steeringWheelButtons) {
        this.steeringWheelButtons = steeringWheelButtons;
    }
 
    public SteeringWheelType getsteeringWheelType() {
        return steeringWheelType;
    }
 
    public void setsteeringWheelType(SteeringWheelType steeringWheelType) {
        this.steeringWheelType = steeringWheelType;
    }
 
    public String getsWProducer() {
        return sWProducer;
    }
 
    public void setsWProducer(String sWProducer) {
        this.sWProducer = sWProducer;
    }
 
    public void changeSW(String type, String newsTW) {
        if ((SteeringWheelType.SPORT.name()).equals(type.toUpperCase())) {
            sWProducer = newsTW;
            System.out.println("Спортивне кермо замінено, виробник "
                    + sWProducer);
        } else
            System.out.println("Невдалося замінити кермо");
    }
 
    @Override
    public String toString() {
        return "SteeringWheel [steeringWheelType=" + steeringWheelType
                + ", steeringWheelButtons=" + steeringWheelButtons
                + ", sWProducer=" + sWProducer + ", steeringWheelSize="
                + steeringWheelSize + "]";
    }
 
 
}
