package interviewexcercises;

/**
 * Your goal is to write a method that, given a date, returns the first day of the next calendar quarter for that date.  For instance, if we were to pass in 2/10/2000 to the method, it would return 4/1/2000 -- the first day of the next calendar quarter.

 The calendar quarters start on January 1st, April 1st, July 1st, and October 1st.

 Your java method takes an instance of our class SimpleDate (see below) and returns the first day of the next calendar quarter as a SimpleDate.  We are not testing your knowledge of java.util.Date or the Calendar API, which is why we created the SimpleDate as a simple data structure to track our date information.

 Here is our SimpleDate class:

 /**
 Simple data structure representing a Date
 */
/*

class SimpleDate {
	protected int year = 0;
	protected int month = 0;
	protected int day = 0;

	public SimpleDate (int year, int month, int day) {}
	public void setDate (int year, int month, int day) {}
	public void setYear (int year) {}
	public int getYear () {}
	public void setMonth (int month) {}
	public int getMonth () {}
	public void setDay (int day) {...}
	public int getDay () {...}
}


	//The method you implement should have the signature:

//public static SimpleDate getFirstDayOfNextQuarter (SimpleDate date).
 */

public class FirstDayOfNextQuarter {


//	public static SimpleDate getFirstDayOfNextQuarter (SimpleDate date){
//
//		if(date == null){
//			return new SimpleDate(2017,1,1);   // If the given object is null, simply return first day of the current year. Constructor takes in year,month,day
//		}
//		int month = date.getMonth();
//		//Make sure month is a valid number between 1 and 12
//
//		if(month > 0 && month <13){
//
//			if( month >=1 && month<=3){
//				// just get year from the given date and then have the month of the next quarter and the first day
//				return new simpleDate(date.getYear(),4,1);
//			}else if(month>=4 && month<=6){
//				// july first quarter
//				return new SimpleDate(date.getYear(),7,1);
//			}else if(month>=6 && month<=9){
//				return new SimpleDate(date.getYear(),10,1);
//			}else if(month>=9 && month<=12){
//				//if the month is in the last quarter, change the year to next year and then the first day of january
//				return new SimpleDate(date.getYear()+1,1,1);
//			}
//		}
//	}else{
//		//if the month is not a valid month, simply return the first day of the year
//		return new SimpleDate(2017,1,1);
//	}
//}

}
