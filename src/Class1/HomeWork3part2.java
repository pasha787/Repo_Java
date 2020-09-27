package Class1;

public class HomeWork3part2 {
    public static void main(String[] args) {
        String strNew = "hello dear, how are you?";
        int lenght = strNew.length();
        String result = lenght>10?"yes":"no";
        System.out.println("Does lenght of" + strNew + "is greater than 10? " + result + " its " + lenght);

        String threeWordsSentence = "veRy GooD mOrNinG";
        System.out.println("Before conversion: " + threeWordsSentence);
        threeWordsSentence = threeWordsSentence.toLowerCase();
        String words1[] = threeWordsSentence.split(" ");
        String L1 = words1[0].substring(0,1);
        L1 = L1.toUpperCase();
        String restLetters = words1[0].substring(1);
        restLetters = restLetters.toLowerCase();
        words1[0] = L1 + restLetters;

        words1[1].charAt(0);
        String L2 = words1[1].substring(0,1);
        L2 = L2.toUpperCase();
        String restLetters2 = words1[1].substring(1);
        restLetters = restLetters.toLowerCase();
        words1[1] = L2 + restLetters2;

        words1[2].charAt(0);
        String L3 = words1[2].substring(0,1);
        L3 = L3.toUpperCase();
        String restLetters3 = words1[2].substring(1);
        restLetters = restLetters.toLowerCase();
        words1[2] = L3 + restLetters3;
        threeWordsSentence = words1[0] + " " + words1[1] + " " + words1[2];

        System.out.println("After conversion: " + threeWordsSentence);

        String threeWordsSentence1 = "lab sessIONS cLAsses";
        System.out.println("Three Word Sentence: " + threeWordsSentence1);
        threeWordsSentence1 = threeWordsSentence1.toUpperCase();
        String words2[] = threeWordsSentence1.split(" ");
        threeWordsSentence1 = words2[0].substring(0,1) + words2[1].substring(0,1) + words2[2].substring(0,1);
        System.out.print("Abbreviation of three words sentence is: " +threeWordsSentence1);
    }
}
