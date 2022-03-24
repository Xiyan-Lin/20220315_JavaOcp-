
package day04;

import java.util.Arrays;

public class MultiArrayDemo4 {
    public static void main(String[] args) {
        double[][] values = {
            {170.0, 60},
            {180.0, 75},
            {160.0, 55}
        };
        // 請求出三組BMI
        
        double[] BmiArray = new double[values.length];
        for(int i=0; i < values.length; i++){
            double h = values[i][0];
            double w = values[i][1];
            double bmi = getBMI(w, h);
            BmiArray[i] = bmi;
            
        }
        Arrays.sort(BmiArray);
        System.out.println(Arrays.toString(BmiArray));
        
    }
    public static double getBMI(double w, double h){
        double bmi = w/ Math.pow(h/100, 2);
        return bmi;
    }
}
