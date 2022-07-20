public class EncapsTest 
{
		public static void main(String args[])
		{
			Encap obj = new Encap();
			obj.setEmpName("Ramu");
			obj.setEmpAge(22);
			obj.setEmpAadhar(487651234);
			System.out.println("Employee Name: " + obj.getEmpName());
			System.out.println("Employee Aadhar: " + obj.getEmpAadhar());
			System.out.println("Employee Age: " + obj.getEmpAge());
			
			obj.setEmpName("Ganesh");
			obj.setEmpAge(26);
			obj.setEmpAadhar(487651457);
			System.out.println("Employee Name: " + obj.getEmpName());
			System.out.println("Employee Aadhar: " + obj.getEmpAadhar());
			System.out.println("Employee Age: " + obj.getEmpAge());
			
		}
	
}