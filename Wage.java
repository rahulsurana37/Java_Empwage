class Wage{
public static void main(String[] args) {
	System.out.println("Welcome to JAVA exercise");

int is_Present=1;
	double random_Check=Math.floor(Math.random() * 10) % 2;
	if (random_Check==is_Present) {
		System.out.println("Employee is present");
		
	}
	else{
		System.out.println("Employee is absent");
	}
}
}