package com.automation.Data;

import sun.tools.jstat.Jstat;

import java.util.Arrays;
import java.util.Stack;

public class TestNGDemo {

   /* @DataProvider(name = "UserCredentials")
    public Object[][] getData() {
        return new Object[][] {{"validUsername", "invalidPassword"}, {"InvalidUsername", "validPassword"}};
    }

    @Test(dataProvider = "UserCredentials")
    public void testMethod1(String username, String password) {
        usernameTxtField.sendKeys(username);
        passwordTxtField.sendKeys(password);
        loginButton.click();
        verifyLoginError();
    }

    public void verifyLoginError() {
        Assert.assertTrue(errorMsg.getText(), "Login Failed");
    }*/

    // swap the numbers

    public static void swap(int a, int b) {
        System.out.println("Before swap a = " + a + " and b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap a = " + a + " and b = " + b);
    }

    public static int reverseNumber(int n) {
        int reverse = 0;
        while (n > 0) {
            int mod = n % 10;
            reverse = reverse * 10 + mod;
            n /= 10;
        }
        System.out.println("After reverse n =" + reverse);
        return reverse;
    }

    public static long factorials(int n) {
        if (n < 0) {
            System.out.println("Negative number can not have factorials !!!");
            return -9999;
        }
        long fact = 1;
        for (int i = n; i > 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static long factWithRecursion(int n) {
        if (n < 0) {
            System.out.println("Negative number can not have factorials !!!");
            return -9999;
        }
        if (n <= 2) {
            return n;
        }
        return n * factWithRecursion(n - 1);
    }

    public static boolean isBalancedPara(String str) {

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            switch (str.charAt(i)) {
                case '[':
                case '(':
                case '{':
                    stack.push(str.charAt(i));
                    break;
                case '}':
                    if(stack.isEmpty() || !stack.pop().equals('{')) {
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || !stack.pop().equals('[')) {
                        return false;
                    }
                    break;
                case ')':
                    if(stack.isEmpty() || !stack.pop().equals('(')) {
                        return false;
                    }
                    break;
            }
        }
        return stack.empty();
    }

    public static boolean isPalindrom(String str) {
        int i=0;
        int j=str.length() - 1;
        while (i<j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isNumPalindrom(int n) {
        int reversed = reverseNumber(n);
        if(reversed == n) {
            return true;
        }
        return false;
    }

    public static int firstNonRepeatingChar(String str) {
        final int NO_OF_CHAR = 256;
        char count[] = new char[NO_OF_CHAR];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        int index=-1;

        for (int j = 0; j < str.length(); j++) {
            if (count[str.charAt(j)] == 1) {
                index = j;
                break;
            }
        }
        return index;
    }

    public static void getPrimeNumber(int args) {
    int flag;
        for(int i=1; i<=args; i++) {
            if( i==0 || i == 1) {
                continue;
            }

            flag =1;
            for(int j=2; j<=i/2; ++j) {
                if(args%j == 0) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                System.out.println("prime "+i);
            }
        }
    }


    public static void main(String[] args) {
        swap(4, 6);
        reverseNumber(123456);
        System.out.println(factorials(3));
        System.out.println(factWithRecursion(3));

        final String input = "{()}";
        System.out.println(isBalancedPara(input));
        System.out.println(isPalindrom("aabcaa"));

        System.out.println(isNumPalindrom(1127889211));

        int index = firstNonRepeatingChar("vaishavli");
        System.out.println(index==-1? "Either all char are unique or empty string" : "vaishali".charAt(index));


        getPrimeNumber(300);
    }
}
