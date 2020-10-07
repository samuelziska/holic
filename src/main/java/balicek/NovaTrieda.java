package balicek;

public class NovaTrieda {
    public static void main(String[] args) {
        osoba jano = new osoba();
        osoba jana = new osoba( " jana",  15,  false);
        osoba petr = new osoba(  " petr",  16,  false);
        osoba nika = new osoba(  " nika", 16, false);

        String menoFero = jana.getMeno();
        System.out.println(menoFero+ " " +jana.pohlavie+ " " +jana.getVek()+ " " + jana.isJeVskole());
        String menoJana = petr.getMeno();
        System.out.println(menoJana+ " " +petr.pohlavie+ " " +petr.getVek() + " " + petr.isJeVskole());
        String menoPetra = nika.getMeno();
        System.out.println(menoPetra+ " " +nika.pohlavie+ " " +nika.getVek() + " " + nika.isJeVskole());

        System.out.println(" " + " " + " " + " ");

        osoba[] Osoby = {jana , petr , nika};
        for (int i =0; i<Osoby.length; i++) {
            Osoby [i].setVek(18);
            System.out.println(Osoby[i].getVek());
        }

        jana.setMeno("Oliver");
        System.out.println(jana.getMeno());
    }



}