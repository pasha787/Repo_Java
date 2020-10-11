package Class1;

public class oct1 {
    public static void main(String[] args) {
        String names = "Welcome";
        for (int i = 0; i<names.length() ; i+=2) {
            System.out.print(i);
        }
        int [] ssn = {1111, 2222, 3333, 4444, 5555};
        for (int i=0; i<5; i++) {
            System.out.print(ssn[i]);

            for (int i1=10; i1>=1; i1--) {
                System.out.println(i1);
            }
            char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
            for (int i2=0; i2<6; i2++) {
                System.out.println(alphabets[i2]);
            }
            /*
            String st1 = "Welcome1";
            int ind1 = st1.lastIndexOf();
            while (ind1 >0);  {
                System.out.println(st1.charAt(ind1));
                ind1--;
            }
            */
            String classMode1 = "Online";
            String instructor = "Ahsan";

            if(classMode1.equalsIgnoreCase("online")) {
                System.out.println("Be ready for Zoom session");
                if(instructor.equalsIgnoreCase("Deepak")) {
                    System.out.println("Go Deepak's Lab");
                }   else System.out.println("Go Ahsan's Lab");
            } else { System.out.println("Be ready for travel to Campus");

        }
    }
}}
