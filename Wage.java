class Wage{
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
