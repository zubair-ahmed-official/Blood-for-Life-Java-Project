
public class ID {
	private String blood;
    private String age;
	private String weight;
    private String location;
	private String phone_no;
    public ID(String blood,String age,String weight,String location,String phone_no)
    {
		this.blood = blood;
		this.age = age;
		this.weight = weight;
		this.location = location;
		this.phone_no = phone_no;
    }
    
    public String getBlood() 
	{
        return blood;
    }
    public String getAge() 
	{
        return age;
    }
	public String getWeight() 
	{
        return weight;
    }
	public String getLocation() 
	{
        return location;
    }
	public String getPhone() 
	{
        return phone_no;
    }
    
}