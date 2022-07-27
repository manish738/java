/*class StringT,tooutput the tokenized value for the string “You are a woman”.
 Write the same programme for the class Stringy,
 tooutput the value for the string “Tomorrow is Monday”.*/


import java.util.StringTokenizer;

class StringT
{
	public static void main(String args[])
		{
		StringTokenizer st = new StringTokenizer("I am a women"," ");
		StringTokenizer mt = new StringTokenizer("Tomorrow is monday"," ");
		while(st.hasMoreTokens())
			{
			System.out.println(st.nextToken());
			}
		while(mt.hasMoreTokens())
			{
			System.out.println(mt.nextToken());
			}
		}


}
