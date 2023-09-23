public class Final {
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
