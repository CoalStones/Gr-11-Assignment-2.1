package assignment21;
import java.util.Scanner;
public class Assignment21 {
    public static void trees(String word[]){
        for(int i=0; i<word.length; i++){
            //top left of the diamond
            for(int count=0; count<word[i].length()+1; count++){
                String k="";
                System.out.format("%"+word[i].length()+"s",word[i].substring(0,count));
                //top right of the diamond
                if(count>0){
                    k=word[i].substring(0,count-1);
                    k=new StringBuilder(k).reverse().toString();
                }
                System.out.println(k);
            }
            //bottom left of the diamond
            for(int count=word[i].length()-1; count>0; count--){
                String k="";
                System.out.format("%"+word[i].length()+"s",word[i].substring(0,count));
                //bottom right of the diamond
                if(count>0){
                    k=word[i].substring(0,count-1);
                    k=new StringBuilder(k).reverse().toString();
                }
                System.out.println(k);
            }
            for(int count=1; count<word[i].length(); count++){
                System.out.format("%"+word[i].length()+"s \n",word[i].substring(count,count+1));
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String uin;
        System.out.println("Enter a string");
            uin=input.nextLine();
            uin=uin.toUpperCase();
            String[] word=uin.split(" ");
                trees(word);
    }
}