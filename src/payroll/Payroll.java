package payroll;

//adding scanner input function
import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		
		//variable declaration
		int employee_no,days_worked,pay_rate;
		String employeeNm,designate,gen_date;
		
		
		System.out.print("Enter employee name: ");
		employeeNm=inp.nextLine();
		System.out.print("Enter designation: ");
		designate=inp.nextLine();
		System.out.print("Enter generation date: ");
		gen_date=inp.nextLine();
		System.out.print("Enter employee number: ");
		employee_no=inp.nextInt();
		System.out.print("Enter days worked: ");
		days_worked=inp.nextInt();
		System.out.print("Enter pay rate: ");
		pay_rate=inp.nextInt();
		System.out.print("\n");
		int basic_pay=(pay_rate*days_worked);
		int pf=(basic_pay/10);
		final int profitax=(int)(0.02*basic_pay);
		int deduct = (pf+profitax);
		int net_pay= (basic_pay-deduct);
		//output
		System.out.println("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP : "+employee_no);
		System.out.print("\n");
		System.out.println("                           SHREE KRISHNA CHEMISTS AND DRUGGIST");
		System.out.println("                                   SALARY MONTH 9 2013");
		System.out.print("\n");
		System.out.println("EMP.NO.: "+employee_no+"                        EMP.NAME: "+employeeNm+"               DESIGNATION: "+designate);
		System.out.println("DAYS WORKED: "+days_worked+"                   PAY RATE: "+pay_rate+"                  GEN.DATE:"+gen_date);
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("EARNINGS                 AMOUNT(RS.)                  DEDUCTIONS              AMOUNT(RS.)");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("BASIC PAY                "+basic_pay+"                        P.F.                    "+pf);
		System.out.println("                                                      PROF.TAX                "+profitax);
		System.out.print("\n");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("GROSS EARN.              "+basic_pay+"                        TOTAL DEDUCT.           "+(pf+profitax));
		System.out.println("                                                      NET PAY                 "+net_pay);
		System.out.println("-----------------------------------------------------------------------------------------------");



		
	}

}
