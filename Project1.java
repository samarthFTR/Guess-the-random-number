import java.util.Random;
import javax.swing.*;
class Project1{
    public static void main(String[] args) {
        Random rn = new Random();
        int n = rn.nextInt(1,100);
        int c = 1;
        int usernum = 0;
        while (c<=5 && n!=usernum) {
            String response = JOptionPane.showInputDialog("You have total of 5 chances \n Guess the number between 1 and 100");
            usernum = Integer.valueOf(response);     
            JOptionPane.showMessageDialog(null, Guess(n, usernum) + "\n Attempts :" + c, "Your Number", 3);
            c++;
        }
        
        int[] Score = {0,100,80,60,40,20,0};
        JOptionPane.showMessageDialog(null,"Your score : "+ Score[c], "Score", 2);
    }
    static String Guess(int n, int usernum){
        if(n == usernum){
            return "You guessed the right number";
        }
        else if(usernum< n && usernum> 0){
            return "You are lower than number";
        }
        else if(usernum> n && usernum<100){
            return "You are higher than number";
        }
        return "Invalid Input";
    }
}