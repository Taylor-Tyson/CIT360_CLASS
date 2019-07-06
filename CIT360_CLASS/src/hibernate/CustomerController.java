package hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
	
	private final CustomerRepo customerRepo;
	
	public CustomerController (CustomerRepo customerRepo) {
		this.customerRepo=customerRepo;
	}

		@RequestMapping("/")
		public String index() {
			return "Hello people";
		}
		
		@GetMapping("/createPerson")
		public String createPerson(@RequestParam String first, @RequestParam String last) {
			customerRepo.save(new Customer(first, last));
			return "Created person " + first +" " + last;
		}
		
		@GetMapping("/findByLastName")
		public String findByLastName(@RequestParam String last) {
			
			List<String> customers = customerRepo.findByLastName(last).stream().map(c -> c.firstName + " " + c.lastName).collect(Collectors.toList());
			return "Found people " + String.join(", ",customers);
		}
		
		//JSON
		@RequestMapping("/customers")
		public List<Customer> getAllCustomers() {
			List<Customer> customers = new ArrayList();
			customerRepo.findAll().forEach(customers::add);
			return customers;
		}
}