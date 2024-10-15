public class Aufgabe3 {
    public void sum(int[] n1, int[] n2) {
        int number = 0;
        int next = 0;
        int p = 1;
        int len = 0;
        for (int i = n1.length -1; i >= 0; i--) {
            len ++;
            int sum = n1[i] + n2[i] + next;
            if( sum >=10 )
                next = sum/10 % 10;
            number += (sum%10) * p;
            p = p * 10;

        }
        if (next != 0) {
            len ++;
            number += next * p;
        }

        int[] numbers = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            numbers[i] = number%10;
            number /= 10;
        }
        for (int i = 0; i < len; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    public void diff(int[] n1, int[] n2) {
        int number = 0;
        int borrow = 0;
        int len = 0;
        int p = 1;
        for (int i = n1.length -1; i >= 0; i--) {
            len ++;
            int dif = n1[i] - n2[i] - borrow;
            if ( dif < 0 )
            {
                dif = n1[i] * 10 - n2[i];
                borrow = 1;
            }
            number += dif * p;
            p = p * 10;

        }
        int[] numbers = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            numbers[i] = number%10;
            number /= 10;
        }
        for (int i = 0; i < len; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    public void mul(int[] n1, int a) {
        int number = 0;
        int next = 0;
        int p = 1;
        int len = 0;
        for (int i = n1.length -1; i >= 0; i--) {
            len ++;
            int mul = n1[i] * a;
            if ( mul >= 10)
                next = mul/10 % 10;
            number += (mul%10) * p;
            p = p * 10;
        }
        if (next != 0) {
            len ++;
            number += next * p;
        }
        int[] numbers = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            numbers[i] = number%10;
            number /= 10;

        }
        for (int i = 0; i < len; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    public void div(int[] n1, int a){
        if (a == 0) {
            System.out.println("not allowed.");
            return;
        }
        int[] number = new int[n1.length+1];
        int div = 0;
        int index = 0;
        for (int i = 0; i < n1.length; i++) {
            div = div * 10 + n1[i];
            number[index] = div / a;
            div = div % a;
            index++;
        }
        boolean is_null = true;
        for (int i = 0; i < n1.length; i++) {
            if(number[i] != 0)is_null = false;
            if(!is_null)
            System.out.print(number[i] + " ");
        }
    }
}
