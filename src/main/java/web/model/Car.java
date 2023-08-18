package web.model;

public class Car {
    private String name;
    private int serial;

    private String isSold;

    public Car(String name, int serial, String isSold) {
        this.name = name;
        this.serial = serial;
        this.isSold = isSold;
    }

    public String getIsSold() {
        return isSold;
    }

    public void setIsSold(String isSold) {
        this.isSold = isSold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name ='" + name + '\'' +
                ", web.model = '" + serial + '\'' +
                ", Sold ='" + isSold + '\'' +
                '}';
    }
}
