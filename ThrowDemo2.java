/* See the example programme for Java throw keyword below.
 Write the same programme to throwthe exceptionstringvalue “invalid”
 if integer value of age is less than 22,
 with else condition “welcome aboard”.Validatefor agevalue 19. 
Show the resulting output.
 Repeat the same programme to validate for age value 24. */


class ThrowDemo2
{
	static void invalid(int age)
	{
	if(age<22)
		throw new ArithmeticException ("invalid");
	else
		System.out.println("Welcome abroad");
	}
	public static void main(String args[])
	{
		invalid(24);
		System.out.println("code remainder");

	}


}