package lesson4HomeWork2;


import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1= new Customer(1,"Samet","Doğan", 1998, "000000000000");
		Customer customer2= new Customer(1, "Alihan", "Kirpik", 1998, "00012345666");
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());		
		customerManager.save(customer1);
		
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.save(customer2);
		

	}

}
