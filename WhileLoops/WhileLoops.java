package WhileLoops;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("Welcome " + name + "!");
        int totalTrash = 22;
        int trashToCarry = 5;

        while (totalTrash > 0){

            if(totalTrash < trashToCarry){
                trashToCarry = totalTrash;
            }

            totalTrash -= trashToCarry;
            System.out.println("Remaining: " + totalTrash);

            sc.close();


        }
    }
    
}
