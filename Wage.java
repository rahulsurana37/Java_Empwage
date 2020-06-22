class Wage{
public static void main(String[] args) {
	System.out.println("Welcome to JAVA exercise");
	int is_Present=1;
	int Wage_per_hour=20;
	int Full_time=8;
	int salary;
	double random_Check=Math.floor(Math.random() * 10) % 2;
	if (random_Check==is_Present) {
		System.out.println("Employee is present");
		salary=Wage_per_hour*Full_time;
		System.out.println(salary);
	}
	else{
		System.out.println("Employee is absent");
	}
}
}