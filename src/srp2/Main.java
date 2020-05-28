package srp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Main {

	public static void main(String[] args) {
		
		List<Employee> employees =  new ArrayList<Employee>() {{
			add(new Employee(UUID.randomUUID().toString(), "Samuel", LocalDate.of(2019, 9, 03), 1000.0));
			add(new Employee(UUID.randomUUID().toString(), "Simon", LocalDate.of(2019, 1, 03), 15000.0));
			add(new Employee(UUID.randomUUID().toString(), "Rolland", LocalDate.now(), 15000.0));
		}};
		
		for (Employee employee : employees) {
			System.out.println(employee.getName()+" Promotions? "+new HRPromotions().isPromotionDueThisYear(employee)+" Taxes: "+new FinITCalculations().calcIncomeTaxForCurrentYear(employee));
		}

	}

}
