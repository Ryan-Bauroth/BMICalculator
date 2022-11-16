import java.text.DecimalFormat;
import java.util.Scanner;

//https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/ Hippity hoppity, your code is now my property

public class BMICalculator {
    /** Uses a Scanner to prompt the user for info, process the
     * feet/inches conversion, calls the computeBMI method and prints the * correct information.
     * @param args as needed
     **/
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userIn;
        int inches, pounds;
        while(true){
            try {
                System.out.print("Enter your height in feet and inches (Ex 6'1\") or 0 to quit: ");
                userIn = in.nextLine();
                if(userIn.equals("0"))
                    break;
                inches = Integer.parseInt(userIn.substring(0, userIn.indexOf("'"))) * 12 + Integer.parseInt(userIn.substring(userIn.indexOf("'") + 1, userIn.indexOf("\"")));
                System.out.print("Enter your weight in pounds: ");
                pounds = Integer.parseInt(in.nextLine());
                System.out.println("Your BMI, expressed as weight(kg)/height(m)^2: " + df.format(computeBMI(inches, pounds)) + " kg/m^2");
            }
            catch(Exception e){
                System.out.println("Looks like something went wrong! See below: ");
                System.out.println(e.toString());
            }
        }
    }
    /**
     *Convert English to metric units, perform the BMI calculation.
     * NOTE: this method must properly handle bad data
     * @param inches user's height in inches
     * @param pounds user's weight in pounds
     * @return User's BMI (weight(kg)/height(m)^2) a double
     */
    public static double computeBMI(int inches, int pounds){
        if(inches > 0 && pounds > 0){
            double kgs, meters;
            meters = inches * 0.0254;
            kgs = pounds * 0.454;
            return kgs/(meters * meters);
        }
        else
            return 0.;
    }
}
