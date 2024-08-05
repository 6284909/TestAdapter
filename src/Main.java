public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Adapter design pattern");
        Vehicle car = new Car(); // Création d'une instance de Car
        useVehicle(car); // Utilisation de l'objet Car comme un Vehicle

        Vehicle bicycle = new BicycleAdapter(new Bicycle()); // Création d'un BicycleAdapter pour un Bicycle
        useVehicle(bicycle); // Utilisation de l'objet BicycleAdapter comme un Vehicle
    }

    private static void useVehicle(Vehicle vehicle) {
        vehicle.accelerate(); // Appel de la méthode accelerate sur l'objet Vehicle
        vehicle.pushBrake(); // Appel de la méthode pushBrake sur l'objet Vehicle
        vehicle.soundHorn(); // Appel de la méthode soundHorn sur l'objet Vehicle
    }
}








