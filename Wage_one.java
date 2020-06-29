public class Wage_one{
	public static final int Is_Parttime=1;
	public static final int Is_Fulltime=2;

	private int num_of_company=0;
	private Wage[] companyEmpWageArray;

	public Wage_one() {
		companyEmpWageArray = new Wage[5];
	}

	public void addWage(String company, int wagePerHr, int number_of_working_days, int max_hrs_in_month){
		companyEmpWageArray[num_of_company]=new Wage(company, wagePerHr, number_of_working_days, max_hrs_in_month);
		num_of_company++;
	}

	public void employee_comp() {
		for (int i=0; i < num_of_company; i++){
			companyEmpWageArray[i].set_total_emp_wage(this.employee_comp(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		} 
	}

	 int employee_comp(Wage companyEmpWage) {
		int hrs=0, total_hrs=0, totalWorkingDays=0;
		while (total_hrs <= companyEmpWage.max_hrs_in_month && totalWorkingDays < companyEmpWage.number_of_working_days){
		totalWorkingDays++;
		double random_Check_2=Math.floor(Math.random() * 10) % 3;
		int random=(int)random_Check_2;	
		switch(random){
				case Is_Parttime:
				hrs=4;
				break;
				case Is_Fulltime:
				hrs=8;
				break;
				default:
				hrs=0;
			}
			total_hrs+=hrs;
			System.out.println("Day: " + totalWorkingDays + " Emp Hours: " +hrs);
		}
		return total_hrs * companyEmpWage.wagePerHr;
	}

	public static void main(String[] args) {
		Wage_one empWageBuilder = new Wage_one();
		empWageBuilder.addWage("DMart",20,20,100);
		empWageBuilder.addWage("Reliance",10,14,60);
		empWageBuilder.employee_comp();
	}
}
