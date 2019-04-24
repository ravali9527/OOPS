package objectOrientedProgramming;

import java.util.ArrayList;
import java.util.List;

public class HRService {
	ArrayList<Employee>l1 = new ArrayList();
	public void addEmployee(Employee e)
	{
l1.add(e);
	}
	
	public int removeEmployee(int id)
	{
		System.out.println(l1.size());
		for(int i =0;i<l1.size();i++)
		{
		
		if(l1.get(i).getid()==id)
		{
		l1.remove(i);
		System.out.println(l1.size());
}
		}

	return l1.size();
	
	
	}

	public List<Employee> search(String firstName, String lastName)
	{
		ArrayList<Employee>emp = new ArrayList<Employee>();
		
		for(int i =0;i<l1.size();i++)
		{
		if(l1.get(i).getFirstName()==firstName&&l1.get(i).getLastName()==lastName)
	{
		emp.add(l1.get(i));
	}
		
		
		
	}
		return emp;

	}

	void search(int id)
	{
		for(int i=0;i<l1.size();i++)
		{
			if(l1.get(i).getid()==id)
			{
				System.out.println(l1.get(i));
			}
	}
	
}
	}















