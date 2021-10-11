public class ArrayDemo2 {
    public static void main(String[] args) {
        String[] monate = {"Jänner", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        int zahl = 1;
        for(int t=0; t < monate.length; t++)
        {
            System.out.println(monate[t] +" "+ zahl++);
        }
    }
}
