package example.test.calculator;

public class Calculator {

    double output;

    public double addition(double n1, double n2) {
        output = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + output);
        return output;
    }

    public double substract(double n1, double n2) {
        output = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + output);
        return output;
    }

    public double multiply(double n1, double n2) {
        output = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + output);
        return output;
    }

    public double devide(double n1, double n2) {
        output = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + output);
        return output;
    }

    public double findFactorial(double num1) {

        return fact(num1);
    }

    private double fact(double number) {
        int i,fact = 1;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
        return fact;
    }
}
