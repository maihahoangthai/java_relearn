public class DataTypeCasting{
    /* Convert giá trị của biến kiểu dữ liệu Primitive
     * sang một kiểu dữ liệu Primitive khác.
    */
    public static void main(String[] args){
        // Convert kiểu nhỏ -> lớn:
        int myInt = 9;
        double myDouble = myInt;
        System.out.println("Before = " + myInt);
        System.out.println("After = " + myDouble);

        // Convert kiểu lớn -> nhỏ:
        float myFloat = 5.6f;
        byte myByte = (byte) myFloat;
        System.out.println("Before = " + myFloat);
        System.out.println("After = " + myByte);
    }
}
