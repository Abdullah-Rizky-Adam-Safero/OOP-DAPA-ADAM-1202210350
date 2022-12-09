public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportasiAir1 = new TransportasiAir(4, 20000);
        transportasiAir1.informasi();
        transportasiAir1.berlayar();
        transportasiAir1.berlabuh();
        System.out.println("");

        Sampan sampan1 = new Sampan(20, 50000, 2);
        sampan1.informasi();
        sampan1.berlayar();
        sampan1.berlabuh();
        sampan1.berlabuh(2);
        System.out.println("");

        Kapal kapal = new Kapal(50, 100000, "Diesel");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(20);
        kapal.berlabuh();
    }
}
