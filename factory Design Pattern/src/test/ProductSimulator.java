package test;

import java.util.Scanner;

import domain.Product;
import factory.ProductFactory;

public class ProductSimulator
{

	public static void main(String[] args) 
	{
Scanner sc1=new Scanner(System.in);
System.out.println("SELECT PRODUCT");
System.out.println("1: LAPTOP");
System.out.println("2: MOBILE");

int choice=sc1.nextInt();

ProductFactory pp1=new ProductFactory();
 Product p1=pp1.getProduct(choice);
 
 
 System.out.println("ENTER PROCUCT PRICE=");
 double price=sc1.nextDouble();
 
 p1.ProductType();
 p1.ProductCost(price);
	}

}
