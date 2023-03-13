
public class Users extends ID{
    private String name;
    private int id;
    private String password;
    public Users(String name,String password,int id, String blood, String age,String weight,String location,String phone_no)
    {
        super(blood,age,weight,location,phone_no);
        this.name=name;
        this.id=id;
        this.password=password;
		System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("                                                Name: "+name);
		System.out.println("                                                Password: "+password);
		System.out.println("                                                Id: "+id);
        System.out.println("                                                Blood Group: "+blood);
		System.out.println("                                                Age: "+age);
		System.out.println("                                                Weight: "+weight);
		System.out.println("                                                Location: "+location);
		System.out.println("                                                Phone number: "+phone_no); 
		System.out.println("                               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

    public String getPassword() 
	{
        return password;
    }
    public String getName()
	{
        return name;
    }
    public int getId()
	{
        return id;
    }
}