public class Handphone extends Perangkat{
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
        
    }

    public void informasi() {
        if (fingerprint == false){
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " Gb dan processor secepat " + processor + " Ghz. selain itu handphone ini TIDAK memiliki fingerprint");
        }else
        System.out.println("YA"); 
    }

    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke no " + no_hp);
    }

    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim sms ke no " + no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim sms ke no " + no_hp1 + " dan " + no_hp2);
    }
}
