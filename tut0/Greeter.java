import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        
    }

    public static String GetName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        return name;
    }
}