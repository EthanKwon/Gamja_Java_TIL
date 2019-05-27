package timetoleave;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeToLeave {
	public static void main(String[] args) {
	
		LocalTime currTime = LocalTime.now();
		LocalTime TimeToLeave = LocalTime.of(18,30,0,0);
		
		DecimalFormat df = new DecimalFormat("00");
		
		System.out.println("현재 시간 : " + df.format(currTime.getHour()) + ":" + df.format(currTime.getMinute()) 
							+ ":" + df.format(currTime.getSecond()));
		System.out.println("퇴근 시간 : " + df.format(TimeToLeave.getHour()) + ":" + df.format(TimeToLeave.getMinute()) 
							+ ":" + df.format(TimeToLeave.getSecond()));

		long reTime = ChronoUnit.SECONDS.between(currTime, TimeToLeave);
		
		LocalTime remindTime = LocalTime.of((int)reTime/3600,(int)(reTime%3600)/60,(int)reTime%60);
		
		System.out.println("--------------------------");
		System.out.println("남은 시간 : " + remindTime );
		
	}

}
