package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer samet = new IndividualCustomer();
		samet.customerNumber = "12345";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";

		CustomerManager customerManager = new CustomerManager();
		// customerManager.add(hepsiBurada);
		// customerManager.add(samet);

		Customer[] customers = { samet, hepsiBurada };

		customerManager.addMultiple(customers);
	}

}
