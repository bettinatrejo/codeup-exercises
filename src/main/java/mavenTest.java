import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;



public class mavenTest {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        System.out.println("Enter your three favorite colors: ");
        String input = src.nextLine();

        if (StringUtils.isNumeric(input)) {
            System.out.println(input + "is a number.");
        } else {
            System.out.println("'" + input + "' " + "is not a number");
        }

        System.out.println("Flipped Case: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));

    }

}
