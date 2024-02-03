import java.util.Scanner;

public class TempCalc {
    public static void main(String[] args) {
        System.out.println("Enter the celcies you want to convert to farenheight");
        Scanner Sc = new Scanner(System.in);
        float inp = Sc.nextFloat();
        float far = ( 9/5 * inp) + 32;
        System.out.printf("The convested celcius : "+inp+" Converted to farenight is : "+far);
    }
}
