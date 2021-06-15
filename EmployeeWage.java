
public class EmpwageBuilderUC2
{
  public static final int IS_PART_TIME=1;
  public static final int IS_FULL_TIME=2;
  public static final int EMP_RATE_PER_HOUR=20;
  public static final int NUM_OF_WORKING_DAY=2;
  public static final int MAX_HRS_IN_WORKING=10;
  public static void main(String args[])
  {
     int empHrs=0;
     int totalEmpHrs=0;
     int totalWorkingDays=0;
  while(totalEmpHrs<=NUM_OF_WORKING_DAY)
   {
     totalWorkingDays++;
  int empcheck=(int)Math.floor(Math.random()*10)%3;
   switch(empcheck)
    {
      case IS_PART_TIME:
        empHrs=4;
        break;
      case IS_FULL_TIME: 
        empHrs=8;
        break;
      default:
          empHrs=0;
    }
   totalEmpHrs+=empHrs;
   System.out.println("Days" +totalWorkingDays+"EmpHrs"+empHrs);
  }
  int totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
  System.out.println("total emp wage" +totalEmpWage);
  }
 }


