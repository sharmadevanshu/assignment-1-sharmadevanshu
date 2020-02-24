import java.util.ArrayList;
import java.util.Scanner;

public class SearchContact {
    public void searchContact(ArrayList<Field> ob) {
        System.out.println("enter first name of the contact : ");
        Scanner sc = new Scanner(System.in);
        String searchName = sc.nextLine();
        int count = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        int i = 0;
        for (Field oj : ob) {
            if (oj.getFirstName().equals(searchName)) {
                ar.add(i);
                count++;
            }
            i++;
        }
        if (count == 0)
            System.out.println("No match found!");
        else
            System.out.println(count + "match found!");
        for (Integer index : ar) {
            ViewContact object = new ViewContact();
            object.viewDetails(ob.get(index));

        }

    }
}