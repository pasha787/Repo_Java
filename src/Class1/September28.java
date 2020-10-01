package Class1;

public class September28 {
    public static void main(String[] args) {
        String name = "Happy";
        boolean result = true;
        int number = 22;
        if (name.length()>10 & number>5) {
            name = name.toUpperCase();
            name = name.replace("p", "b");
        } else result = false;
            System.out.print(result + " " + name);

            String month = "feb";
            switch (month) {
                case "dec":
                case "jan":
                case "feb":
                    System.out.print("Winter");
                    break;
                case "mar":
                case "apr":
                case "may":
                    System.out.print("Spring");
                    break;
                case "jun":
                case "jul":
                case "aug":
                    System.out.print("Summer");
                    break;
                case "sep":
                case "oct":
                case "nov":
                    System.out.print("Fall");
                    break;
                default:
                    System.out.print("Invalid Month");

            }
    }
}
