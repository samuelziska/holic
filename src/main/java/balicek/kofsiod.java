package balicek;

public class kofsiod {
    public static void main(String[] args) {
        for (int i = 1; i <100001; i++) {
            if (i%3 == 0) {
                System.out.println("fizz");
                continue;
            }
            if (i%5 == 0) {
                System.out.println("buzz");
                continue;
            }
            if(i%3==0 && i%5==0) {
                System.out.println("fizzbuzz");
                continue;

            }
            System.out.println(i);
        }
    }
}
