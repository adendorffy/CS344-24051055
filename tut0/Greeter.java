import java.util.Scanner;

public class Greeter {

    public static void main(String [] args){
        if(args.length != 1){
            System.out.println("Usage: java Greeter <name>");
        }else{
            greeter(args[0]);
        }
    }

    public static void greeter(String name){
        System.out.println("Hello,  " + name + ", this is a longer greeting.");
    }

    public static String GetName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        return name;
    }

    public static void goodbye(){
        /**
         * Function for printing a greeting to the terminal 
         */

        System.out.println("Goodbye! ");
    }

}