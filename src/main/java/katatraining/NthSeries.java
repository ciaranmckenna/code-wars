package katatraining;

public class NthSeries {

    public static void main(String[] args) {

        System.out.println(seriesSum(5));
    }

    public static String seriesSum(int n) {

        //best practise
        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += 1.0 / (1 + 3 * i);

        return String.format("%.2f", sum);

        /*
        my attempt
        double counter = 1;
        double divisor = 1;
        double decTemp;
        double decVal = 0;
        double answer;

        if (n == 0){
            answer = 0.00;
            return String.format("%.2f", answer);
        }
        if (n == 1){
            answer = 1.00;
            return String.format("%.2f", answer);
        }
        for (double i = 1; i <=n-1 ; i++) {
            divisor +=3;
            decTemp = (1 / divisor);
            decVal += decTemp;
        }

        return String.format("%.2f", decVal + counter);*/
    }

}
