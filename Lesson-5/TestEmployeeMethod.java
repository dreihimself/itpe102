public class TestEmployeeMethod	 
{
	public static void main(String[] args) 
	{
		Employee aWorker = new Employee();
		aWorker.setValues();
		aWorker.methodThatUsesInstanceAttributes();
		aWorker.methodThatUsesLocalVariables();
	}
}