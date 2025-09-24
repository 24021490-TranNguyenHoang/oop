import java.util.Random;

public class SumOfTwoDice {
    public static void main(String[] args) {
        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1; 
        int die2 = rand.nextInt(6) + 1;
        int sum = die1 + die2;

        System.out.println(sum);
    }
}

