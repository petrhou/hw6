public class Car {
    private int id;
    private String mark;
    private String model;
    private int year;
    private String color;
    private double price;
    private String regnum;

    public Car(int id, String mark, String model, int year, String color, double price, String regnum) {
        this.id = id;
        this.mark = mark;
        this.model = model
        this.year  = year;
        this.color = color;
        this.price = price;
        this.regnum = regnum;
    }

    public int getId() { return id; }
    public String getMark() { return mark; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getColor() { return color: }
    public double getPrice() { return price; }
    public String getRegnum() { return regnum; }
}