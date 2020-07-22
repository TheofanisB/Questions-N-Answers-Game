//Theo B
//Game Class
import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void Run() {
        
        Erotisi[] question = new Erotisi[10];
        question[0] = new Erotisi(" 1+1 ?", "2", 100); //initializing the questions
        question[1] = new Erotisi(" 2+2", "4", 100);
        question[2] = new Erotisi("3+3", "6", 100);
        question[3] = new Erotisi(" 4+4", "8", 100);
        question[4] = new Erotisi("5+5", "10", 100);
        question[5] = new Erotisi(" 6+6", "12", 100);
        question[6] = new Erotisi(" 7+7", "14", 2000);
        question[7] = new Erotisi(" 8+8", "16", 20000);
        question[8] = new Erotisi(" 9+9", "18", 200000);
        question[9] = new Erotisi("How do strawberries taste like ", "Strawberries", 100000000); //case sensitive question

        int[] done = new int[question.length];
        for (int i = 0; i < done.length; i++) { // creating a table that will be filled with the questions that have been asked to the user so we dont get duplicates
            done[i] = -1;   // using -1 because there's no question with -1 id
        }

        Random rnd = new Random(); // initializing the random generator

         int found ,r,plithos_done = 0,winnings=0;
          System.out.println("Starting the game....");
        do {
           // checks if the question is unique 
            do {
                

                 r = rnd.nextInt(question.length);

                
                found = 0;
                int z = 0;
                do {
                    if (r == done[z]) {
                        found = 1; // if the question was already asked then the found flag is equal to 1 and it will move onto another question 
                        
                    }
                    z++;  

                } while (z < question.length && found == 0);// if the question hasnt been asked before and not all the questions have been asked 
                //end of unique question checking 
                
       
              
                
} while (found == 1 && plithos_done != 0); //if the question hasnt been asked before or if the question is the first one being asked 
            System.out.println("Questions already asked :"+plithos_done);
            done[plithos_done] = r; // adds the question's id to the table of the asked questions 
                
            //main game
         
          System.out.println(question[r].getQuestion()); // Prints out question 
          Scanner n = new Scanner(System.in);//creates a scanner 
         String apantisi = n.nextLine(); //reads the answer 
         System.out.println("The Answer you type is : "+apantisi); 
         
         if ( apantisi.equalsIgnoreCase(question[r].getAnswer()) ) // !!!Case Insensitive!!! answer comparison 
             
         { //if the answer is right then it print a success message and it adds the value of the question to the user's  points balance 
          winnings+=question[r].getValue(); 
          System.out.println("Right Answer!!!!");
         }
         else //Wrong answer case 
         {
         System.out.println("Wrong Answer! The right answer is : "+question[r].getAnswer());
         
         }
     
            
             //End of Main game       
         plithos_done++; // increases the amount of the asked Questions
        }while (plithos_done<question.length); // while there's questions that have not been asked ( the amount of the questioned questions is less than the total amount of questions)
        System.out.println("The Game Has Ended!! You won :"+winnings); // End of game message + Winnings report
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
    
    
    
    
 

}
 
 
 
 
}
