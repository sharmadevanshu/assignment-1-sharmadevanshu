import java.util.ArrayList;
import java.util.Scanner;

public class DeleteContact
{
    public int printContacts(ArrayList<Field> ob)
    {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Here are all your contacts: ");
        for (Field oj : ob)
        {
            System.out.println(i++ + ". " + oj.getFirstName() + " " + oj.getLastName());
        }
        System.out.println("Press the number against the contact to delete it: ");
        return sc.nextInt() - 1;

    }
}