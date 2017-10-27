package exercise1;

public class WorkHourSalaryEmployee extends Employee {
	private final int hourRate;

	protected WorkHourSalaryEmployee(String name, int hourRate) {
		super(name);

		this.hourRate = hourRate;
	}

	@Override
	public int computeSalary() {
		return getWorkedHours() * hourRate;
	}
}
