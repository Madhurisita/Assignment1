package domain;

public class Laptop implements Product {

	@Override
	public void ProductType()
	{
		System.out.println("HP LAPTOP WITH WINDOWS OS");
	}

	@Override
	public void ProductCost(double price)
	{
		double gstamt= price*0.10;
		double totalprice=price+gstamt;
		System.out.println("PRICE INCLUDING 10% GST AMOUNT IS="+totalprice);
	}

}
