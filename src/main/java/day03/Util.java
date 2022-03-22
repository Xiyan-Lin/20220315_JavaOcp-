
package day03;

// 工具類別 (大家都可以使用)
public class Util {
    // 計算 CV 的方法
    public static double getCV(double [] values){
        double sd = getSD(values);
        double avg = getAvg(values);
        double cv = sd/avg;
        return cv;
    }
    
    
    // 計算 SD 的方法 (公式:s=sqrt(((x1-x)^2 +(x2-x)^2 +......(xn-x)^2)/n) )
    public static double getSD(double [] values){
        double avg = getAvg(values);
        int sum = 0;
        for(double value : values){
            sum += Math.pow(value-avg, 2);
        }
       double sd =  Math.sqrt(sum / values.length); //開根號
       return sd;
    }
    
    // 計算平均方法
    public static double getAvg(double[] values){
        double sum = getSum(values);
        double avg = sum / values.length;
        return avg;
    }
    
    // 計算總和的方法
    public static double getSum(double [] values){
        double sum = 0;
        for(double value : values){
            sum += value;
        }
        return sum;
}
}
