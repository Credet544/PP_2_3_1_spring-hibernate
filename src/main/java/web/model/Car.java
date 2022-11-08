package web.model;

public class Car {
    private String owner;
    private String color;
    private int id;


    public Car(String owner, String color, int id) {
        this.owner = owner;
        this.color = color;
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "owner='" + owner + '\'' +
                ", color='" + color + '\'' +
                ", id=" + id +
                '}';
    }
}
