import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Field> ob = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Devanshu's Contact list Application");
        int a = 0;
        while (a != 5)
        {
            System.out.println("<>-----------x------x----------<>");
            System.out.println("enter 1 to add a new contact");
            System.out.println("enter 2 to view all contacts");
            System.out.println("enter 3 to search contact");
            System.out.println("enter 4 to delete a contact");
            System.out.println("enter 5 to exit");
            System.out.println("<>-----------x------x----------<>");
            int h = sc.nextInt();
            a = h;
            switch (h)
            {
                case 1:
                    AddContact ob1 = new AddContact();
                    ob.add(ob1.addContact());
                    a = 1;
                    break;
                case 2:
                    ViewContact obj = new ViewContact();
                    obj.viewContact(ob);
                    a = 2;
                    break;
                case 3:
                    SearchContact obj1 = new SearchContact();
                    obj1.searchContact(ob);
                    a = 3;
                    break;
                case 4:
                    DeleteContact obj2 = new DeleteContact();
                    int ind = obj2.printContacts(ob);
                    System.out.println(ob.get(ind).getFirstName() + " " + ob.get(ind).getLastName() + "'s contact removed!");
                    ob.remove(ob.get(ind));
                    a = 4;
                    break;
                case 5:
                    a = 5;
                    break;
                default:
                    System.out.println("invalid choice please re-enter");
                    break;

            }

        }
    }
}