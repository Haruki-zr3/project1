import java.util.*;
public class Oddeven{
    public static void main(String[] args){
        Scanner m=new Scanner(System.in);
        Random r=new Random();
        System.out.println("*".repeat(10)+"ODD/EVEN"+"*".repeat(10));
        System.out.println("'Childhood will never come back, but the childhood memories never fade away from our mind, play this and enjoy'");
        System.out.print("Enter any key to continue...");
        String enter=" ";
        enter=m.next();
        System.out.println("*".repeat(30));
        int match=1;
        do{
            int n,tossn,w,tossR,b;
            n=tossn=w=tossR=b=0;
            String toss;
            toss=" ";
            System.out.println("How many overs do you want to play? ");
            System.out.print("> > >");
            n=m.nextInt();
            System.out.println("*".repeat(30));
            System.out.println("Toss Time....");
            System.out.println("Write your choice, ODD/EVEN ");
            System.out.print("> > >");
            toss=m.next();
            tossR=r.nextInt(6)+1;
            System.out.print("Put a number between 1-6 for toss\t");
            tossn=m.nextInt();
            System.out.println("You: "+tossn+" Comp: "+tossR+"\nSum:"+(tossn+tossR));
            if((tossn+tossR)%2==0){
                if(toss.equalsIgnoreCase("even")){
                    System.out.println("You won the toss");
                    w+=1;
                }
                else{
                    System.out.println("Comp won the toss");
                }
            }
            else{
                if(toss.equalsIgnoreCase("odd")){
                    System.out.println("You won the toss");
                    w+=1;
                }
                else{
                    System.out.println("Comp won the toss");
                }
            }
            if(w==1){
                System.out.println("What do you want to choose?\n1.Bat \n2.Field");
                b=m.nextInt();
            }
            else{
                b=r.nextInt(2)+1;
                if(b==1){
                    System.out.println("Comp chose FIELDING");
                }
                else if(b==2){
                     System.out.println("Comp chose BATTING");
                }
            }
            if(b==1){
                System.out.println("_________".repeat(6));
                int  target,ball,ballc,wicket,run,All_out,i,j,e,p,q,run_c;
                target=ball=ballc=wicket=run=All_out=p=q=j=i=run_c=e=0;
                System.out.println("*".repeat(10)+"BATTING"+"*".repeat(10));
                System.out.println("Information: enter numbers only from 1-6 or else game over");
                for(i=1;i<=n;i++){
                    for(j=1;j<=6;j++){
                        System.out.print("->");
                        ball=m.nextInt();
                        if(ball<1||ball>6){
                            e=1;
                            System.out.println("WRONG CHOICE >_<");
                            break;
                        }
                        ballc=r.nextInt(6)+1;
                        System.out.println("You:"+ball+"Comp:"+ballc);
                        if(ball==ballc){
                            System.out.println("OOPS!..........a wicket fell :(");
                            wicket++;
                            System.out.println("\t \t \t \t"+run+"/"+wicket);
                        }
                        else{
                            run=run+ball;
                            System.out.println("\t \t \t \t"+run+"/"+wicket);
                        }
                        if(wicket==10){
                            All_out=1;
                            break;
                        }
                    }
                    if(e==1||All_out==1){
                        break;
                    }
                    System.out.println("Score: "+run+"/"+wicket+" in "+i+" overs ");
                    System.out.println("*".repeat(30));
                }
                System.out.println("Total Score:"+run+"/"+wicket);
                System.out.println("Target is "+(run+ 1));
                target=run;
                wicket=0;
                wicket=0;
                System.out.println("_________".repeat(6));
                System.out.println("*".repeat(10)+"BOWLING"+"*".repeat(10));
                System.out.println("");
                System.out.println("Information: Enter numbers only from 1-6 or else game over ");
                for(p=1;p<=n;p++){
                    for(q=1;q<=6;q++){
                        System.out.print("->");
                        ball=m.nextInt();
                        if(ball>6||ball<1){
                            e=1;
                            System.out.println("WRONG CHOICE >_<");
                            break;
                        }
                        ballc=r.nextInt(6)+1;
                        System.out.println("You: "+ball+"Comp: "+ballc);
                        if(ball==ballc){
                            System.out.println("Yes..........You got a wicket :)");
                            wicket++;
                            System.out.println("\t \t \t \t"+run_c+"/"+wicket);
                        }
                        else{
                            run_c=run_c+ballc;
                            System.out.println("\t \t \t \t"+run_c+"/"+wicket);
                            if(run_c>target){
                                break;
                            }
                        }
                        if(wicket==10){
                            All_out=1;
                            break;
                        }
                    }
                    System.out.println("Score: "+run_c+"/"+wicket+" in "+p+" overs ");
                    System.out.println("*".repeat(30));
                    if(run_c>target){
                        break;
                    }
                    if(e==1||All_out==1){
                        break;
                    }
                }
                System.out.println("Total:"+run_c+"/"+wicket);
                System.out.println("*".repeat(30));
                if(run_c>target){
                    System.out.println("Comp won the match");
                }
                else if(run_c<target){
                    System.out.println("You won the match");
                }
                else{
                    System.out.println("Match Tied");
                }
            }
            else if(b==2){
                System.out.println("_________".repeat(6));
                int  target,ball,ballc,wicket,run,All_out,i,j,e,p,q,run_c;
                target=ball=ballc=wicket=run=All_out=p=q=j=i=run_c=e=0;
                System.out.println("*".repeat(10)+"BOWLING"+"*".repeat(10));
                System.out.println("       ");
                System.out.println("Information: Enter numbers only from 1-6 or else game over");
                for(p=1;p<=n;p++){
                    for(q=1;q<=6;q++){
                        System.out.print("->");
                        ball=m.nextInt();
                        ballc=r.nextInt(6)+1;
                        System.out.println("You: "+ball+"Comp: "+ballc);
                        if(ball>6||ball<1){
                            e=1;
                            System.out.println("WRONG CHOICE >_<");
                            break;
                        }
                        if(ball==ballc){
                            System.out.println("Yes..........you got a wicket :)");
                            wicket++;
                            System.out.println("\t \t \t \t"+run_c+"/"+wicket);
                        }
                        else{
                            run_c=run_c+ballc;
                            System.out.println("\t \t \t \t"+run_c+"/"+wicket);
                        }
                        if(wicket==10){
                            All_out=1;
                            break;
                        }
                    }
                    System.out.println("Score: "+run_c+"/"+wicket+" in "+p+" overs ");
                    System.out.println("*".repeat(30));
                    if(e==1||All_out==1){
                        break;
                    }
                }
                System.out.println("Total:"+run_c+"/"+wicket);
                target=run_c;
                System.out.println("Target is "+(run_c+ 1));
                wicket=0;
                System.out.println("_________".repeat(6));
                System.out.println("*".repeat(10)+"BATTING"+"*".repeat(10));
                System.out.println("Information: Enter numbers only from 1-6 or else game over ");
                for(i=1;i<=n;i++){
                    for(j=1;j<=6;j++){
                        System.out.print("->");
                        ball=m.nextInt();
                        if(ball<1||ball>6){
                            e=1;
                            System.out.println("WRONG CHOICE >_<");
                            break;
                        }
                        ballc=r.nextInt(6)+1;
                        System.out.println("You: "+ball+"Comp: "+ballc);
                        if(ball==ballc){
                            System.out.println("OOPS..........a wicket fell :(");
                            wicket++;
                            System.out.println("\t \t \t \t"+run+"/"+wicket);
                        }
                        else{
                            run=run+ball;
                            System.out.println("\t \t \t \t"+run+"/"+wicket);
                            if(run>target){
                                break;
                            }
                        }
                        if(wicket==10){
                            All_out=1;
                            break;
                        }
                    }
                    System.out.println("Score: "+run+"/"+wicket+" in "+i+" overs ");
                    System.out.println("*".repeat(30));
                    if(run>target){
                                break;
                    }
                    if(e==1||All_out==1){
                        break;
                    }
                }
                System.out.println("Total Score:"+run+"/"+wicket);
                System.out.println("*".repeat(30));
                if(run>target){
                    System.out.println("You won the match");
                }
                else if(run<target){
                    System.out.println("Comp won the match");
                }
                else{
                    System.out.println("Match Tied");
                }
            }
            System.out.println("You want a new match? \n1. Yes\n2. No");
            match=m.nextInt();
        }
        while(match==1);
        System.out.println("Thank You for playing :)");
    }
}
