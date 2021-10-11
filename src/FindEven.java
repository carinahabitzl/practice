public class FindEven {
    public static void main(String[] args) {
        int zahl =1;
        int end = 11;
        while(zahl<end) {
                System.out.println("Ich bin in der Schleife");
                if (zahl % 2 == 0) {
                    System.out.println("Ich bin gerade: " + zahl);
            }
                zahl++;
        }
        for(int i =1; i<=10;i++)
        {
            System.out.println("Durchlauf: "+i);
        }
        for(int j =10; j>0; j--)
        {
            System.out.println("Durchlauf: "+j);
        }
    }
}
