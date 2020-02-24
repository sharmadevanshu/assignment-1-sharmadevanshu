import java.util.Scanner;

public class AddContact {
    Field ob = new Field();
    ValidateInput ob1 = new ValidateInput();

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

    public Field addContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have chosen to add a new contact:\nPlease enter name ");
        System.out.print("first Name : ");
        addFirstName(sc.nextLine());
        System.out.print("last Name: ");
        addLastName(sc.nextLine());
        boolean a = true;
        while (a) {
            System.out.print("enter a valid 10 digit mobile Number: ");
            String no = sc.nextLine();
            a = addNumber(no);
            if (!a) {
                System.out.println("that seems invalid entry, try again?");
                a = true;
                continue;
            }
            System.out.println("would like to add another? (y/n): ");
            char c = (sc.nextLine()).charAt(0);
            a = c == 'y';
        }//end of while
        System.out.println("would you like to add an email address? (y/n):");
        char c = (sc.nextLine()).charAt(0);
        if (c == 'y') {
            System.out.print("email address: ");
            String mai = sc.nextLine();
            boolean a1 = addEmail(mai);
            while (!a1) {
                System.out.println("invalid email please re-enter");
                System.out.print("email address: ");
                a1 = addEmail(sc.nextLine());
                continue;
            }
        }
        return ob;


    }
}