package practice;

import java.util.HashMap;
import java.util.Map;

public class Enums {
	
	public enum WEEKDAYS{
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY;
		
		WEEKDAYS(){
			
		}
		public int dayOfTheWeek(WEEKDAYS day){
			if(day.equals(WEEKDAYS.MONDAY)){
				return 2;
			}
			return 0;
		}
	};
	
	public enum months{
		JANUARY(1),
		FEBRUARY(2);
		private static final Map<Integer,months> mappings = new HashMap<Integer,months>();
		static {
			int i=1;
			for(months m: months.values())
				mappings.put(i++, m);
		}
		months(int i){
			
		}
		
	}
	public static void main(String args[]){
		
		WEEKDAYS day;
		day = WEEKDAYS.MONDAY;
		//months m(1);
		
		System.out.println(months.mappings);
		switch(day){
		
			case MONDAY:
				System.out.println("Today is Monday");
				System.out.println("Day of the week is "+ day.dayOfTheWeek(day));
				break;
			default:
				System.out.println(" Not sure what day is today");
		
		}
		
		
	}

}
