
public class EmpWageSwitchcase {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		// TODO Auto-generated method stub
		int employeePresent=1;
		int employeePartTime=2;
		int WagePerHour=20;
		int EmpHour=8;
		int PartTimeHour=4;
		int ispresent=(int) (Math.floor(Math.random()*10)%3);
		switch (ispresent) {
		case 0:
			System.out.println("Employee is Present");
			System.out.println("Employee wage for Day=" +WagePerHour*EmpHour);
			break;
		case 1:
			System.out.println("Employee is doing part time");
			System.out.println("Employee Part time wage=" +PartTimeHour*WagePerHour);
			break;
		default:
			System.out.println("Employee is Absent");
			System.out.println("Employee wage for Day=0");
		
		}
		
		
	}

}
