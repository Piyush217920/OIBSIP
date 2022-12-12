import java.util.Scanner;
import java.util.Random;
public class number_guessing_game_ {
    public static void main(String[]args){
try (Scanner sc = new Scanner(System.in)) {
    Random rd = new Random();
    System.out.println("Hello player \n!!!Welcome to Number Guessing Game!!! \nThere are two rounds \nEach round contain 5 tries \nLet's play!!");
    int trycount=0;
    int trycount1=0;
    for(int j=1;j<=2;j++){
        System.out.println("\n**!!!Round"+j+"!!!**");
        int randomnumber =rd.nextInt(100)+1;
//                 System.out.println(randomnumber);
    int i = 0;
    while(i<5){
     System.out.println("Enter your guess in between 1 to 100");
     int guessnumber =sc.nextInt();
     trycount++;
     if(randomnumber == guessnumber){
     System.out.println("Correct! You Win!!");
     trycount1++;
     break;
     }
     else if(guessnumber > randomnumber){
     System.out.println("No!!! The number is Lower! Guess Again!");
     }
     else {
     System.out.println("No!!! The number is Higher! Guess Again!");
     }
     i++;
    }
System.out.println("Your Score is "+trycount1);
   }
    System.out.println("It tooks "+trycount+" tries");
    if(trycount1==2){
    System.out.println("You Win by 100 points\n!!!Game Over!!!");
    }
    else if(trycount1==1){
    System.out.println("You Win by 50 points\n!!!Game Over!!!");
    }
    else{
            System.out.println("You Lose!\n!!!Game Over!!!");

    }
}    
}
    
}


