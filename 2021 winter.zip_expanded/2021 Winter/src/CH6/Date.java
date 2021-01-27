package CH6;

public class Date {
	
	private int year;
	private int month;
	private int day;
	
	
	public Date(int year, int month, int day) {
		
		//유효한 값인지 체크.. 유효한 값인 경우에 한해, 설정...
		//유효한 값이 아니면, 1900/01/01
		this.year = year;
		this.month = month;
		this.day = day;
	}


	@Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
	public Date() {
		this(1900, 1, 1);
	}
	
	public Date(int year) {
		//this.year = year;
		this(year, 1, 1);
	}
	
	

}
