public class MainApp {
    public static void main(String[] args) throws Exception {

        Perangkat perangkat1 = new Perangkat("Adata", 2, 1.80f);
        perangkat1.informasi();
        System.out.println("");

        Laptop laptop1 = new Laptop("Seagate", 8, 2.40F, "webcam");
        laptop1.informasi();
        laptop1.bukaGame("Overwatch");
        laptop1.kirimEmail("yuki@gmail.com");
        laptop1.kirimEmail("jankenpo@gmail.com", "kuro@gmail.com");
        System.out.println("");

        Handphone handphone1 = new Handphone("Sandisk", 3, 2.20f, false);
        handphone1.informasi();
        handphone1.telfon(893800358);
        handphone1.kirimSMS(89999999);
        handphone1.kirimSMS(892327638, 89382763);
        System.out.println("");

    }
}
