import java.util.Random;
import java.time.LocalDateTime;

public class Main {

  public static void main (String[] args){
    int dogNum = 3;
    System.out.println("There are " + dogNum + " " + pluralize("dog", dogNum) + ".");

    flipNheads(5);

    clock();
  }

  // add an 's' to the end of a word if the amount argument is 0 or greater than 1
  public static String pluralize (String word, int amount){
    if (amount == 0 || amount >= 1){
      return word + "s";
    }
    return word;
  }

  // Tracks how many attemps total it takes to flip a virtual coin num times on its head in a row
  public static void flipNheads(int num){
    Random rand = new Random();
    int total = 0;
    int sequence = 0;
    while (sequence <= num){
      if (rand.nextDouble() >= 0.5){
        sequence++;
      } else {
        sequence = 0;
      }
      total++;
    }
    System.out.println("It took " + total + " tries to flip " + num + " heads in a row.");
  }

  // prints the time to the console every second a well as how many cyycle the while loop goes through - Has to be exited manually
  public static void clock(){
    int hertz = 0;
    while (true){
      LocalDateTime now = LocalDateTime.now();
      if (now.getNano() % 1_000_000_000 == 0){
        int hour = now.getHour() % 12;
        int minute = now.getMinute();
        int second = now.getSecond();

        String hourString = padZeros(hour);
        String minuteString = padZeros(minute);
        String secondString = padZeros(second);

        double megaHertz = hertz / 1_000_000d;

        System.out.println(hourString + ":" + minuteString + ":" + secondString + " - " + megaHertz + " MHz");
        hertz = 0;
      }
      hertz++;
    }
  }
  
  // helper function to assist with the proper formatting of time integers
  private static String padZeros(int time){
    String corrected = Integer.toString(time);
    if (time < 10){
      corrected = "0" + corrected;
    }
    return corrected;
  }
}