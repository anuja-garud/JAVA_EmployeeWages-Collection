public class EmpWageBulidercmp{

	private String companyName;
	private  int empRate;
	private  int numofWorkingDays;
	private  int maxHrsInMonth;
	public int totalEmpWage;


	int totalWage = 0;
    	int totalEmpHrs =0;
    	int totalWorkingDays= 0;



	public EmpWageBulidercmp(final String companyName,final int empRate, final int numofWorkingDays, final int maxHrsInMonth)
	{
		this.companyName = companyName;  
		this.empRate= empRate;
		this.numofWorkingDays= numofWorkingDays;
		this.maxHrsInMonth= maxHrsInMonth;
	}

	public static void main(String[] args)
	{
		  final EmpWageBulidercmp Airtelcmp = new EmpWageBulidercmp("Airtel",20,20,100);
		  final int totalAirtelcmp=Airtelcmp.calDailyEmpwage();
		  System.out.println("Total Employee Wags of Airtel Company :" +totalWage); 

		  final EmpWageBulidercmp jiocmp = new EmpWageBulidercmp("jio",20,20,100);
		  final int totaljiocmp=jiocmp.calDailyEmpwage();
		  System.out.println("Total Employee Wags of jio Company :" +totalWage); 
		  

	}
    /**
    * Calculate Daily Empwage
    */

    public int  calDailyEmpwage()
    {
    	

    	while (totalEmpHrs < maxHrsInMonth  && totalWorkingDays < numofWorkingDays )
    	{
    		totalWorkingDays++;

    		final int empHrs = getEmpHrs();

    		totalEmpHrs=totalEmpHrs+empHrs; 
    		
    		final int empwage= empHrs * empRate;

    		totalWage=totalWage+empwage;

    		System.out.println("Employee Hrs :" +totalEmpHrs);
    		System.out.println("Employee Working Days :" +totalWorkingDays);
    		System.out.println("Employee wages :" +empwage);

    	}
    	return totalWage;
	        
	}

	public int getEmpHrs()
	{
		final int isFUllTime=1;

		final int isPartTime=2;
		int empHrs=0;

		final double randomvalue = Math.floor(Math.random()*10)%3;

		switch((int)randomvalue)
		{
			case isFUllTime:
				empHrs=8;
				//System.out.println("Emp for full time");
				//break;

			case isPartTime:
				empHrs=4;
				//System.out.println("Emp for Part time");
				//break;

		    default:
		    	empHrs=0;
		    	//System.out.println("Emp is Absent");
		    //break;
		}
		return int empHrs;
	}
}


