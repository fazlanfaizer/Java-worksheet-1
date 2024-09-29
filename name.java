import java.util.Scanner;
import java.util.StringTokenizer;

public class naming {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        String word;
        System.out.println("Enter the full name in the format first middle last : ");
        word = input.nextLine();
        int first=word.indexOf(" ");
        int last=word.lastIndexOf(" ");
        System.out.println(word.substring(last+1)+", "+word.substring(0,first)+" "+word.charAt(first+1));
        input.close();
