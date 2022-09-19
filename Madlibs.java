import java.util.Scanner;
/**
 * Write a description of class Madlibs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Madlibs
{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a username: ");//Name of user
        String userName = input.nextLine();
        System.out.println("Enter the date of the day (#) ");//Enter the date
        int date = input.nextInt();
        System.out.println("Enter the date of the month (#) ");//Enter month
        int month = input.nextInt();
        System.out.println("Enter the date of the year (#) ");//Enter year
        int year = input.nextInt();
        input.nextLine();
        System.out.println("Enter a adjective: ");//Enter adjective
        String firstAdjective = input.nextLine();
        System.out.println("Enter a adjective again (not the same one): ");//Enter adjective not the same
        String secondAdjective = input.nextLine();
        System.out.println("Enter a type of bird: ");//Enter bird type
        String birdWord = input.nextLine();
        System.out.println("Enter a room in your house: ");//Enter room in house
        String roomWord = input.nextLine();
        System.out.println("Enter a verb (past tense): ");//Enter verb in past tense 
        String verbPast = input.nextLine();
        System.out.println("Enter a verb: ");//Enter verb
        String verb = input.nextLine();
        System.out.println("Enter a relatives name: ");//Enter relatives name
        String relativeName = input.nextLine();
        System.out.println("Enter noun: ");//Enter noun 
        String noun = input.nextLine();
        System.out.println("Enter a liquid word: ");//Enter a liquid word 
        String liquidWord = input.nextLine();
        System.out.println("Enter a verb ending in (ing): ");//Enter verb ending in (ing) 
        String verbIng = input.nextLine();
        System.out.println("Enter a verb (past tense): ");//Enter verb in past tense 
        String verbPast2 = input.nextLine();
        System.out.println("Enter a part of the body: ");//Enter part of the body 
        String partBody = input.nextLine();
        System.out.println("Enter a plural noun: ");//Enter plural noun 
        String pluralNoun = input.nextLine();
        System.out.println("Enter a verb ending in (ing) not the same one: ");//Enter verb in (ing)
        String verdIng2 = input.nextLine();
        System.out.println("Enter a noun (not the same one): ");//Enter a noun
        String noun2 = input.nextLine();
        //started writing out the mad lib
        System.out.println("Username is "+userName);
        System.out.println("The date is: "+month+"/"+date+"/"+year);
        System.out.print("It was a "+firstAdjective);
        System.out.print(", cold November day. I woke up to the "+secondAdjective);
        System.out.print(" smell of "+birdWord);
        System.out.println(" roasting in the "+roomWord);
        System.out.print(" downstairs. I "+verbPast);
        System.out.print(" down the stairs to see if I could help "+verb);
        System.out.println(" the dinner. My mom said, See if "+relativeName);
        System.out.print(" needs a fresh "+noun+".");
        System.out.print(" So I carried a tray of glasses full of "+liquidWord);
        System.out.println(" into the "+verbIng);
        System.out.print(" room. When I got there, I couldn't believe my "+partBody+"!");
        System.out.println(" There were "+pluralNoun+" "+verdIng2+" on the "+noun2);
    }
}
