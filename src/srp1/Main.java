package srp1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(UUID.randomUUID().toString(), "Samuel", LocalDate.of(2019, 9, 03), 1000.0));
		employees.add(new Employee(UUID.randomUUID().toString(), "Simon", LocalDate.of(2019, 1, 03), 15000.0));
		employees.add(new Employee(UUID.randomUUID().toString(), "Rolland", LocalDate.now(), 15000.0));
		
		for (Employee employee : employees) {
			System.out.println(employee.getName()+" Promotions? "+employee.isPromotionDueThisYear()+" Taxes: "+employee.calcIncomeTaxForCurrentYear());
		}

	}

}
