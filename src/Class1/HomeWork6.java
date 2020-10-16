package Class1;

public class HomeWork6 {
    public static void main(String[] args) {
        int[] values = new int[]{11, 22, 33, 44, 55, 69};
        double arrayAvg = arrayAvg(values);
        System.out.println("Avarage in the array is " + arrayAvg);

        String[] allnames = new String[]{"john", "michael", "gphilipppre", "philip", "ilena", "palena", "fahry"};
        String yourName = "philip";
        findNameIndex(allnames, yourName);

    }
    public static double arrayAvg(int[] arr) {
        double sum = 0.00;
        int count;
        for (count = 0; count < arr.length; ++count) {
            sum += (double) arr[count];
        }
        count = arr.length;
        return sum / (double) count;
    }

        public static void findNameIndex(String[] names, String nameToSearch) {
            int nameIndex = -1;
            for(int i = 0; i < names.length; ++i) {
                if (names[i].equalsIgnoreCase(nameToSearch)) {
                    nameIndex = i;
                    break;
                }}
                System.out.println(nameToSearch + " is at index -> " + nameIndex);

}}
