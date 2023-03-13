import java.io.*;
import java.util.Scanner;
public class Login extends File56 {
    public static String[] userDB;
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

	public static void main(String[] args){
        Scanner option=new Scanner(System.in);
        Scanner strInput=new Scanner(System.in);
        
        boolean x = true;       
        userDB=new String[50];  
        Users[] xx=new Users[50];  
        int i=0;    
        int choice;    
        int id=100;     
       
        Admin a1=new Admin();   
        while(x==true)
        { 
	         System.out.println("                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		     System.out.println("                                            BLOOD FOR LIFE         ");
		     
			 System.out.println("");
			 System.out.println("                                                   O+ ");
			 System.out.println("                                              A+         A-");
			 System.out.println("");
			 System.out.println("                                           B+               B-");
			 System.out.println("");
			 System.out.println("                                             O+           O-");
			 //System.out.println("");
			 System.out.println("                                                 AB+ AB-");
			 System.out.println("");
			 System.out.println("                                        Donate Blood,Be a Hero");
			 System.out.println("                                 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
             System.out.println("                                          Choose Option: " );
		     System.out.println("                                            1. Create New Account");
		     System.out.println("                                            2. Log in");
			 System.out.println("                                            3. About");
		     System.out.println("                                            4. Exit");
		     System.out.println("                                  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			 
            choice=option.nextInt();
            switch(choice){
            case 1:
			    clrscr();
			    System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print("                                            Enter Your Name: ");
                String name=strInput.nextLine();
				System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print("                                            Enter Your Password: ");
                String password=strInput.nextLine();
				System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print("                                            Enter Your Blood Group: ");
			    String blood =strInput.nextLine();
				System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			    System.out.print("                                            Enter Your Age: ");
			    String age=strInput.nextLine();
				System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			    System.out.print("                                            Enter Your Weight: ");
			    String weight=strInput.nextLine();
				System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			    System.out.print("                                            Enter Your Location: ");
			    String location=strInput.nextLine();
				System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			    System.out.print("                                            Enter Your Phone Number: ");
				String phone_no=strInput.nextLine();
				System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                xx[i]=new Users(name,password,id=id+1,blood,age,weight,location,phone_no); 
                userDB[i++]=name; 
			try
		    { 
            File file1 = new File("C:/Users/USER/Videos/ID.txt");
			file1.createNewFile();
			
			System.out.println("                  ");
			//System.out.println("                                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            PrintWriter pw=new PrintWriter(new FileOutputStream(file1,true));
            pw.append("\nName: "+name+", Blood Group: "+blood+", Age: "+age+", Weight: "+weight+", Location: "+location+", Phone Number: "+phone_no);
            pw.close();
			//System.out.println("                                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
			catch(Exception e)
		    {
			System.out.println(e);
		    }

                break;
            case 2:
			    clrscr();
			    System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print("                                              Enter your Name: ");
                String aName=strInput.nextLine();
				System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print("                                              Enter your password: ");
                String apass=strInput.nextLine();
				System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                for(int k=0;k<i;k++)            
                {
                    if(userDB[k].equals(aName))
                    {
                     a1.a1(xx[k], apass);
                     File56 f1 = new File56();
	                 f1.SearchBlood();						
                     break;
                    }
                    else{
                        System.out.println("                                 Invalid Username or Password");
                    }
					
                }
				
                break;
			case 3 :
			clrscr();
            System.out.println("                           ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");			
            System.out.println("                                   'Blood For Life' is an application where ");
			System.out.println("                                    we can find for blood and donate blood "); 
			System.out.println("                                    if the blood matches.It provides persons ");
			System.out.println("                                    name,age,weight,location,phone number."); 
			System.out.println("                                    They can contact through the phone call.");
			System.out.println("                                    It's a beautiful initiative.");
									   
			System.out.println("                                    We hope it will be very helpful the people of the society.");
			System.out.println("                          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			 
			break;
			 
            case 4 :
                x=false;
            }
        }
        option.close();
        strInput.close();
    }
}