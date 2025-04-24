import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rand = new Random();
        Integer[] arr = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
}
