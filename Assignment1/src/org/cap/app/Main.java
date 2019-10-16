package org.cap.app;
 class Date {

	int day;
	int month;
	int year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	

}
public class Main
{
	
public static void printDate(Date d)
{
 System.out.println(d);
}
public static void swapDates(Date d1,Date d2) 
{
   Date date = d1;
   d1=d2;
   d2=date;
    System.out.println(d1 +"          "+d2);
}
public static void main(String[] args) {
	
	Date d1=new Date(9,4,1996);
	Date d2=new Date(10,4,1996);
	
	printDate(d1);
	swapDates(d1, d2);
	
}





}
