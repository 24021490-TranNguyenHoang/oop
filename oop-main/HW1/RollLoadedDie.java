import java.util.Random;

public class RollLoadedDie {
    public static void main(String[] args) {
        Random rand = new Random();
        int r = rand.nextInt(8) + 1;  // số ngẫu nhiên từ 1 đến 8
        int result;

        if (r <= 5) {
            result = r;  // 1,2,3,4,5
        } else {
            result = 6;  // 6,7,8 đều gộp thành 6
        }

        System.out.println("Rolled: " + result);
    }
}

