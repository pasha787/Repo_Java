package Class1;

public class HomeWork5 {
    public static void main(String[] args) {
        String text1 = "have a great day to you";
        System.out.println("Message " + text1);
        text1 = text1.toUpperCase();
        String arr1[] = text1.split(" ");
        String ans1 = "";
        for (int i = 0; i <= arr1.length-1; ++i) {
            ans1 = ans1 + arr1[i].charAt(0);
        }
        System.out.println("Abbreviation " + ans1);

        String text2 = "once upOn a tiMe in the UNIVERSE";
        System.out.println("Line (Before modification) : " + text2);
        text2 = text2.toLowerCase();
        String[] arr2 = text2.split(" ");
        String ans2 = "";
        for(int i1 = 0; i1 < arr2.length; ++i1) {
            ans2 = ans2 + " " + arr2[i1].substring(0, 1).toUpperCase() + arr2[i1].substring(1);
        }
        System.out.println("Line (After modification) " + ans2);

        String text3 = "Happy Holidays 123";
        String ans3 = "";
        int i2 = text3.length() - 1;
        while (i2>=0) {
            ans3 = ans3 + text3.charAt(i2);
            i2--;
        }
        System.out.println("Message " + text3);
        System.out.println("Message in reverse " + ans3);
    }
}
