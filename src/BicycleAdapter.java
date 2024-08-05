public class BicycleAdapter implements Vehicle {
    private Bicycle bicycle;

    public BicycleAdapter(Bicycle bicycle) {
        this.bicycle = bicycle; // Initialisation de l'adaptateur avec une instance de Bicycle
    }

    @Override
    public void accelerate() {
        this.bicycle.pedal(); // Appel de la méthode pedal de Bicycle pour simuler l'accélération
    }

    @Override
    public void pushBrake() {
        this.bicycle.brake(); // Appel de la méthode brake de Bicycle pour simuler le freinage
    }

    @Override
    public void soundHorn() {
        this.bicycle.ringBell(); // Appel de la méthode ringBell de Bicycle pour simuler le klaxon
    }
}