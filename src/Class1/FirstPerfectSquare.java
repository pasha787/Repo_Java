package Class1;

public class FirstPerfectSquare {
    public static void main(String[] args) {
        int[] arr1 = new int[]{111, 32, 43, 54, 64, 144, 11, 82, 91, 23};
        findPerSq(arr1);
        //System.out.println(firstPerfect);

    }


    public static int findPerSq(int[] arr1) {
        int firstPerfect = 0;
        boolean foundPerfectSquare = false;
        int index = 0;
        for (int i = 0; i <= 20; i++) {
            index = i * i;
            for (int m = 0; m < arr1.length-1; m++) {
                if (index == arr1[m]) {
                    foundPerfectSquare = true;
                    firstPerfect = arr1[m];
                    break;
                }
            }
        }
        return firstPerfect;
    }
}

