import java.util.*;
public class Game{
    public static void main(String[] args){
        int game=1;
        //System.out.println();
        //.equalsIgnoreCase()
        Scanner m=new Scanner(System.in);
        Random r=new Random();
        System.out.println("*".repeat(5)+" ROCK PAPER SCISSORS "+"*".repeat(5));
        System.out.println("Press \n1:Start \n2:End");
        game=m.nextInt();
        System.out.println("*".repeat(20));
        while (game==1){
            int u,c,R,rounds;
            u=c=R=rounds=0;
            String ch,compch;
            System.out.println("How many rounds do you want to play?");
            rounds=m.nextInt();
            for(int i=1;i<=rounds;i++){
                System.out.println("Now, What u want to choose? :");
                System.out.println(" Rock/Paper/Sciccors ");
                ch=m.next();
                R=r.nextInt(3);
                if(ch.equalsIgnoreCase("rock")||ch.equalsIgnoreCase("paper")||ch.equalsIgnoreCase("scissors")){
                    switch(R){
                        case 0:
                            compch="Rock";
                            System.out.print("You chose "+ch+ "\tComp chose "+ compch+"\n");
                            if(ch.equalsIgnoreCase("scissors")){
                                System.out.println("Comp won");
                                c++;
                                System.out.println("You:"+u+"\tComp:"+c);
                            }
                            else if(ch.equalsIgnoreCase("paper")){
                                System.out.println("You won");
                                u++;
                                System.out.println("You:"+u+"\tComp:"+c);
                            }
                            else if(ch.equalsIgnoreCase("rock")){
                                System.out.println("Tied");
                                System.out.println("You:"+u+"\tComp:"+c);
                            }
                            break;
                        case 1:
                            compch="Scissors";
                            System.out.print("You chose "+ch+ "\tComp chose "+ compch+"\n");
                            if(ch.equalsIgnoreCase("paper")){
                                System.out.println("Comp won");
                                c++;
                                System.out.println("You:"+u+"\tComp:"+c);
                            }
                            else if(ch.equalsIgnoreCase("rock")){
                                System.out.println("You won");
                                u++;
                                System.out.println("You:"+u+"\tComp:"+c);
                            }
                            else if(ch.equalsIgnoreCase("scissors")){
                                System.out.println("Tied");
                                System.out.println("You:"+u+"\tComp:"+c);
                            }
                            break;
                        case 2:
                            compch="paper";
                            System.out.print("You chose "+ch+ "\tComp chose "+ compch+"\n");
                            if(ch.equalsIgnoreCase("rock")){
                                System.out.println("Comp won");
                                c++;
                                System.out.println("You:"+u+"\tComp:"+c);
                            }
                            else if(ch.equalsIgnoreCase("scissors")){
                                System.out.println("You won");
                                u++;
                                System.out.println("You:"+u+"\tComp:"+c);
                            }
                            else if(ch.equalsIgnoreCase("paper")){
                                System.out.println("Tied");
                                System.out.println("You:"+u+"\tComp:"+c);
                            }
                            break;
                    
                    }
                }
                else{
                    System.out.println("Invalid choice");
                    System.out.println("Game over");
                    break;
                }
                System.out.println("*".repeat(20));
            }
            if(u>c){
                System.out.println("You won :) \nComp lost :)");
            }
            else if(u<c){
                System.out.println("Comp won:( \nYou lost :(");
            }
            else{
                System.out.println("Match tied");
            }
            System.out.println("Do you want to play a new game?\n Press\t1:New game\t2:End");
            game=m.nextInt();
        }
        System.out.print("Game Ended");
    }
}
