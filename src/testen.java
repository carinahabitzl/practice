public class testen {
    public static void main(String[] args) {

        String myString = "Mein Text";
        String myString2 = "Mein Text";

        boolean sameObject = myString == myString2;
        System.out.println("same object? "+sameObject);

        boolean sameValue = myString.equals(myString2);
        System.out.println("same value? "+sameValue);

    }
}
