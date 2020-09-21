package Class1;

public class HomeWork2 {
    public static void main(String[] args) {
        double dC = 28;
        double dF = 95;
        double dK = 332.0;
        double FC = (dF - 32.0) * 5.0/9.0;
        double FK = (dF - 32.0) * 5.0/9.0+273.15;
        double KC = dK - 273.15;
        double KF = (dK-273.15)*9/5+32;
        double CF = dC*9/5+32;
        double CK = dC+273.15;
        System.out.println(dF + " degrees in fahrenheit equal to " + FC + " degrees celsius");
        System.out.println(dF + " degrees in fahrenheit equal to " + FK + " degrees Kelvin");
        System.out.println(dK + " degrees in Kelvin equal to " + KC + " degrees celsius");
        System.out.println(dK + " degrees in Kelvin equal to " + KF + " degrees fahrenheit");
        System.out.println(dC + " degrees in celsius equal to " + CF + " degrees fahrenheit");
        System.out.println(dC + " degrees in celsius equal to " + CK + " degrees Kelvin");
    }
}
