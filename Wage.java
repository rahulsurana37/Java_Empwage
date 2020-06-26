class Wage{
	public static final int Is_Parttime=1;
	public static final int Is_Fulltime=2;

	private final String company;
	private final int wagePerHr;
	private final int number_of_working_days;
	private final int max_hrs_in_month;
	private int totalEmpWage;

	public Wage(String company, int wagePerHr, int number_of_working_days, int max_hrs_in_month){
		this.company=company;
		this.wagePerHr=wagePerHr;
		this.number_of_working_days=number_of_working_days;
		this.max_hrs_in_month=max_hrs_in_month;
	}
	public void employee_comp() {
		int hrs=0, total_hrs=0, totalWorkingDays=0;
		while (total_hrs <= max_hrs_in_month && totalWorkingDays < number_of_working_days){
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
		totalEmpWage=total_hrs*wagePerHr;
		//System.out.println("Total Emp wage for Company: " +company+" is: "+totalEmpWage);
		//return totalEmpWage;
	}

	public String toString() {

		return "Total Emp wage for Company: " +company+ " is: " + totalEmpWage;
	}


public static void main(String[] args) {
	//employee_comp("Dmart", 20, 20, 100);
	//employee_comp("Reliance", 10, 14, 60);
	Wage Dmart =new Wage("DMart",20,20,100);
	Wage reliance = new  Wage("Reliance",10,14,60);
	Dmart.employee_comp();
	System.out.println(Dmart);
	reliance.employee_comp();
	System.out.println(reliance);
}
}