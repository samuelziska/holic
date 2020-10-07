package balicek;

public class Pokus {
    public static void main(String[] args) {


        String meno = "Samuel ziska";
        int pocet = meno.length();

            if (meno.length()< 12) {

                System.out.println("ma menej ako 12 znakov");}
            else{
                System.out.println("nic sa nevikonalo");
            }
        System.out.println(meno.length()+meno.charAt(2));


    }
}
