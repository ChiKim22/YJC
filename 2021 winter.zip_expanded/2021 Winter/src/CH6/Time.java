package CH6;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second); 
		//"%02d:%02d:%02d" => 00:01:02 식으로 표현
	}

	public Time(int hour, int minute, int second) {
		
		//3항 연산자
		this.hour = (hour >=00 && hour<24)?hour:0;
		
		//0~23
//		if(hour >=00 && hour<24)
//		this.hour = hour;
//		else
//			this.hour=0;
		
		//0~59
//		if(minute >=00 && minute<60)
//		this.minute = minute;
//		else
//			this.minute=0;
		
		//3항 연산자
		this.minute = (minute >=00 && minute<60)?minute:0;
		
		
		//0~59
//		if(second >=00 && second<60)
//		this.second = second;
//		else
//			this.second=0;
		
		//3항 연산자
		this.second = (second >=00 && second<60)?second:0;
		
	}
	public Time() {
		this(0,0,0);
	}
	
	
}
