import java.util.*;
public class Game{
    public static void main(String[] args){
        int game=1;
        Scanner m=new Scanner(System.in);
        Random r=new Random();
        System.out.println("*".repeat(5)+" ROCK PAPER SCISSORS "+"*".repeat(5));
        System.out.println("Press \n1:Start \n2:End");
        game=m.nextInt();
        System.out.println("*".repeat(20));
        while (game==1){
            int u,c,R,ch,rounds;
            u=c=R=rounds=ch=0;
            String compch,user;
            System.out.println("How many rounds do you want to play?");
            rounds=m.nextInt();
            for(int i=1;i<=rounds;i++){
                user=compch=" ";
                System.out.println("*".repeat(20));
                System.out.println("Choose an option: \n1:Rock\n2:Paper\n3:Scissors");
                System.out.print("->");
                ch=m.nextInt();
                if(ch==1){
                    user="rock";
                }
                else if(ch==2){
                    user="paper";
                }
                else if(ch==3){
                    user="scissors";
                }
                else{
                    System.out.println("Wrong choice,Game over");
                    System.out.println("Final score\n You:"+u+"\tComp:"+c);
                    break;
                }
                R=r.nextInt(3);
                switch(R){
                    case 0:
                        compch="Rock";
                        System.out.println("you chose\t"+user+"\tcomp chose\t"+compch);
                        if(user.equalsIgnoreCase(compch)){
                            System.out.println("Tied");
                            System.out.println("You:"+u+"\tComp:"+c);
                        }
                        else if(user.equalsIgnoreCase("paper")){
                            System.out.println("You won,Comp lost");
                            u++;
                            System.out.println("You:"+u+"\tComp:"+c);
                        }
                        else if(user.equalsIgnoreCase("scissors")){
                            System.out.println("Comp won, You lost");
                            c++;
                            System.out.println("You:"+u+"\tComp:"+c);
                        }
                        break;
                    case 1:
                        compch="paper";
                        System.out.println("you chose\t"+user+"\tcomp chose\t"+compch);
                        if(user.equalsIgnoreCase(compch)){
                            System.out.println("Tied");
                            System.out.println("You:"+u+"\tComp:"+c);
                        }
                        else if(user.equalsIgnoreCase("scissors")){
                            System.out.println("You won,Comp lost");
                            u++;
                            System.out.println("You:"+u+"\tComp:"+c);
                        }
                        else if(user.equalsIgnoreCase("rock")){
                            System.out.println("Comp won, You lost");
                            c++;
                            System.out.println("You:"+u+"\tComp:"+c);
                        }
                        break;
                    case 2:
                        compch="Scissors";
                        System.out.println("you chose\t"+user+"\tcomp chose\t"+compch);
                        if(user.equalsIgnoreCase(compch)){
                            System.out.println("Tied");
                            System.out.println("You:"+u+"\tComp:"+c);
                        }
                        else if(user.equalsIgnoreCase("rock")){
                            System.out.println("You won,Comp lost");
                            u++;
                            System.out.println("You:"+u+"\tComp:"+c);
                        }
                        else if(user.equalsIgnoreCase("paper")){
                            System.out.println("Comp won, You lost");
                            c++;
                            System.out.println("You:"+u+"\tComp:"+c);
                        }
                        break;
                }
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
