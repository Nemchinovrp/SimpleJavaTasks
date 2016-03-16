public class AngleBetweenArrows {


    public static int angle(int hour, int minute) {
        int degreeHour = (360 / 12) * hour;
        int degreeMinute = (360 / 60) * minute;

        return Math.abs(degreeHour - degreeMinute);
    }
}
