package objectOrientedProgramming.Junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import objectOrientedProgramming.Employee;
import objectOrientedProgramming.HRService;

public class JunitTests {
	private HRService hr1 ;
	private Employee emp1 ;
	private Employee emp2;
	@Before
	public void Setup()
{
	HRService hr1 = new HRService();
	Employee emp1 = new Employee(10,"Ravali","Kondreddi");
	Employee emp2 = new Employee(11,"John","Gibbons");

}
@Test
public void TestRemoveEmployee()
{
	hr1.addEmployee(emp1);
	hr1.addEmployee(emp2);
int result = hr1.removeEmployee(10);
assertEquals(1,result);
}
@Test
public void TestSearchEmployee()
{
	hr1.addEmployee(emp1);
	hr1.addEmployee(emp2);
List<Employee> sample= hr1.search("Ravali","Kondreddi");
assertEquals("Ravali",sample.get(0).getFirstName());
}
public void TestSearchEmployeeusingid()
{
	hr1.addEmployee(emp1);
	hr1.addEmployee(emp2);
/*????*/
}

}