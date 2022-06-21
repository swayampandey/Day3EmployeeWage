
public class PartTimeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		// TODO Auto-generated method stub
		int employeePresent=1;
		int employeePartTime=2;
		int WagePerHour=20;
		int EmpHour=8;
		int ParttimeHour=4;
		int ispresent= (int) (Math.floor(Math.random()*10)%3);
		if (ispresent==employeePresent) {
			System.out.println("Employee is Present");
			System.out.println("Employee wage for day=" +WagePerHour*EmpHour);
		} else if (ispresent==employeePartTime) {
			System.out.println("Employee is doing Part time");
			System.out.println("Employee Partime wage=" +WagePerHour*ParttimeHour);
			
		}
		else {
			System.out.println("Employee is Absent");
			System.out.println("Employee Wage for day = 0");
		}
		

	}

}
