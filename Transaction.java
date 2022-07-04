
class Transaction
{
	int withdrawamt=5000,depositeamt=2000,balanceamt=10000;
	public void withdraw()
	{
		balanceamt=balanceamt-withdrawamt;
		System.out.println("After Withraw= "+balanceamt);
	}
	public void deposite()
	{
		balanceamt=balanceamt+depositeamt;
		System.out.println("After Deposite= "+balanceamt);
	}
}
