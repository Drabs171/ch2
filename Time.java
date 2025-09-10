public class Time {
    public static void main(String[] args) {
        int startHour = 13;   
        int startMinute = 0;
        int startSecond = 0;
        int hour = 15;      
        int minute = 45;
        int second = 20;

        int secondsSinceMidnight = hour * 3600 + minute * 60 + second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);
        
        int secondsInDay = 24 * 3600;
        int secondsRemaining = secondsInDay - secondsSinceMidnight;
        System.out.println("Seconds remaining in the day: " + secondsRemaining);
        
        double percentDayPassed = (secondsSinceMidnight / 86400.0) * 100;
        System.out.println("Percentage of the day passed: " + percentDayPassed + "%");

        int startInSeconds = startHour * 3600 + startMinute * 60 + startSecond;
        int currentInSeconds = hour * 3600 + minute * 60 + second;
        int elapsed = currentInSeconds - startInSeconds;
        System.out.println("Elapsed time since starting: " + elapsed + " seconds");
    }
}
