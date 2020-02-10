public class Car {
    private int year;
    private String model;
    private int miles;
    private String make;

    public Car(int year, String model, int miles, String make) {
        this.year = year;
        this.model = model;
        this.miles = miles;
        this.make = make;
    }

    public int getYear() { return year; }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", miles=" + miles +
                ", make='" + make + '\'' +
                '}';
    }

    public void drive(int miles) {
        this.miles += miles;
    }
}