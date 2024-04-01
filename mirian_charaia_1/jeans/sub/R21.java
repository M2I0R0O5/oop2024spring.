package quizes.q2.mirian_charaia_1.jeans.sub;

import quizes.q2.mirian_charaia_1.jeans.A21;
import quizes.q2.mirian_charaia_1.piano.A22;

public class R21 {
    public static void main(String[] args) {
        // Calculate and print the area of the rectangle
        int area = A21.length * A21.width;
        System.out.println("Area of rectangle: " + area);

        // Determine and print the name of the month
        String monthName;
        switch (A22.monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            // Add more cases for other months as needed
            default:
                monthName = "Invalid month";
        }
        System.out.println("Month: " + monthName);
    }
}
