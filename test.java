import java.util.Scanner; /* Thư viện để lấy input từ User */
// import java.util.* 
/* Dấu * nghĩa là lấy tất cả các class có trong package.
 * Ví dụ: Scanner, Stack, Queue đều là class có trong package java.util.
 * Cụm "java.util" là tên của package.
 * Package là tập hợp nhiều file nằm chung thư mục. Mỗi file có thể chứa nhiều class nhưng dòng đầu tiên của những tệp này luôn là <package tên_package>.
*/

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