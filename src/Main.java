//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your party affiliation? D, R, or I?");
        String PartyAffiliation = in.nextLine();

        if(PartyAffiliation.equals("D"))
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if(PartyAffiliation.equals("R"))
        {
            System.out.println("You get a Republican Elephant.");
        }
        else if(PartyAffiliation.equals("I"))
        {
            System.out.println("You get an Independent Person.");
        }
        else
        {
            System.out.println("You get an Other.");
        }

    }
}