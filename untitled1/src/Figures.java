import java.text.DecimalFormat;
import java.util.*;

public class Figures {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String b = String.valueOf(input.nextLine());
        String [] c = calculate(b);
        System.out.println("Square of figure is " + c[0] + ", length of its side(s) is " + c[1]);
    }
    public static String[] calculate(String a) {
        DecimalFormat df = new DecimalFormat("0.00");
        String [] array = a.split(" ");
        String fig = null;
        double measure = 0;
        if (array.length > 1) {
            fig = array[0];
            measure = Double.parseDouble(array[1]);
        } else if (array.length <= 1){
            fig = array[0];
            measure = 1;
        }
        System.out.println(fig + " and " + df.format(measure));
        double s = 0.00;
        double l = 0.00;

        if (fig.equals("круг")) {
            s = Math.PI * (measure*measure);
            l = 2 * (Math.PI * measure);
        } else if (fig.equals("квадрат")) {
            s = measure*measure;
            l = measure*2;
        }
        System.out.print(s);
        System.out.print("\n");
        System.out.println(l);
        String [] results = new String [2];
        results [0] = String.valueOf(df.format(s));
        results [1] = String.valueOf(df.format(l));
        return results;
    }
}
