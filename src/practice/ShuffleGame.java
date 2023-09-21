package practice;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleGame {

    //{1,0,1}
    public static int[] shuffle(int[] array){
        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < array.length; i++) {
            int index = random.nextInt(i+1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,0,1};
        shuffle(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
