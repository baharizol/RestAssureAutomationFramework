package com.automation.listeners;

import java.util.Scanner;

public class TestNGGG {

    /*125
            1 * 2 * 5 = 10
    ans should be 10 right ?*/
    public static void main(String[] args) {
  /*      Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 1;

        while(n>1) {
           int lastDigit = n % 10;
           result *= lastDigit;
           n = n/10;
        }
        System.out.println(result);*/

        int i =0;
        int sum = 0;

        while(i<100) {
            sum = sum + i;
//            sum = i+ sum;
            i+=1;
        }

        for(int m=0; m<6; m++) {
            System.out.println(printTribRec(i) + " ");
        }
    }

    static int fun(int a, int b) {
        if(b ==0) {
            return a;
        } else {
            return fun(a, a%b);
        }
    }

    static int fib(int n) {
        if(n<=1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    static int printTribRec(int n) {
if( n== 0 || n == 1 || n== 2) {
    return 0;
}
if( n== 3) {
    return 1;
} else
{
    return printTribRec(n-1) + printTribRec(n-2) + printTribRec(n-3);
}
    }

}
