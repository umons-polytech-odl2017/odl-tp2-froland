package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee {
	private final int baseSalary;
	private final int commission;

	protected BaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission) {
		super(name);
		this.baseSalary = baseSalary;
		this.commission = commission;
	}

	@Override
	public int computeSalary() {
		return baseSalary + getSales() * commission;
	}
}
