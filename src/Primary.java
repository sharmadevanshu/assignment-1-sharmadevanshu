import java.util.ArrayList;
import java.util.Scanner;

class Primary
    {
        ArrayList<Fields> EmptyList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        public void add_contacts()
        {


            Fields obj = new Fields();
            System.out.println("enter first name : ");
            while (!sc.hasNext("[A-Za-z]+"))
            {
                System.out.println("that seems invalid entry, try again?");
                sc.next();
            }
            String n = sc.next();
            obj.setF_name(n);
            System.out.println("enter last name : ");
            while (!sc.hasNext("[A-Za-z]+"))
            {
                System.out.println("that seems invalid entry, try again?");
                sc.next();
            }
            String n2 = sc.next();
            obj.setS_name(n2);
            System.out.println("how many no.s do you want to add? : ");
            int add = sc.nextInt();
            int c = 0;
            while (add > 0) {
                System.out.println("enter a valid 10 digit mobile number : ");
                while (!sc.hasNext("[6789][0-9]{9}")) {
                    System.out.println("it doesn't seems correct, your entered mob. no. must start with 6, 7, 8 or 9 ");
                    sc.next();
                }
                c++;
                String n3 = sc.next();
                if (c == 1) {
                    obj.setPh_no(n3);
                } else {
                    obj.setPh_no(obj.getPh_no() + "\n" + n3);
                }

                add--;

                sc.nextLine();
                obj.setEmail_id(sc.nextLine());
                System.out.println("enter your email address : ");
                while (true)
                {
                    String s = sc.nextLine();
                    if (s.matches("^(.+)@(.+)$"))
                    {
                        obj.setEmail_id(s);
                        break;
                    }
                    else
                        {
                        System.out.println("invalid email, try again!");
                        }
                }
                EmptyList.add(obj);
            }
        }

    public void display()
    {
        for (Fields e : EmptyList)
        {
            System.out.println(e);
        }
    }

        public void search()
        {
            Fields p;
            System.out.println("enter that you want to search");
            String attr = sc.nextLine();
            System.out.println("you want to search by which attribute");
            String s = sc.nextLine();
            for (Fields fields : EmptyList)
            {
                p = fields;
                if (s.equalsIgnoreCase("f_name"))
                {
                    if (p.getF_name().equalsIgnoreCase(attr))
                    {
                        System.out.println("match found" + "\n");
                        System.out.println("<>-----------x------x----------<>");
                        System.out.println(p);
                    }
                }
                    else if (s.equalsIgnoreCase("s_name"))
                    {
                        if (p.getS_name().equalsIgnoreCase(attr))
                        {
                            System.out.println("match found" + "\n");
                            System.out.println("<>-----------x------x----------<>");
                            System.out.println(p);
                        }
                    }
                    else if (s.equalsIgnoreCase("ph_no"))
                    {
                        if (p.getPh_no().contains(attr))
                        {
                            System.out.println("match found" + "\n");
                            System.out.println("<>-----------x------x----------<>");
                            System.out.println(p);
                        }
                    }

                    else if (s.equalsIgnoreCase("email_id"))
                    {
                        if (p.getEmail_id().equalsIgnoreCase(attr))
                        {
                        System.out.println("match found" + "\n");
                        System.out.println("<>-----------x------x----------<>");
                        System.out.println(p);
                        }
                    }
                        else
                        {
                            System.out.println("please enter valid attribute");
                        }
            }
        }

        public void delete()
        {
            Fields p;
            System.out.println("enter that you want to remove");
            String attr = sc.nextLine();
            System.out.println("you want to search by which attribute");
            String s = sc.nextLine();
            for (int i = 0; i < EmptyList.size(); i++)
            {
                p = EmptyList.get(i);
                if (s.equalsIgnoreCase("f_name"))
                {
                    if (p.getF_name().equalsIgnoreCase(attr))
                    {
                        System.out.println("match found"+"\n");
                        System.out.println("<>-----------x------x----------<>");
                        EmptyList.remove(p);
                        System.out.println("the contact of " + p.getF_name()+" has deleted" );
                    }
                }
                else if (s.equalsIgnoreCase("s_name"))
                {
                    if (p.getS_name().equalsIgnoreCase(attr))
                    {
                        System.out.println("match found"+"\n");
                        System.out.println("<>-----------x------x----------<>");
                        EmptyList.remove(p);
                        System.out.println("the contact of " + p.getF_name()+" has deleted" );
                    }
                }
                else if (s.equalsIgnoreCase("ph_no"))
                {
                    if (p.getPh_no().contains(attr))
                    {
                        System.out.println("match found"+"\n");
                        System.out.println("<>-----------x------x----------<>");
                        EmptyList.remove(p);
                        System.out.println("the contact of " + p.getF_name()+" has deleted" );
                    }
                }
                else if (s.equalsIgnoreCase("email_id"))
                {
                    if (p.getEmail_id().equalsIgnoreCase(attr))
                    {
                        System.out.println("match found"+"\n");
                        System.out.println("<>-----------x------x----------<>");
                        EmptyList.remove(p);
                        System.out.println("the contact of " + p.getF_name()+" has deleted" );
                    }
                }
                else
                    {
                        System.out.println("please enter valid attribute");
                    }
            }
        }
    }
