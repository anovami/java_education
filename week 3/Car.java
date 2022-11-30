public class Car {
    String carBrand;
    String colour;

    public Car(String carBrand, String colour) {
        this.carBrand = carBrand;
        this.colour = colour;
    }

    public Car() {

    }

    public String move() {
        return " поехала";
    }

    public String stop() {

        return " затормозила";
    }

    public static void main(String[] args) {
        Car ford = new Car("Ford", "blue");
        Car mitsubishi = new Car("Mitsubishi", "white");
        Car volvo = new Car();
        volvo.carBrand = "Volvo";
        volvo.colour = "green";

        System.out.println("Первая машина: " + ford.carBrand + " Цвет: " + ford.colour);
        System.out.println("Вторая машина: " + mitsubishi.carBrand + " Цвет: " + mitsubishi.colour);
        System.out.println("Третья машина: " + volvo.carBrand + " Цвет: " + volvo.colour);

        System.out.println("Машина " + ford.carBrand + ford.move());
        System.out.println("Машина " + mitsubishi.carBrand + mitsubishi.stop());
    }



}
