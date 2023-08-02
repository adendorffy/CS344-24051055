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
}