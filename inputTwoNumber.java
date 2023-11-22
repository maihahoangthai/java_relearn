import java.util.Scanner;

public class inputTwoNumber{
    public static void main(String[] args){
        int x, y;
        try { // Chạy thử xem có lỗi gì không...
            Scanner myScanner = new Scanner(System.in);
            
            System.out.println("Enter x: ");
            x = myScanner.nextInt();
            System.out.println("Enter y: ");
            y = myScanner.nextInt();
            
            myScanner.close();
            System.out.println("=> x + y = " + (x+y));
        } catch (Exception e) { // Nếu có lỗi thì báo lỗi.
            System.out.println("Exception thrown:\n" + e); 
        } finally{
            System.out.println("Kệ Try-Catch bị lỗi hay không, đoạn code nằm trong block này vẫn chạy!");
        }
    }
}