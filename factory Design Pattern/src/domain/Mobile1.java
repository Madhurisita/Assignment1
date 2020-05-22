package domain;

public class Mobile1 implements Product 
{

	@Override
	public void ProductType()
	{
 System.out.println("IPHONE MOBILE WITH OS TYPE IOS");
	}

	@Override
	public void ProductCost(double price) 
	{
		double gstamt= price*(0.05);
		double totalprice=price+gstamt;
		System.out.println("PRICE INCLUDING 5% GST AMOUNT IS="+totalprice);
		
	}

}
