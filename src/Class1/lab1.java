package Class1;

public class lab1 {
    public static void main(String[] args) {
        double xkm = 1;
        double xm;
        double xm1 = 1;
        xm = xkm/1.609;
        boolean rs1 = xm1==xm;
        System.out.println(xkm +  " kilometer equal " + xm1 + " miles " + rs1);
        System.out.println(xkm + " kilometers equal to " + xm + "miles");

        int hour = 60;
        int min = 60;
        double hourSec = hour*min;
        double hours4 = 4*hourSec;
        boolean comp1 = hours4 == 14400;
        System.out.println("Does 14400 second equal to 4 hours? " + comp1);
    }
}
