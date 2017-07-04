/*Initialize Objects */

class Student{
	
	int id;
	String name;
	
	/*public static void main(String[] args)
	{
		
	}*/
	
	void insertRecord(int r,String n)
	{
		id=r;
		name=n;
	}
	
	void displayInformation()
	{
		System.out.println(id+name);
	}
}

class TestStudent{
	
	public static void main(String[] args)
	{
		Student s=new Student(); //create object using new keyword
		s.id=101; 				//initialize using reference variable
		s.name="Shraddha";
		System.out.println(s.id+ s.name); //accessing using reference variable
		
		s.insertRecord(102, "sai");  //initialize object through method
		s.displayInformation();
		
		//initialization through constructor
		
		
	}
	
	
}
