import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20!");
            }
        } while (size > 20);
        array = new int[size];
        for( int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Property list: ");
        for (int j =0; j < size; j++) {
            System.out.printf(array[j] + "\t");
        }
        int max = array[0];
        int index = 0;
        for (int j = 0; j < size; j++) {
            if( max < array[j]) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.printf("\nThe largest value in the array is " + max + " and it's at position " + index);
    }
}