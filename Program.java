import model.Customer;
import model.Product;
import java.util.ArrayList;

public class Program
{
	public static void main(String[] args)
	{
		System.out.println("Let's make our first Customer object, based on the blueprints in the class!");
		Customer cx = new Customer("Billy", "Bob");
		System.out.println("Here is the first customer: " + cx.toString());
		System.out.println("Look at this garbage... what???");

		String name = cx.getFullName();
		System.out.println("Let's get the first name now: " + name);

		// now, let me make a list of customers, and set the id to be the length of that new list
		// in our case, an ArrayList
		java.util.ArrayList<Customer> customers = new java.util.ArrayList<>();
		
		// first, insert the next customer in the new ArrayList
		customers.add(cx);

		// now, get the size of that arraylist
		int proposedId = customers.size();

		// now, use the size to use it as the id
		cx.setId(proposedId);

		// showing the id of the customer now to prove it works
		System.out.println("New ID is: " + cx.getId());

		Customer cx2 = new Customer("Some", "Body");
		Customer cx3 = new Customer("Dilly", "Dally");
		Customer cx4 = new Customer("Foo", "Bar");
		
		customers.add(cx2);
		cx2.setId(customers.size());
		customers.add(cx3);
		cx3.setId(customers.size());
		customers.add(cx4);
		cx4.setId(customers.size());

		System.out.println("Size of the list is now " + customers.size());

		// we just want the first names of each customer on the screen

		for (int i = 0; i < customers.size(); i++)
		{
			Customer customer = customers.get(i);
			System.out.println("Customer ID: " + customer.getId() + " Name: " + customer.getFullName());
		}

		Product thing = new Product("Cheap Shit");
		cx.addProduct(thing);
		ArrayList<Product> stuff = new ArrayList<>(cx.sendProducts());
		System.out.println("Customer bought this one thing: " + stuff.get(0).getName() + " so they own " +  stuff.size() + " things");	
	}

}
