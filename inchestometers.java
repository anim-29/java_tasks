import java.util.Scanner;
public class inchestometers {
	public static void main(String[] Strings) {

        Scanner i = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double inch = i.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");

    }

}
