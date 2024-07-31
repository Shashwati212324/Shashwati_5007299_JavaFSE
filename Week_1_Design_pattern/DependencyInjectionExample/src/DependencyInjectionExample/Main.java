package DependencyInjectionExample;

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerService(customerRepository);

        Customer customer = customerService.getCustomer(1);
        System.out.println("Customer ID: " + customer.getId() + ", Name: " + customer.getName());
    }
}
