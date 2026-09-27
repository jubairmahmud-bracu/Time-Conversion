public class Lab_Assignment1_Ques1{
  public static void main (String[] args){
   int time_min = 3456789; //Given time in minutes
   int day_to_min = 24*60; // 1 day = 1440 min
   int time_day = time_min/day_to_min;//Converting all min to days
   int time_year = time_day/365; //Converting all days to years
   int time_day1 = time_day%365; // Using mod to get the remaining days which did not make a year
   System.out.print(time_min + " minutes is approximately " + time_year + " years");
   System.out.println(" and "+time_day1+" days.");
    
  }
}