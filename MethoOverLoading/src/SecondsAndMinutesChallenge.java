public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
       // getDurationString(4);
        System.out.println(getDurationString(4,78)+getDurationString(6));

    }
    public static String getDurationString(int seconds) {
if(seconds>0){
    return seconds + "s";
}
return "Invalid";
    }
    public static String getDurationString(int minutes, int seconds) {
        if(minutes>=0 &&(seconds>=0&&seconds<=59)){
            minutes = minutes * 60;

        }
        return "";
    }
}

