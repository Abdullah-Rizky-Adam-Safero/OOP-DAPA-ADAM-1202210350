public class Laptop extends Perangkat{
    protected String webcam;

    public Laptop(String drive, int ram, float processor, String webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    public void informasi() {
        System.out.println("Laptop ini memiliki tipe" + drive + " dengan ram sebesar " + ram + " dan processor secepat " + processor + " Ghz. selain itu laptop ini juga memiliki " + webcam);
    }

    public void bukaGame(String nama_game) {
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }

    public void kirimEmail(String email) {
        System.out.println("Laptop berhasil mengirim Email ke " + email);
    }

    public void kirimEmail(String email1, String email2) {
        System.out.println("Laptop berhasil mengirim email ke " + email1 + " dan ke " + email2);
    }
}

