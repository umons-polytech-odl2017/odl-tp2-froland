package exercise1;

public class FixedSalaryEmployee extends Employee {
	private final int fixedSalary;

	protected FixedSalaryEmployee(String name, int fixedSalary) {
		super(name);
		this.fixedSalary = fixedSalary;
	}

	@Override
	public int computeSalary() {
		return fixedSalary;
	}
}
