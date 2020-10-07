package balicek;

public class Prvocisla {

   public static void main(String[] args) {
       for (int i =2; i <101; i++) {
           if (test(i) ) {
               System.out.println(i);

           }
       }
   }
   private static boolean test ( int i){
       for( int x=2; x<i; x++){
           if ((i%x)==0) {
               return false;

           }
       }
       return true;
   }

}