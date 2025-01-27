import java.util.*;

public class monty{
    int right = 0;
    int wrong = 0;

    public static void main(String [] args) throws Exception{
        // Scanner reader = new Scanner("thing.txt");
        // System.out.println("Enter how many simulations you'd like: ");
        // int n = reader.nextInt();

        
        int car = (int)(Math.random()*3);
        int choose = (int)(Math.random()*3);

        List<Integer> possible = new ArrayList<>();
        for (int a = 0; a < 3; a++){
            if (a != choose){
                possible.add(a);
            }
        }
        
        int hint = (int)(Math.random()*2);
        
        


        System.out.println("car: " + car);
        System.out.println("picked pos: " + choose);

    }
}