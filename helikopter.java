public class helikopter {
    static String warna ="Biru";
    static String merk ="Polizei";
    protected static String pa ="Prancis";    //asal
    private static String kechelikopter ="300km/jam";


    public static void terbangheli(){
        System.out.println("helikopter "+merk+" berwarna"+warna+" bergerak terbang");
    }

    public static void naikhelikopter(){
        System.out.println("helikopter "+merk+" berwarna"+warna+" bergerak naik");
    }
    protected static void pabrikasal(){
        System.out.println("helikopter "+merk+" Berasal dari "+pa);
    }
    public static void kecepatanhelikopter(){
        System.out.println("Maximal kecepatan helikopter mencapai : " +kechelikopter);
    }

    public static void terbanghelikopter() {
    }
}
