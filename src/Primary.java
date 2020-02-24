import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

class Primary {
    public int printContacts(ArrayList<Fields> ob)
    {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Here are all your contacts: ");
        for (Fields oj : ob) {
            System.out.println(i++ + ". " + oj.getFirstName() + " " + oj.getLastName());
        }
        System.out.println("Press the number against the contact to delete it: ");
        return sc.nextInt() - 1;

    }

    public void viewDetails(Fields oj) {
        System.out.println("-------- * -------- * -------- * --------");
        System.out.println("First Name: " + oj.getFirstName());
        System.out.println("Last Name: " + oj.getLastName());
        String s = "" + oj.getContactNumbers();
        System.out.println("Contact Number(s): " + s.substring(1, s.length() - 1));
        System.out.println("Email address: " + oj.getEmailAddress());
        System.out.println("-------- * -------- * -------- * --------");


    }

    public void viewContact(ArrayList<Fields> ob) {
        System.out.println("---Here are all your contacts---");
        for (Fields oj : ob) {
            viewDetails(oj);
        }
    }

    public void searchContact(ArrayList<Fields> ob)
    {
        System.out.println("You could search for a contact from their first names:");
        Scanner sc = new Scanner(System.in);
        String searchName = sc.nextLine();
        int count = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        int i = 0;
        for (Fields oj : ob) {
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
            Primary object = new Primary();
            object.viewDetails(ob.get(index));

        }

    }

    Fields ob = new Fields();
    Primary ob1 = new Primary();

    public void addFirstName(String fn) {
        ob.setFirstName(fn);
    }

    public void addLastName(String ln) {
        ob.setLastName(ln);
    }

    public boolean addNumber(String number) {
        if (ob1.phoneNumber(number)) {
            ob.setContactNumbers(number);
            return true;
        }
        return false;
    }

    public boolean addEmail(String mail) {
        if (ob1.email(mail)) {
            ob.setEmailAddress(mail);
            return true;
        }
        return false;
    }

    public Fields addContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have chosen to add a new contact:\nPlease enter the name of the Person");
        System.out.print("First Name: ");
        addFirstName(sc.nextLine());
        System.out.print("Last Name: ");
        addLastName(sc.nextLine());
        boolean a = true;
        while (a) {
            System.out.print("Contact Number: ");
            String no = sc.nextLine();
            a = addNumber(no);
            if (!a) {
                System.out.println("invalid no please re-enter");
                a = true;
                continue;
            }
            System.out.println("Would you like to add another contact number? (y/n): ");
            char c = (sc.nextLine()).charAt(0);
            a = c == 'y';
        }//end of while
        System.out.println("Would you like to add email address? (y/n):");
        char c = (sc.nextLine()).charAt(0);
        if (c == 'y') {
            System.out.print("Email Address: ");
            String mai = sc.nextLine();
            boolean a1 = addEmail(mai);
            while (!a1) {
                System.out.println("invalid email please re-enter");
                System.out.print("Email Address: ");
                a1 = addEmail(sc.nextLine());
                continue;
            }
        }
        return ob;


    }

    public boolean phoneNumber(String phone) {
        String pattern = "^(\\+91|0)?[6-9]{1}[0-9]{9}$";
        return Pattern.matches(pattern, phone);
    }

    public boolean email(String mail) {
        String pattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return Pattern.matches(pattern, mail);
    }


}

