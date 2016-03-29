import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by wyh669 on 3/20/16.
 */
public class RandomNumberGeneratorUsingModulus {
    public static void main(String[] args) {

        List < Integer > input1 = new ArrayList();
        for (int i = 0; i < 10; i++) {
            input1.add(i);
        }

        for (int i = 0; i < 2; i++) {
            int previousRandom1 = 0;
            int nextRandom1 = 0;
            Random random1 = new Random();
            boolean firstTime = true;
            previousRandom1 = usingModulus(input1, previousRandom1, nextRandom1, random1, firstTime);
            System.out.println(input1.get(previousRandom1 - 1));
            previousRandom1 = usingModulus(input1, previousRandom1, nextRandom1, random1, false);
            System.out.println(input1.get(previousRandom1 - 1));
            previousRandom1 = usingModulus(input1, previousRandom1, nextRandom1, random1, false);
            System.out.println(input1.get(previousRandom1 - 1));
            previousRandom1 = usingModulus(input1, previousRandom1, nextRandom1, random1, false);
            System.out.println(input1.get(previousRandom1 - 1));
            previousRandom1 = usingModulus(input1, previousRandom1, nextRandom1, random1, false);
            System.out.println(input1.get(previousRandom1 - 1));
            previousRandom1 = usingModulus(input1, previousRandom1, nextRandom1, random1, false);
            System.out.println(input1.get(previousRandom1 - 1));
            previousRandom1 = usingModulus(input1, previousRandom1, nextRandom1, random1, false);
            System.out.println(input1.get(previousRandom1 - 1));
            previousRandom1 = usingModulus(input1, previousRandom1, nextRandom1, random1, false);
            System.out.println(input1.get(previousRandom1 - 1));
            previousRandom1 = usingModulus(input1, previousRandom1, nextRandom1, random1, false);
            System.out.println(input1.get(previousRandom1 - 1));
            previousRandom1 = usingModulus(input1, previousRandom1, nextRandom1, random1, false);
            System.out.println(input1.get(previousRandom1 - 1));
            System.out.println("------------");
        }

    }

    private static int usingModulus(List < Integer > input, int previousRandom1, int nextRandom1, Random random1, boolean firstTime) {
        if (firstTime) {
            nextRandom1 = random1.nextInt(input.size() - 1) + 1;
            previousRandom1 = nextRandom1;
            return previousRandom1;
        }
        if (!firstTime) {
            do {
                nextRandom1 = random1.nextInt(input.size() - 1) + 1;
                nextRandom1 = nextRandom1 * previousRandom1 % input.size() + 1;
            } while ((previousRandom1 == nextRandom1));
            previousRandom1 = nextRandom1;
        }
        return previousRandom1;
    }
}