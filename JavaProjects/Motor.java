public class Motor {
    static String Model;
    static String Brand;
    static double size;
    static String Gear;

    static void speedLimit(String Brand, double size) {
        System.out.println("Maximum speed limit for " + Brand + " Motor with size " + size + " is 120 mph.");
    }

    void moveForward() {
        System.out.println("The vehicle is moving forward with a normal speed.");
    }

    void moveBack() {
        System.out.println("The vehicle is moving backward.");
    }
}

class Bike extends Motor {
    String color = "Blue";

    String discLight(boolean Switch) {
        if (Switch) {
            return "the bike lights are ON";
        } else {
            return "the bike lights are OFF";
        }
    }
}

class ENGINE extends Motor {
    void setBrand(String brand) {
        Brand = brand;
    }

    void setModel(String model) {
        Model = model;
    }

    void setSize(double motorSize) {
        size = motorSize;
    }

    void setGear(String gear) {
        Gear = gear;
    }
}

 class Final {
    public static void main(String[] args) {
        ENGINE engine = new ENGINE();
        engine.setBrand("Yamaha");
        engine.setModel("YZF-R6");
        engine.setSize(600);
        engine.setGear("Manual");

        System.out.println("Brand: " + Motor.Brand);
        System.out.println("Model: " + Motor.Model);
        System.out.println("Size: " + Motor.size);
        System.out.println("Gear: " + Motor.Gear);
    }
}
