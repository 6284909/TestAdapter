public class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("car accelerate"); // Implémentation de l'accélération pour une voiture
    }

    @Override
    public void pushBrake() {
        System.out.println("car push brake"); // Implémentation du freinage pour une voiture
    }

    @Override
    public void soundHorn() {
        System.out.println("Beep... Beep"); // Implémentation du klaxon pour une voiture
    }
}