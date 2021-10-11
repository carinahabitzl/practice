public class ArrayDemo1 {
    public static void main(String[] args) {
        int [] array1 = {3, 4, 5};
        int [] array2 = {7,1,3};

        System.out.print("+, ");
        for (int i = 0; i < array1.length; i++) {

            System.out.print(array1[i] + array2[i] + ", ");
        }
        System.out.println();
        System.out.print("*, ");
        for (int i = 0; i < array1.length; i++) {

            System.out.print(array1[i] * array2[i] + ", ");
        }
        System.out.println();

        String[] tage = {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};
        for (int t=0; t<tage.length; t++){
            System.out.println(tage[t]);
        }
    }
}
