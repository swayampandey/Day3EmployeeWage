
public class Hours100day20Condition {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage");
		// TODO Auto-generated method stub
		int employeePresent=1;
		int employeePartTime=2;
		int WagePerHour=20;
		int EmpHour=8;
		int totalWorking=5;
		int PartTimeHour=4;
		int WorkingdayinMonth=20;
		int MaximumHoursinMonth=100;
		int ispresent= (int) (Math.floor(Math.random()*10)%3);
		while(totalWorking <= MaximumHoursinMonth &&  totalWorking< WorkingdayinMonth) {
			totalWorking++;
			switch (ispresent) {
			case 0:
			System.out.println("Employee is Present");
			System.out.println("Employee Wage=" +WagePerHour*EmpHour*WorkingdayinMonth);
			break;
			case 1:
			System.out.println("Employee is doing part time");
			System.out.println("Employee wage=" +WagePerHour*PartTimeHour*WorkingdayinMonth);
			break;
			default:
				System.out.println("Employee is Absent");
				System.out.println("Employee Wage = 0");
			
			
			}
			
		} 
		
		
		

	}

}
