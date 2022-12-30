import java.io.InputStream;

public class Calculation implements Runnable {
    private double radius;
    private double side;
    private double area;
    private double phi = 3.14;
    private double luasP;
    private double luasC;
    private double luasT;
    private double a;
    private double b;
    private double t;


    public void Calculation(){
        
    }

    void setSquare(double side, double luasP){
        this.side = side; 
        luasP = side * side;
    }
    double getSquare(double luas){
        return luasP;
    }

    void setCircle(double phi, double radius, double luasC){
        this.phi = phi;
        this.radius = radius;
        this.luasC = luasC;
        luasC = phi * radius *radius;
        
    }
    double getCircle(double luasC){
        return luasC;
    }

    void getTrapezoid(double a, double b, double t, double luasT){    
        this.a = a;
        this.b = b;
        this.t = t;
        luasT = (a + b) / 2 * t;
    }
    double getTrapezoid(double luasT){
        return luasT;
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        
    }
    
}
