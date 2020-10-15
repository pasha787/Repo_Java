package Class1;

import javax.swing.*;

public class printer {
    int toner = 0;
    int pages = 0;

    public void add(int tLevel, int pLevel) {
        if (tLevel <= 100 & pLevel <= 100) {
            toner = tLevel;
            pages = pLevel;
        } else {
            System.out.println("You overload your printer");
        }}
        public void printSingle(int single) {
            toner = toner - single;
            pages = pages - single;
            System.out.println("After printing " + single + "single pages your toner level is " + toner + " Your remaining pages is " + pages);
        }
        public void printDouble(int double1) {
        toner = toner - double1;
        pages = pages - double1/2;
            System.out.println("After printing " + double1 + "double pages your toner level is " + toner + " Your remaining pages is " + pages);
        }
        public void printerSummary() {
        System.out.println("Toner count = " + toner + " Number of remaining pages = " + pages);
    }



}