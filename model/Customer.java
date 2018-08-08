package model;

import java.util.ArrayList;

public class Customer
{
	// these are the particular properties of ONE customer
	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<Product> products = new ArrayList<>();

	// define how we create a customer

	public Customer(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFName(String name)
	{
		this.firstName = name;
	}

	public String getFName()
	{
		return this.firstName;
	}

	public void setLName(String name)
	{
		this.lastName = name;
	}

	public String getLName()
	{
		return this.lastName;
	}	

	public String getFullName()
	{
		return this.firstName + " " + this.lastName;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getId()
	{
		return this.id;
	}

	public void addProduct(Product purchase)
	{
		this.products.add(purchase);
		System.out.println("Added the product with name: " + purchase.getName());
	}

	public ArrayList<Product> sendProducts()
	{
		return this.products;
	}

}
