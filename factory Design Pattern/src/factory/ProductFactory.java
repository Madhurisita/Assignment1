package factory;

import domain.Laptop;
import domain.Mobile1;
import domain.Product;

public class ProductFactory 
{

	public Product getProduct(int producttype) 
	{
	 Product p1=null;
			 switch(producttype)
			 {
			 case 1:p1=new Laptop();
			        break;
			 case 2:p1=new Mobile1();
			        break;
			 }
			 return p1;
		 }
	}


