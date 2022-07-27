class StringExample1
{
	public static void main(String[] args)
	{
		String str = "Manish is a Boy";
		int length = str.length();
		System.out.println("Length of String: " + length);
		System.out.println("letter at index position 2: " + str.charAt(2));
		System.out.println("index position of letter: " + str.indexOf('d'));
		System.out.println("contains method:" + str.contains("Boy"));
		System.out.println("Lower Case: " + str.toLowerCase());
		System.out.println("Upper Case: " + str.toUpperCase());
		System.out.println("substring method: " +str.substring(3,5));
		System.out.println("replace method: " +str.replace('M','A'));
		System.out.println("string equals: " + str.equals("is"));
		System.out.println("string equalsIgnoreCase: " + str.equalsIgnoreCase("a"));
		System.out.println("string Upper trim: " + str.trim());
		System.out.println("string startsWith: " + str.startsWith("Ma"));


	}
}