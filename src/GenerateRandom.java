import java.util.Random;

public class GenerateRandom {
    public static void main(String[] args) {

        Random rand = new Random();
        // Generate random integers
        int rand_int1 = rand.nextInt();

        // Print random integers
        System.out.println("Random Integers: " + Math.abs(rand_int1));

    }
}
