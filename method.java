public class method{
    public static void main(String[] args){
        myMethod();
        myMethod(2);
        double howOldAreYou = myAge(23);
        myAge(6);
    }

    static void myMethod(){
        System.out.println("I got excuted!");
    }
    static void myMethod(double numOfPrint){
        for(int i = 0; i<numOfPrint; i++){
            System.out.println("I got excuted!");
        }
    }

    static int myAge(int age){
        if (age > 18) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied...");
        }
        return age;
    }
}