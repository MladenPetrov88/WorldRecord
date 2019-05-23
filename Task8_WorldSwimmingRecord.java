import java.util.Scanner;

public class Task8_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Seconds = Double.parseDouble(scanner.nextLine());
        double Metres = Double.parseDouble(scanner.nextLine());
        double secondsPer1m = Double.parseDouble(scanner.nextLine());
        double timedSlowDown = Math.floor(Metres / 15);
        double time = Metres * secondsPer1m;
        double sloweddTime = timedSlowDown * 12.5;
        time += sloweddTime;
        if (time < Seconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", time - Seconds);
        }


    }
}
