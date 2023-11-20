import java.util.Scanner;

public class inputTwoNumber{
    public static void main(String[] args){
        int x, y;
        try {
            Scanner myScanner = new Scanner(System.in);
            
            System.out.println("Enter x: ");
            x = myScanner.nextInt();
            System.out.println("Enter y: ");
            y = myScanner.nextInt();
            
            myScanner.close();
            System.out.println("=> x + y = " + (x+y));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception thrown:\n" + e); 
        }
    }
}