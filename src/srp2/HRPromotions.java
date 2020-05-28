package srp2;

import java.time.LocalDate;

public class HRPromotions {

	public Boolean isPromotionDueThisYear(Employee employee) {
		return employee.getDateOfJoining().isBefore(LocalDate.now());
	}
}
