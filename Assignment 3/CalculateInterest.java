interface interest
{
	void calcInterest(float principleAmount,float rate,float years);
}
class SimpleInterest implements interest
{
	public void calcInterest(float principleAmount,float rate,float years)
	{
		System.out.println("(Amount,Rate,Year) = (100k,4,2)");
		System.out.println("Simple Interest = " + (principleAmount*rate*years)/100);
	}
}
class CompoundInterest implements interest
{
	public void calcInterest(float principleAmount,float rate,float years)
	{
		System.out.println("(Amount,Rate,Year) = (100k,4,2)");
		System.out.println("Compound Interest = " + principleAmount * (Math.pow((1 + rate / 100), years)));
		
	}
}
class CalculateInterest
{
	public static void main(String[] args)
	{
		interest t = new SimpleInterest();
		t.calcInterest(100,4,2);
		t = new CompoundInterest();
		t.calcInterest(100,4,2);
	}
}