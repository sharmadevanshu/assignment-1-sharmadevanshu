import java.util.Scanner;

class Contact {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Primary obj = new Primary();
        System.out.println("Welcome to Devanshu's contact application, enjoy using!");
        int x = 0;
        while (x != 5) {
            System.out.println("<>-----------x------x----------<>");
            System.out.println("enter 1 to add a new contact");
            System.out.println("enter 2 to view all contacts");
            System.out.println("enter 3 to search contact");
            System.out.println("enter 4 to delete a contact");
            System.out.println("enter 5 to exit");
            System.out.println("<>-----------x------x----------<>");
            int  select = sc.nextInt();

            switch (select) {
                case 1:
                    obj.add_contacts();
                    break;
                case 2:
                    obj.display();
                    break;
                case 3:
                    obj.search();
                    break;
                case 4:
                    obj.delete();
                    break;
                case 5:
                    x = 5;
                    System.out.println("Thank you for using my App..");
                    break;
                default:
                    System.out.println("Invalid select!! Please select a valid select.");
            }
        }
        sc.close();
    }
}