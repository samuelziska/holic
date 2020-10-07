package balicek;

public class flsfw {
    public static void main(String[] args) {
        for(int i= 0; i<20;i++) {
            int sucet = 0;
        for (int j=0; j<i; j++) {

            if (j%2 == 0){
                sucet = sucet * j;
                }
             }
            System.out.println(i + ":" + sucet);
        }
    }
}
