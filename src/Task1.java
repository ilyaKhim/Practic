import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static int[] makeArr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        scanner.close();
      return arr;
    }

    static void makeContent(int[] arr){
        Random random = new Random();
        for(int i = 0; i<arr.length;i++){
            arr[i] = random.nextInt(arr.length);
        }
    }
    static int[] doMerge(int[] arr){
        int[] answer = new int[arr.length];

        return answer;
    }



    public static void main(String[] args) {
        int [] arr = makeArr();
        makeContent(arr);
        System.out.println(Arrays.toString(arr));
        int[] answer = doMerge(arr);
        System.out.println(Arrays.toString(answer));

    }
}

