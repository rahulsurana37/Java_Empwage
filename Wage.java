class Wage{
public static void main(String[] args) {
	System.out.println("Welcome to JAVA exercise");
	int is_Present=1;
	int Wage_per_hour=20;
	int total_working_days=20;
	int total_working_hours=100;
	int salary_per_month=0;
	//int Full_time_hrs=8;
	//int Part_time_hrs=4;
	//double absent=0;
	//double fulltime=1;
	//double parttime=2;
	int salary=0;
	int hours=0;
	int partpay=0;
	int fullpay=0;
	double random_Check=Math.floor(Math.random() * 10) % 2;
	double random_Check_1=Math.floor(Math.random() * 10) % 3;
	for (int i=0; i<total_working_hours||i<total_working_days;i++) {
		int random=(int)random_Check_1;
			switch(random){
				case 1:
				System.out.println("Employee is present and is Full-time");
				hours=8;
				salary=Wage_per_hour*hours;
				fullpay=salary+fullpay;
				System.out.println("Salary Earned by full time employee is: "+fullpay);
				break;
				case 2:
				System.out.println("Employee is present and is Part-time");
			    hours=4;
			    salary=Wage_per_hour*hours;
				partpay=salary+partpay;
				System.out.println("Salary Earned by part time employee is: "+partpay);
				break;
				default:
				System.out.println("Employee is absent");
				break;
			}
	}
	//salary=Wage_per_hour*hours;
	
				
	//salary_per_month=total_working_days*salary;
	//System.out.println("Total salary earned is: "+salary_per_month);
}
}





















	/*if (random_Check==is_Present) {
		if (random_Check_1==fulltime) {
			System.out.println("Employee is present and is Full-time.");
			salary=Wage_per_hour*Full_time_hrs;
			System.out.println("The Full time salary is "+salary);
		}
		else if (random_Check_1==parttime){
			System.out.println("Employee is present and is Part-time.");
			salary=Wage_per_hour*Part_time_hrs;
			System.out.println("The Part time salary is "+salary);
		}		
	}
	else{
		System.out.println("Employee is absent");
	}
}
}*/