import java.util.*;
public class project {
    public static void main(String[] args) { 
        ArrayList <Character> p=new ArrayList<>();
        Scanner m=new Scanner(System.in);
        StringBuilder s=new StringBuilder();
        int A=0,S=0,N=0;String c,st,n;
        c="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
        st="!#@$%^&*(){|}[]:;?/+=\\-. ";
        n="0123456789 ";
        System.out.print("Enter the number of alphabets: ");A=m.nextInt();
        System.out.print("Enter the number of numerical values: ");N=m.nextInt();
        System.out.print("Enter the number of special characters: ");S=m.nextInt();
        for(int i=1;i<=(A+S+N);i++){
            if(i<=A){
                p.add(c.charAt((int)(53*Math.random())));
            }
            else if(i<=(A+S)&&(i>A)){
                p.add(st.charAt((int)(25*Math.random())));
            }
            else if(i<=(A+S+N)&&(i>A+S)){
                p.add(n.charAt((int)(10*Math.random())));
            }
        }
        Collections.shuffle(p);
        for(int j=0;j<(A+S+N);j++){
            s.append(p.get(j));
        }
        System.out.println("Your password is: "+ s);
        m.close();
    }
}
