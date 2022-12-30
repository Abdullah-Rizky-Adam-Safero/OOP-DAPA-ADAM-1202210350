import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    private boolean repeat = true;
    public static void main(String[] args) {
        do{
            System.out.println("=== Menu Program ===");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Trapezoid");
            Scanner input = new Scanner(System.in);

            Calculation calculation = new Calculation(System.in);
            String menu;

            
            System.out.print("Select Menu : ");
            menu = input.next();
            try{
                switch(menu){
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "0":
                        break;
                    default:
                        continue
                }
                repeat =  ....;
            }catch (InputMismatchException e){
                System.out.println("Error: Input must be a number");
            } catch (IllegalArgumentException e){

            }catch(InterruptedException e){

            }
        }while (condition) {
            scannername.close();
        }
    }
}
