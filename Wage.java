class Wage{
	

	public final String company;
	public final int wagePerHr;
	public final int number_of_working_days;
	public final int max_hrs_in_month;
	public int totalEmpWage;

	public Wage(String company, int wagePerHr, int number_of_working_days, int max_hrs_in_month){
		this.company=company;
		this.wagePerHr=wagePerHr;
		this.number_of_working_days=number_of_working_days;
		this.max_hrs_in_month=max_hrs_in_month;
	}
	

	public void set_total_emp_wage(int totalEmpWage){
		this.totalEmpWage = totalEmpWage;
	}

	public String toString() {

		return "Total Emp wage for Company: " +company+ " is: " + totalEmpWage;
	}
}