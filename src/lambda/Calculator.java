package lambda;

import java.util.stream.IntStream;

public class Calculator {

    public static void main(String[] args){

        CalcTwo add = (val1, val2) -> val1 + val2;
        CalcTwo sub = (val1, val2) -> val1 - val2;
        CalcLog isOdd = (val) -> val % 2 != 0;
        CalcLog isPrime = (val) -> val > 1 && IntStream.range(2, val).noneMatch(i -> val%i==0);
        CalcOne factorial = (val) -> {
            int fac = 1;
            for(int i=2; i <= val; i++){
                fac *= i;
            }
            return fac;
        };

        System.out.println("--Test--");
        System.out.println( "Suma=> " + formatLambda(add, 2, 3) );
        System.out.println( "Resta=> " + formatLambda(sub, 2, 3) );
        System.out.println( "EsImpar=> " + formatLambda(isOdd, 3) );
        System.out.println( "EsPrimo=> " + formatLambda(isPrime, 1) );
        System.out.println( "Factorial=> " + formatLambda(factorial, 3) );

        /*
        CalcLog isPrime = (val) -> {
            for (int i = 2; i <= val / 2; ++i) {
                if (val % i == 0) {
                  return false;
                }
            }
            return true;
        };
        */
    }

    public static int formatLambda(CalcOne ld, int val){
        return ld.oneOperator(val);
    }

    public static int formatLambda(CalcTwo ld, int val1, int val2){
        return ld.twoOparators(val1, val2);
    }

    public static boolean formatLambda(CalcLog ld, int val){
        return ld.isOparator(val);
    }

    public int add(int val1, int val2) {
        CalcTwo add = (a, b) -> a + b;
        return formatLambda(add, val1, val2);
    }

    public int substract(int val1, int val2) {
        CalcTwo sub = (a, b) -> a - b;
        return formatLambda(sub, val1, val2);
    }

    public boolean isOdd(int val) {
        CalcLog isOdd = (n) -> n % 2 != 0;
        return formatLambda(isOdd, val);
    }

    public boolean isPrime(int val) {
        CalcLog isPrime = (n) -> n > 1 && IntStream.range(2, n).noneMatch(i -> n%i==0);
        return formatLambda(isPrime, val);
    }

    public int factorial(int val) {
        CalcOne factorial = (n) -> {
            int fac = 1;
            for(int i=2; i <= n; i++){
                fac *= i;
            }
            return fac;
        };
        return formatLambda(factorial, val);
    }
    
}

interface CalcOne {
    int oneOperator(int val);
}

interface CalcTwo {
    int twoOparators(int val1, int val2);
}

interface CalcLog {
    boolean isOparator(int val);
}

/*
interface Operations {
   public int add(int val1, int val2);
   public int substract(int val1, int val2);
   public boolean isOdd(int val);
   public boolean isPrime(int val);
   public int factorial(int val);
}
*/