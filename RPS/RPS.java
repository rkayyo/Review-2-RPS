import java.util.Scanner;



class RPS{
    
    final static int ROCK = 1;
    final static int PAPER = 2;
    final static int SCISSORS = 3;
    static int wins,losses,ties;
    static int choice;
    static int cpuChoice;
    static String repeat = "y";
    
    
    public static void main(String[] args) {
        //variables
       
        //simulates a rock, paper, scissors game vs. a computer opponent.
        printIntro();
        do { 
            getUserInput();
            getCpuInput();
            printChoices();
            decideWinner();
        } while (rematch());
        printStats();

    }
    
    public static void getUserInput(){
     Scanner s = new Scanner(System.in);
     System.out.println("What do you throw?  [1] ROCK  [2] PAPER  [3] SCISSORS");
     choice = s.nextInt();
     
        
    }
    
    public static void getCpuInput(){
        cpuChoice = (int) (Math.random()*3) + 1;
        
    }
    
    public static void decideWinner(){
        Scanner sc = new Scanner(System.in);
        if(cpuChoice == choice){
         System.out.println("A draw. Lets have a rematch shall we?");
         ties++;
        }else if(cpuChoice == ROCK && choice == SCISSORS || cpuChoice == PAPER && choice == ROCK || cpuChoice == SCISSORS && choice == PAPER){
         System.out.println("Fool you've lost. You are no match for me."); 
         losses++;
        }else if(choice== ROCK && cpuChoice == PAPER || choice == PAPER && cpuChoice == ROCK || choice == SCISSORS && cpuChoice == PAPER){
         System.out.println("ARRRHGHHH you've beaten me. I demand a rematch!");
         wins++;
        }
        
    }
    
    public static boolean rematch(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to play again? [y,n]: ");
        String answer = sc.next();
        return answer.equals("Y") || answer.equals("y");   
    }
    
    public static void printStats(){
        
        System.out.println("Wins:   " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Ties:   " + ties);   
    }
    
    public static void printChoices(){
        
        
             if (choice == ROCK) 
            System.out.print("You threw Rock! ");
        else if (choice == PAPER) 
            System.out.print("You threw Paper! ");
        else if (choice == SCISSORS) 
            System.out.print("You threw Scissors! ");

        if (cpuChoice == ROCK)     
            System.out.println("I threw Rock!");
        else if (cpuChoice == PAPER) 
            System.out.println("I threw Paper!");
        else if (cpuChoice == SCISSORS) 
            System.out.println("I threw Scissors!");   
    }
    
    
    public static void printIntro(){
        System.out.println("Welcome to RPS");
        System.out.println("*******************************");
        System.out.println("Good Luck Fool...");
        
    }
    
    
    
}