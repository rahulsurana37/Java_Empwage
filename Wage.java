class Wage{
	public static final int Is_Parttime=1;
	public static final int Is_Fulltime=2;
	public static final int wagePerHr=20;
	public static final int number_of_working_days=20;
	public static final int max_hrs_in_month=100;

		public static int employee_comp(){
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
			System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +hrs);
		}
		int totalEmpWage=total_hrs*wagePerHr;
		System.out.println("Total Emp wage: "+totalEmpWage);
		return totalEmpWage;
		}
		
public static void main(String[] args) {
	System.out.println("Welcome to Employee wage caluclation using Java");
	employee_comp();

}
}


/*class Wage{
	public int Emp_computation(){
	int Wage_per_hour=20;
	int total_working_days=20;
	int total_working_hours=0;
	int salary=0;
	int hours=0;
	int total_salary=0;
	double random_Check=Math.floor(Math.random() * 10) % 2;
	
	for (int i=0;i<total_working_days;i++) {
		if(total_working_hours<100) {
		double random_Check_1=Math.floor(Math.random() * 10) % 3;
		int random=(int)random_Check_1;
			switch(random){
				case 1:
				hours=8;
				salary=Wage_per_hour*hours;
				break;
				case 2:
			    hours=4;
			    salary=Wage_per_hour*hours;
				break;
				default:
				hours=0;
				salary=0;
				break;
			}
			
			total_salary=total_salary+salary;
			total_working_hours=total_working_hours+hours;
		}
		
	}
	System.out.println("Total working hours till now: "+total_working_hours);
	return total_salary;
}


public static void main(String[] args) {
	System.out.println("Welcome to JAVA exercise");
	Wage abc= new Wage();
	System.out.println("Total Salary: "+abc.Emp_computation());
}
}
*/