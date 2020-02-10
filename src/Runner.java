public class Runner {
    public static void main(String[] args) {
        Car toyota = new Car (2001, "Prius", 50000, "Toyota");
        System.out.println(toyota.toString());
        toyota.drive(69);
        System.out.println(toyota.toString());

        Rectangle rect = new Rectangle (30, 40);
        System.out.println(rect.getArea());
        System.out.println(rect.getDiagonal());
        System.out.println(rect.isSquare());
    }
}
