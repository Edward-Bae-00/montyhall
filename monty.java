import java.util.*;

public class monty{
    public static void main(String [] args) throws Exception{
        // Scanner reader = new Scanner("thing.txt");
        // System.out.println("Enter how many simulations you'd like: ");
        // int n = reader.nextInt();

        int right = 0;
        int wrong = 0;

        for(int a = 0; a < 100000; a++){
            int car = (int)(Math.random()*3);
            int choose = (int)(Math.random()*3);
    
            List<Integer> possible = new ArrayList<>();
            for (int b = 0; b < 3; b++){
                if (b != choose){
                    if (b != car){
                        possible.add(b);
                    }
                }
            }
            if (possible.size() == 1){
                right++;
            }else{
                possible.remove((int)(Math.random()*2));
                if (possible.get(0) == car){
                    right++;
                }else{
                    wrong++;
                }
            }
        }
        System.out.println("Stats when you change: \n" + "Right: "+ right + " Wrong: " + wrong);

        right = 0;
        wrong = 0;
        for(int a = 0; a < 100000; a++){
            int car = (int)(Math.random()*3);
            int choose = (int)(Math.random()*3);
    
            List<Integer> possible = new ArrayList<>();
            if (choose != car){
                wrong++;
            }else{
                right++;
            }
        }
        System.out.println("Stats when you don't change: \n" + "Right: "+ right + " Wrong: " + wrong);
    }
}