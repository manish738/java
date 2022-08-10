class LearntrycatchEg
{
	public static void main(String args[])
	{
		System.out.println("Main method started");
		int a[]=new int[5]; 
		try{
		    
               	 	a[5]=30/0;    
                	System.out.println(a[10]);
		}
		catch(Exception e)
		{
		System.out.println("Arithmetic exception can't divided by zero");
		}
		System.out.println("Main method ended");
	}
}