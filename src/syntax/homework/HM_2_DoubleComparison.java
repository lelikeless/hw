package syntax.homework;

public class HM_2_DoubleComparison {
    public static void main(String[] args) {
        /*
    Create a Java program and name it Double Comparison.
    Declare 2 double values and if value of first variable is higherthen the second,
    print “Double value is larger than.” Otherwise print
        */
        double num1=666.6;
        double num2=777.7;

        if (num1>num2){
            System.out.println("Double value "+num1+" is larger than "+num2);
        }else{
            System.out.println("Double value "+num1+" is smaller than "+num2);
        }
    }
}
