package core.less6.hw;

public class Body {
    private String bodySerialNumber;
 
    private BodyType bodyType;
 
    private String bodyColor;
 
    public Body() {
    }
 
    public Body(String bodySerialNumber, BodyType bodyType, String bodyColor) {
        this.bodySerialNumber = bodySerialNumber;
        this.bodyType = bodyType;
        this.bodyColor = bodyColor;
    }
 
    public String getBodyColor() {
        return bodyColor;
    }
 
    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }
 
    public String getBodySerialNumber() {
        return bodySerialNumber;
    }
 
    public void setBodySerialNumber(String bodySerialNumber) {
        this.bodySerialNumber = bodySerialNumber;
    }
 
    public BodyType getBodyType() {
        return bodyType;
    }
 
    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
 
    public void changeSerialNumber(String newBodyType, String firstTwoLetters) {
        if ((BodyType.CABRIOLET.name()).equals(newBodyType.toUpperCase())) {
            bodySerialNumber = firstTwoLetters.toUpperCase() + 777;
            System.out.println("Новий серійний номер: " + bodySerialNumber);
        } else
            System.out.println("Не вдалося змінити серійний номер!");
    }
 
 
    @Override
    public String toString() {
        return "Body [bodySerialNumber=" + bodySerialNumber + ", bodyType="
                + bodyType + ", bodyColor=" + bodyColor + "]";
    }
 
 
 
}
