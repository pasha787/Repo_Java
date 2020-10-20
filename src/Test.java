import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int input[] = new int[]{32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int remove = 24;
        remove(input, remove);

        int small[] = new int[]{1, 3, 5, 4, 2, 7};
        smallestPositiveInteger(small);

        double speed = 130;
        speedLimit(speed);
    }


    public static int[] remove(int arr1[], int rem) {
        int arr2[] = new int[arr1.length];
        int j = 0;
        for (int i = 0; i <= arr1.length - 1; i++) {
            if (arr1[i] != rem) {
                arr2[j] = arr1[i];
                j = j+1;
            }
        }
        int arr3[] = new int[j];
        for (int i = 0; i<=j-1; i++) {
            arr3[i] = arr2[i];
        }
        /*for (int i=0; i<=arr3.length-1; i++) { //that I print just to test
            System.out.println(arr3[i]);
        } */
        return arr3;
    }

    public static int smallestPositiveInteger(int[] arr2) { //Didn't finish it;
        int result = 9999;
        int j = 1;
        for (int i = 1; i <= arr2.length - 1; i++) {
            for (j=1; j<=arr2.length; j++)
                if (arr2[j-1] != j & j < result) {
                    result = i;
                }
        }
        System.out.println("smallest positive integer " + result);
        return result;
    }

    public static void speedLimit(double speed) {
        int point = 0;
        if (speed <= 70) {
            System.out.println("Thank you for driving within the speed limit.");
        } else {
            for (int i = 5; i <= 300; i = i + 5) {
                if (speed >= 70 + i) {
                    point = point + 1;
                }
            }
            if (point < 12) {
                System.out.println("You speed " + speed + " you got " + point + " points");
            } else if (point >= 12) {
                System.out.println("You speed " + speed + " you got " + point + " points. Your license is suspended");
            }
        }
    }
}
