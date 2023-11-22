import java.util.Scanner; /* Thư viện để lấy input từ User */

public class test{
    public static void main(String[] args){
        System.out.print("Hello World!"); // output của "print" không xuống dòng.
        System.out.println("Fuck1"); // mỗi output của "println" là 1 dòng mới.
        System.out.println("Fuck2");

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = myScanner.nextLine();
        System.err.print("Your name is " + name + ", right?\n");
        myScanner.close();
    }
}