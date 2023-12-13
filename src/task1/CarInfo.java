package task1;

import java.time.LocalDate;

public class CarInfo {

    private LocalDate localDate;
    private String model;
    private int price;
    private String color;

    public CarInfo(LocalDate localDate, String model, int price, String color) {
        this.localDate = localDate;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "task1.CarInfo{" +
                "localDate=" + localDate +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
