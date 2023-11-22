public class method1{
    public static void main(String[] args){
        myMethod();
        myMethod(2);
        double howOldAreYou = myAge(23);
        myAge(6);
    }

    // Các Method có thể có cùng tên nhưng phải khác Parameter!
    // Khai báo Method trước hay sau main đều được, miễn nằm chung block trong Class.
    static void myMethod(){
        System.out.println("I got excuted!");
    }
    static void myMethod(double numOfPrint){
        for(int i = 0; i<numOfPrint; i++){
            System.out.println("I got excuted!");
        }
    }

    // "void" nghĩa là không "return".
    /* Còn nếu thay "void" bằng một Data Type bất kỳ,
    thì phải có thêm "return" data type đó. */
    static int myAge(int age){
        if (age > 18) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied...");
        }
        return age;
    }

    /* "static" nghĩa là có sẵn, gọi khi nào cũng được.
     * "public" nghĩa là gắn liền với object, phải new object thì mới gọi được.
     */
}