//This class introduces the battle loop for my game
//Loop will end when either player or
//monster hp reaches zero

//Author Adrian Sharpless
//Last mod date: 4/6/2017

public class battleLoop{


//main method
public static void main (String [] args){

    int monAT = 2,
        monHP = 5,
        playerHP = 10,
        playerAT = 3;

        System.out.println("Player HP is: ");
        System.out.println(playerHP);

        while (playerHP > monAT && monHP > playerAT){
          System.out.println("You take a hit!");
          System.out.println("HP is: ");
          System.out.println(playerHP);
          playerHP -= monAT;

          System.out.println("You attack the monster!");
          System.out.println("Monster HP is: ");
          System.out.println(monHP);
          monHP -= playerAT;
        }//end while loop

    if(playerHP > 0){
      System.out.print("You win!");
      }
    else
     System.out.print("You lose!");




    }

//return winner; //sends to mainGame class
}
