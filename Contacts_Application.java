import java.util.Scanner;
class Start
{
    public static void menu()
    {
        System.out.println("\n");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("|         PHONE BOOK APPLICATION     |");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("|         [1] Add Contacts           |");
        System.out.println("|         [2] Display all Contacts   |");
        System.out.println("|         [3] Search by name         |");
        System.out.println("|         [4] Update                 |");
        System.out.println("|         [5] Delete                 |");
        System.out.println("|         [6] Delete All             |");
        System.out.println("|         [7] Number of contacts     |");
        System.out.println("|                                    |");
        System.out.println("--------------------------------------");
        System.out.println("|         [8] Exit                   |");
        System.out.println("--------------------------------------");
    }
}
class Display extends Start
{
    public static int choice;
    public static int contact = 0;
    public static int a = 0;
    public static int total_no_of_contacts = 0;
    public static String[] contact_name = new String[100];
    public static String[] contact_number = new String[100];

        public static void show()
        {
            
            Scanner sc = new Scanner(System.in);
            do
            {
                Start s1 = new Start();
               
                if(a == 0)
                {   
                s1.menu();
                System.out.print("\n\nEnter Your choice: ");
                choice = sc.nextInt();
                a++;
                }
                else
                {
                    break;
                }
                
                
				System.out.println();

                if (choice == 1) 
				{

                    System.out.println("Enter your name : ");
                    sc.nextLine();
                    contact_name[contact] = sc.nextLine();
                    
                    System.out.println("Enter your number: ");
                    contact_number[contact] = sc.nextLine();
                    if( contact_number[contact].length() > 10   )
                    {
                        do{
                            System.out.println("Contact must Contain 10 Digits.");
                              System.out.println("Enter your number: ");
                              contact_number[contact] = sc.nextLine();
                        }while(contact_number[contact].length() < 10 );
                    }
                    System.out.println("Contact Added successfully!!!");
                    contact++;
                    total_no_of_contacts++;
                }

                else if (choice == 2)
                {
                    int i,j=0,x=1;
                    for (i = 0; i < 100; i++)
                    {
                        if (contact_name[i] != contact_name[contact_name.length - 1])
                        {
                            System.out.println( x++ + "]");
                            System.out.println("Contact Name  : " + contact_name[i]);
                            System.out.println("Contact Number: " + contact_number[i]);
                            System.out.println("");
                            j++;
                        }
                    }
                    if(j==0)
                    {
                        System.out.println("No Contact Found!!!");
                    }
                }
                else if(choice == 3)
                {
                    int j2 = 0;
                    System.out.println("Enter Contact Name: ");
                    sc.nextLine();
                    String temp1 = sc.nextLine();
                    int i;
                    for(i=0;i<100;i++)
                    {
                        if(temp1.equals(contact_name[i]))
                        {
                            System.out.println("Contact Info Found!!!");
                            System.out.println("");
                            System.out.println("Contact Name  : "+contact_name[i]);
                            System.out.println("Contact Number: "+contact_number[i]);
                            j2++;
                        }
                    }
                    if(j2==0)
                    {
                        System.out.println("Contact Info not Found!!!");
                    }
                }

                else if(choice == 4)
                {
                    String temp2,temp3;
					String temp4;
                    int j3 = 0;
                    System.out.println("Enter Name you want to update: ");
                    sc.nextLine();
                    temp2 = sc.nextLine();
                    int i;
                    for(i=0;i<100;i++)
                    {
                        if(temp2.equals(contact_name[i]))
                        {
                            System.out.println("New name: ");
                            temp3 = sc.nextLine();
                            System.out.println("New number: ");
                            temp4 = sc.nextLine();
                            if( temp4.length() > 10)
                    {
                        do{
                            System.out.println("Contact must Contain 10 Digits.");
                              System.out.println("Enter your NEW number: ");
                              temp4 = sc.nextLine();
                        }while(temp4.length() < 10);
                    }
                            contact_name[i]=temp3;
                            contact_number[i]=temp4;
                            System.out.println("Contact Updated Successfully!!!");
                            j3++;
                        }
                    }

                    if(j3 == 0)
                    {
                        System.out.println("Contact Not Found!!!");
                    }

                }

                else if(choice == 5)
                {
                    String temp5;
                    int j4 = 0;
                    System.out.println("Enter Name of contact you want to delete: ");
                    sc.nextLine();
                    temp5 = sc.nextLine();
                    int i;
                    for(i=0;i<100;i++)
                    {
                      if(temp5.equals(contact_name[i]))
                      {
                          System.out.println("Contact Deleted Successfully!!!");
                          System.out.println("Contact Name  : "+contact_name[i]);
                          System.out.println("Contact Number: "+contact_number[i]);
                          System.out.println(" ");
                          for(int k=i; k<contact_name.length-1;k++)
                          {
                              contact_name[k]=contact_name[k+1];
                              contact_number[k]=contact_number[k+1];
                          }
                          contact--;
                          total_no_of_contacts--;
                          j4++;
                          break;
                      }
                    }

                    if(j4 == 0)
                    {
                        System.out.println("Contact Not Found!!!!");
                    }
                }

                else if(choice == 6)
                {
                    int i;
                    System.out.println("All Contacts Deleted Successfully!!!!");
                    for(i=0; i<contact;i++)
                    {
                        contact_name[i]=contact_name[i+1];
                        contact_number[i]=contact_number[i+1];
                    }
                    contact = 0;
                    total_no_of_contacts = 0;
                }

                else if(choice == 7)
                {
                    System.out.println("Total Number of Contacts: "+total_no_of_contacts);
                }
                else
                {
                    System.out.println("Invalid input...!");
                }
                 System.out.println("Menu  (Yes/No) : ");
                   
                    String ans = sc.nextLine();
                    String y_ans = "Yes";
                  boolean outans =  ans.equalsIgnoreCase(y_ans);
                  if(outans == true)
                  {
                    a = 0;
                  }
                    
            }
            while (choice != 8);
        }

}
class Contacts_Application
{
    public static void main(String args[])
    {
        Display d2 = new Display();
        d2.show();
        System.out.println("\nThanks for using our software!!!!");
    }
}
