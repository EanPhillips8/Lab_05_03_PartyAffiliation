public class Main {
    public static void main(String[] args) {

        String party = "I";
        String rep = "Republican";
        String dem = "Democrat";
        String ind = "Independent";

        System.out.println("What party do you belong to [R,D,I]: ");

        if (party.equalsIgnoreCase ("R"))
            System.out.println("Your are a " + rep);

        else if (party.equalsIgnoreCase("D"))
            System.out.println("You are a " + dem);

        else if (party.equalsIgnoreCase("I"))
            System.out.println("You are an " + ind);

        else
        {
            System.out.println("Please enter a valid party: ");
        }

    }
}