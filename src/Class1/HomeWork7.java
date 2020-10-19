package Class1;

public class HomeWork7 {
    public static void main(String[] args) {
        double arr[] = new double[]{38.67, 24, 95, 235.85, 968.34, 3948.23};
        addNum(arr);
        //System.out.println(sum);
        int arr1[] = new int[]{3, 7, 4, 8, 9, 1, 0};
        checkPrime(arr1);
        String polindrome = "racecar";
        checkPalindrome(polindrome);

        String duplicate[] = new String[]{"hello", "peace", "happy" , "Hello", "Happy", "hello"};
        checkDuplicate(duplicate);

        String com1[] = new String[]{"hello", "peace", "happy" , "hello", "Happy", "hello", "laugh"};
        String com2[] = new String[]{"hello", "grow", "laugh" , "peace"};
        checkCommonValues(com1, com2);

    }

    public static double addNum(double[] arr) {
        double sum = 0.00;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void checkPrime(int[] arr1) {
        int m = 0;
        int flag = 0;
        for (int i = 0; i <= arr1.length-1; i++) {
            boolean isPrime = true;
            for (int i1 = 2; i1 < i; i1++) {
                if (arr1[i] % i1 == 0) {
                    System.out.println(arr1[i] + " is not a prime number");
                    isPrime = false;
                    break;
                }
                if (isPrime) {
                    System.out.println(arr1[i] + " is a prime number");
                }
            }
        }
    }

    public static void checkPalindrome (String pol) {
        String pol1 = "";
        int i = pol.length() - 1;
        while (i >= 0) {
            pol1 = pol1 + pol.charAt(i);
            i--;
        }
        if (pol1.equalsIgnoreCase(pol)) {
            System.out.println(pol + " String is polindrome");
        } else { System.out.println(pol + " String is not polindrome");
    }
        }


    public static void checkDuplicate(String[] dup) {
        String dup1= "";
        for (int i = 0; i<= dup.length-2; i++) {
            dup[i] = dup[i].toLowerCase();
            for (int j = i; j <= dup.length - 2; j++) {
                if (dup[i].equalsIgnoreCase(dup[j + 1]) & !dup1.contains(dup[i])) {
                    dup1 = dup1 + dup[i] + " ";
                }
            }
        }
            System.out.println(dup1 + "Is duplicate values in given String");

    }

    public static void checkCommonValues(String arr1[], String arr2[]) {
        String result = "";
        for (int i=0; i<=arr1.length-1; i++) {
            for (int j=0; j <= arr2.length-1; j++) {
                if (arr1[i].equalsIgnoreCase(arr2[j]) & !result.contains(arr1[i])) {
                    result = result + arr1[i] + " ";
                }
            }
        }
        System.out.println("common values between two arrays " + result);
    }
}


