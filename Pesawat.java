public  class Pesawat {
    static String warna ="Hijau";
    static String merk ="Garuda Indonesia";
    protected static String pa ="Indonesia"; //asal
    private static String kecpesawat="800km/jam";


    public static void maju() {
        System.out.println("pesawat "+merk+" Berwarna "+warna+" Bergerak maju");
    }

    public static void belok(){System.out.println("pesawat "+merk+" Berwarna "+warna+" Bergerak belok");
    }

    protected static void pabrikasal(){
        System.out.println(merk+" Berasal dari "+pa);
    }
    public static void kecepatanpesawat(){
        System.out.println("Maximal kecepatan pesawat mencapai : "+ kecpesawat);
    }  //masih bisa dipanggil pada class main meskipun property private



}
