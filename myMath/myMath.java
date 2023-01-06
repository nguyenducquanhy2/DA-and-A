package myMath;

public class myMath  {


    public static int pow(int number1, int number2) {
        if ((number2%2)==1){
            if (number2==1) return number1;
            int mid=number2/2;
            int reslut=pow(number1,mid);
            return reslut*reslut*number1;
        }else {
            if (number2==1) return number1;
            int mid=number2/2;
            int reslut=pow(number1,mid);
            return reslut*reslut;
        }
    }


    public static double pow(double number1, double number2) {
        if ((number2%2)==1.0){
            if (number2==1) return number1;
            double mid=number2/2;
            double reslut=pow(number1,mid);
            return reslut*reslut*number1;
        }else {
            if (number2==1) return number1;
            double mid=number2/2;
            double reslut=pow(number1,mid);
            return reslut*reslut;
        }
    }


    public static float pow(float number1, float number2) {
        if ((number2%2)==1.0){
            if (number2==1) return number1;
            float mid=number2/2;
            float reslut=pow(number1,mid);
            return reslut*reslut*number1;
        }else {
            if (number2==1) return number1;
            float mid=number2/2;
            float reslut=pow(number1,mid);
            return reslut*reslut;
        }
    }


    public static long  pow(long number1, long number2)  {
        if ((number2%2)==1){
            if (number2==1) return number1;
            long mid=number2/2;
            long reslut=pow(number1,mid);
            return reslut*reslut*number1;
        }else {
            if (number2==1) return number1;
            long mid=number2/2;
            long reslut=pow(number1,mid);
            return reslut*reslut;
        }
    }
}
