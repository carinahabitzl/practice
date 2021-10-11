public class Tagesabschnitt {
    public static void main(String[] args) {
        int Tageszeit = 16;

        if (Tageszeit >=6 && Tageszeit <=9){
            System.out.println("Früh");
        }
            else if (Tageszeit >=9 && Tageszeit <=12){
            System.out.println("Vormittag");
        }
            else if (Tageszeit >=12 && Tageszeit <=16){
            System.out.println("Nachmittag");
            }
            else if (Tageszeit >=16 && Tageszeit <=20){
        System.out.println("Abend");}

        else {
            System.out.println("Nacht");
        }

    }
}
