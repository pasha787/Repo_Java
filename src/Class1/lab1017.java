package Class1;

public class lab1017 {
    public static void main(String[] args) {
        String vowels = "have a great day a ahead";
        vowels = vowels.toLowerCase();
        findVowels(vowels);

    }


    public static void findVowels (String vowels) {
        int count1 = 0;
        for (int i = 0; i < vowels.length(); i++) {
            if (vowels.charAt(i) == 'a' || vowels.charAt(i) == 'e' || vowels.charAt(i) == 'o' || vowels.charAt(i) == 'i' || vowels.charAt(i) == 'u') {
                count1++;
            }

        }
        System.out.println(count1);

    }}