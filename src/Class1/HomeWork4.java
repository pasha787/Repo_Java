package Class1;

public class HomeWork4 {
    public static void main(String[] args) {
        double stScore = 155;
        double maxScore = 160;
        double percentage = stScore / maxScore * 100;
        int percent = (int) percentage;
        if (percent >= 91) {
            System.out.print("your percentage is " + percentage + " your grade is: A");
        } else if (percent >= 81) {
            System.out.print("your percentage is " + percentage + " your grade is: B");
        } else if (percent >= 71) {
            System.out.print("your percentage is " + percentage + " your grade is: C");
        } else if (percent >= 61) {
            System.out.print("your percentage is " + percentage + " your grade is: D");
        } else if (percent >= 51) {
            System.out.print("your percentage is " + percentage + " your grade is: E");
        } else if (percent <= 50) {
            System.out.print("your percentage is " + percentage + " your grade is: F");
        }



        int value1 = 15;
        if (value1%3==0 && value1 %5==0) {
            System.out.print(" divisible by both");
        }    else if (value1 %5==0) {
            System.out.print(" divisible by 5");
        }   else if (value1 %3==0) {
            System.out.print(" divisible by 3");
        }   else {
            System.out.print(" number is " + value1);
    }


        char gear = 'D';
        String cMode = "Sport";
        switch (gear) {
            case 'P':
                System.out.print(" you can park car");
                break;
            case 'D':
                if (cMode == "Snow") {
                System.out.print(" You are on Snow mode");
            }   else if  (cMode == "Sport") {
                System.out.print(" You are on Sport mode");
            }   else if (cMode == "Eco") {
                System.out.print(" You are on Eco mode");
            }
                break;
            case 'N':
                System.out.print(" put car in car wash");
                break;
            case 'R':
                System.out.print(" reverse the car");

        }
    }
}
