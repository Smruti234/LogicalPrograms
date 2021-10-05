package LogicalPrograms;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class SimulateStopwatch {
	public static void main(String[] args) {
		LocalTime StartTime = LocalTime.of(1, 24, 40);
		LocalTime StopTime = LocalTime.of(10, 34,36 );
		long hours = ChronoUnit.HOURS.between(StartTime, StopTime);
		long minutes = ChronoUnit.MINUTES.between(StartTime, StopTime);
		long seconds = ChronoUnit.SECONDS.between(StartTime, StopTime);
		System.out.println("Difference is " + hours + " hours " + (minutes % 60) + " minutes " + (seconds % 60) + " seconds.");
	}
}


