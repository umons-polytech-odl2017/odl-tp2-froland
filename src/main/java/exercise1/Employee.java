package exercise1;

import exercise2.Payable;

public abstract class Employee implements Payable {
	private final String name;
	private int sales = 0;
	private int workedHours = 0;

	protected Employee(String name) {
		this.name = name;
	}

	@Override
	public abstract int computeSalary();

	public void sell() {
		sales++;
	}

	protected int getSales() {
		return sales;
	}

	public void workOneHour() { workedHours++; }

	public int getWorkedHours() {
		return workedHours;
	}

	public String getName() {
		return name;
	}
}
