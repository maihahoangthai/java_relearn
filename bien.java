// Variables = Biến.
// Data Type = Kiểu dữ liệu.
public class bien{
    /* Primitive data type: byte, short, int, long, float, double, boolean và char.
     * String không phải một Primitive data type.
    */
    public static void main(String[] args){
        byte myByte = 127;
        short myShort = 128;
        System.out.println("byte [-128, 127] = " + myByte);
        System.out.println("short > byte, short = " + myShort);

        int myInt = 1111;
        System.out.println("int > short, int = " + myInt);
        long myLong = 2222;
        System.out.println("long > int, long = " + myLong);

        float myFloat = 0.123456f;
        System.out.println("float = " + myFloat); // kết thúc bằng ký tự f
        double myDouble = 0.123456789d;
        System.out.println("double > float, double = " + myDouble); // kết thúc bằng ký tự d
        
        char myChar = 'T';
        System.out.println("char = " + myChar); // Khác String, khai báo phải dùng '' thay vì "".
        
        boolean myBool = true;
        System.out.println("boolean = " + myBool + " or false");
        /* Thường dùng nhất là kiểu int và double. Thay vì byte, short, long, float. */
    }
}
