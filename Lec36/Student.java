package Lec36;

public class Student {

	private String name;
	private int age;
	
	Student()
	{
		this.name = "xyz";
	}
	
	Student(String name,int age)
	{
		setName(name);
		try {
			setAge(age);
			return;
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("In finally block");
		}
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
			
		if(age < 0 || age > 100)
			throw new Exception("Wrong age Entered");
		
		this.age = age;	
		System.out.println(this.age);
		
	}

	public void introduce()
	{
		System.out.println(this.name+" "+this.age);
	}
	

}
