package balicek;

public class fibonaci {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        sucetPrvkuVstupnychPoli(x);

    }

    public static void sucetPrvkuVstupnychPoli(int[] x) {
        int y = 0;
        for (int i = 0; i <x.length; i++) {
            y = y + x[i];
        }
        System.out.println(y);
    }

}
