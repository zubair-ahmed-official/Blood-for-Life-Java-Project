import java.util.Scanner;
import java.io.*;

  class File56
{
	public void SearchBlood()
 {
	 Scanner s =new Scanner(System.in);
	 System.out.print("                                            SEARCH FOR BLOOD:");
	 String blood = s.next();
	 String line="";
	 try{
		 FileInputStream fin =new FileInputStream("C:\\Users\\USER\\Videos\\ID.txt");
		 Scanner sc =new Scanner(fin);
		 while(sc.hasNext())
		 {
			 line = sc.nextLine();
			 if(line.contains(blood))
			 {
				 System.out.println(line);
		     }
		 }
		 sc.close();
	 }
	 
	 catch(IOException e)
		{
			e.printStackTrace();
		}
 }
}

public class UserActivity6 extends File56 {
    private boolean xy=true;
    private int userChoice;
    Scanner choice=new Scanner(System.in);
	public static void clrscr()
        {
	   try{
		   new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
       }
    public void UserAct(Users u1)
    {   
        while(xy==true)
        {
			System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("                                                 1. PROFILE ");
			System.out.println("                                                 2. FIND BLOOD"); 
			System.out.println("                                                 3. EXIT");
			System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            userChoice=choice.nextInt();
            switch(userChoice){
                case 1:
				clrscr();
				System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                System.out.println("                                              NAME: "+u1.getName());
				System.out.println("                                              ID: "+u1.getId());
				System.out.println("                                              PASSWORD: "+u1.getPassword());
				System.out.println("                                              BLOOD GROUP: "+u1.getBlood());
				System.out.println("                                              AGE: "+u1.getAge());
				System.out.println("                                              WEIGHT: "+u1.getWeight());
				System.out.println("                                              LOCATION: "+u1.getLocation());
				System.out.println("                                              PHONE NUMBER: "+u1.getPhone());
				System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                break;
                
                case 2:
				clrscr();
				System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("                                              FIND BLOOD: ");
				System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

				File56 f56 = new File56();
				f56.SearchBlood();
				break;
				
				case 3:
				System.exit(0);
				/* try{
				xy = false;
				}
				catch(Exception e)
				{} */
			}
		}
				
        choice.close();
    }
}