package core.less6.hw;

public class Car {
    public static int carweights;
 
    private String carProducer;
 
    private int carWeight;
 
    private Body body;
 
    private Wheel wheel;
 
    private SteeringWheel steeringWheel;
 
    public Car() {
        carweights += carWeight;
    }
 
    public Car(String carProducer, int carWeight, int wheelSize,
            WheelType wheelType, SteeringWheelType steeringWheelType,
            SteeringWheelButtons steeringWheelButtons, String sWProducer,
            int steeringWheelSize) {
        this.carProducer = carProducer;
        this.carWeight = carWeight;
        this.wheel = new Wheel(wheelSize, wheelType);
        this.steeringWheel = new SteeringWheel(steeringWheelType,
                steeringWheelButtons, sWProducer, steeringWheelSize);
        carweights += carWeight;
    }
 
    public Car(String carProducer, int carWeight, String bodySerialNumber,
            BodyType bodyType, String bodyColor, int wheelSize,
            WheelType wheelType, SteeringWheelType steeringWheelType,
            SteeringWheelButtons steeringWheelButtons, String sWProducer,
            int steeringWheelSize) {
        this.carProducer = carProducer;
        this.carWeight = carWeight;
        this.body = new Body(bodySerialNumber, bodyType, bodyColor);
        this.wheel = new Wheel(wheelSize, wheelType);
        this.steeringWheel = new SteeringWheel(steeringWheelType,
                steeringWheelButtons, sWProducer, steeringWheelSize);
        carweights += carWeight;
    }
 
    public Car(String carProducer, int carWeight, String bodySerialNumber,
            BodyType bodyType, String bodyColor, int wheelSize,
            WheelType wheelType) {
        this.carProducer = carProducer;
        this.carWeight = carWeight;
        this.body = new Body(bodySerialNumber, bodyType, bodyColor);
        this.wheel = new Wheel(wheelSize, wheelType);
        carweights += carWeight;
    }
 
    public static int getCarweights() {
        return carweights;
    }
 
    public String getCarProducer() {
        return carProducer;
    }
 
    public void setCarProducer(String carProducer) {
        this.carProducer = carProducer;
    }
 
    public int getCarWeight() {
        return carWeight;
    }
 
    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }
 
    public Body getBody() {
        return body;
    }
 
    public void setBody(Body body) {
        this.body = body;
    }
 
    public Wheel getWheel() {
        return wheel;
    }
 
    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
 
    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }
 
    public BodyType getBodyType() {
        return body.getBodyType();
    }
 
    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }
 
    public void changeSerialNumber(String newBodyType, String firstTwoLetters) {
        body.changeSerialNumber(newBodyType, firstTwoLetters);
    }
 
    public void changeWheel(int newSize, String wheelType) {
        wheel.changeWheel(newSize, wheelType);
    }
 
    public void setWheelType(WheelType wheelType) {
        wheel.setWheelType(wheelType);
    }
 
    public void changeSW(String type, String newsTW) {
        steeringWheel.changeSW(type, newsTW);
    }
 
    public int getWheelSize() {
        return wheel.getWheelSize();
    }
 
    public void setWheelSize(int wheelSize) {
        wheel.setWheelSize(wheelSize);
    }
 
    public WheelType getWheelType() {
        return wheel.getWheelType();
    }
 
    public String getBodyColor() {
        return body.getBodyColor();
    }
 
    @Override
    public String toString() {
        return "Car [carProducer=" + carProducer + ", carWeight=" + carWeight
                + ", body=" + body + ", wheel=" + wheel + ", steeringWheel="
                + steeringWheel + "]";
    }
 
 
}
