package Class1;

public class HomeWork3 {
    public static void main(String[] args) {
        String fullName = "Pavlo Andrukhov";
        int index1 = fullName.indexOf(" ");
        int lenghtFullN = fullName.length();
        String firstN = fullName.substring(0, index1);
        String LastN = fullName.substring(index1);
        int lenghtOfFirstName = firstN.length();
        System.out.println("My name is " + fullName);
        System.out.println("Lenght of my fist name " +  firstN + " is " + lenghtOfFirstName);
        char lastL = firstN.charAt(lenghtOfFirstName-1);
        System.out.println("Last letter of my first name is " + lastL);
        System.out.println("My Last name is " + LastN);
        LastN = LastN.toUpperCase();
        int lastIndexOfLastName = LastN.length();
        char lastIndex = LastN.charAt(lastIndexOfLastName-1);
        boolean ifLastNameHaveM = lastIndex == 'M';
        System.out.println("Does my last name ends with M? " + ifLastNameHaveM);

        String myStatement = "I am a good programmer";
        String split1[]= myStatement.split(" ");
        int nOfWords = split1.length;
        System.out.println("Number of words in the " + myStatement + " is " + nOfWords);
        myStatement = myStatement.replace("r", "f");
        System.out.println("Statement after replacing 'r' with 'f' is " + myStatement);

        String firstName = "Pavlo";
        String[] lenght1 = new String[1];
        lenght1[0] = firstName;
        int len = lenght1[0].length();
        System.out.println("Lenght of my first name is " + len);


    }
}
