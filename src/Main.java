public class Main {
    public static void main(String[] args) {
        PetService petService = new PetService();
        System.out.println("Basic checkup: $" + petService.calculateFee());
        System.out.println("Checkup with vaccination: $" + petService.calculateFee(true));
        System.out.println("Full service: $" + petService.calculateFee(true, true));
        System.out.println("Emergency: $" + petService.calculateFee("Urgent"));
        System.out.println("\n");

        System.out.println("Welcome to the Pet Clinic!");
        System.out.println("----------------------------------------");
        Pet dog = new Dog("Buddy", 3);
        Pet cat = new Cat("Whiskers", 2);
        Pet bird = new Bird("Tweety", 1);

        dog.displayInfo();
        dog.makeSound();

        System.out.println();

        cat.displayInfo();
        cat.makeSound();

        System.out.println();

        bird.displayInfo();
        bird.makeSound();
        System.out.println("\n");

        System.out.println("Training Session Started!");
        System.out.println("----------------------------------------");

        Trainable[] trainablePets = {new Dog("Max", 4), new Bird("Chirpy", 1)};

        for (Trainable trainablePet : trainablePets) {
            trainablePet.performTrick();
        }
    }
}
