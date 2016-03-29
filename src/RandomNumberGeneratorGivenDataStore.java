import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by wyh669 on 3/20/16.
 */
public class RandomNumberGeneratorGivenDataStore {
    public static void main(String[] args) {
        // First way.
        List < Integer > input = new ArrayList();
        for (int i = 0; i < 1000;) {
            input.add(i);
            i = i + 10;
        }
        usingCollections(input);

        // Second Way
        usingState(input);
    }

    private static int usingState(List < Integer > input) {
        int previousRandom = 0;
        int nextRandom = 0;
        // Second way.
        Random random = new Random();
        while (nextRandom == previousRandom) {
            nextRandom = random.nextInt(input.size() - 1);
        }
        previousRandom = nextRandom;
        return previousRandom;
    }

    private static void usingCollections(List < Integer > input) {
        Collections.shuffle(input);
    }
}