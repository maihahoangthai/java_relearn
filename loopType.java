public class loopType{
    public static void main(String[] args){
        String myName = "Hoang Thai";
        System.out.println("String myName length = " + myName.length());
        int myAge = 23;
        int myNum = 2;
        String[] myLaptop = {"Toshiba", "Acer", "Nitro"};
        int[] numArray = {1, 2, 3, 4};
        System.out.println("Array numArray length = " + numArray.length);

        if(myNum < 0){
            System.out.println("myNum < 0 is " + (myNum < 0));
        }else if(myNum < 10){
            System.out.println("myNum < 10 is " + (myNum < 10));
        }else{
            System.out.println("myNum > 0 && myNum > 10");
        }

        String result = (myAge > 18) ? "I\'m older than 18" : "I\'m younger than 18";
        System.err.println(result);

        switch(myAge){
            case 10:
                System.out.println("You\'re 10 years old!");
                break;
            case 18:
                System.out.println("You\'re 18 years old!");
                break;
            default:
                System.out.println("I don\'t know how old are you...");
        }

        while(myNum < 5){
            System.out.println("While -> myNum = " + myNum);
            myNum++;
        }

        do{
            System.out.println("Do While -> myNum = " + myNum);
            myNum--;
        }while(myNum >= 2);

        for(String laptopName: myLaptop){
            System.out.println(laptopName);
        }
        for(int i = 0; i < 3; i++){
            System.err.print("-> \"for\" " + i + "\n");
        }
    }
}
