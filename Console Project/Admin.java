class Admin{
    private boolean found=false;
    public void a1(Users u1, String p1) {
        for(int i=0;i<5;i++)
        {
            if(u1.getPassword().equals(p1))
            {
                found=true;
                break;
            }
        }   
        if(found==true)
        {
			System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("                                            SUCCESSFULLY LOGGED IN");
            System.out.println("                                            WELCOME "+u1.getName());
			System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            UserActivity6 uac1=new UserActivity6();
            uac1.UserAct(u1);
        }
        else{
            System.out.println("                                             INCORRECT PASSWORD");
        }
    }
}