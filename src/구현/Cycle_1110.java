package 구현;

import java.util.Scanner;

public class Cycle_1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 0 || num > 99) {
            System.out.println("다시 입력하시오 ");
            num = scanner.nextInt();
        }
        int a = num / 10;
        int b = num % 10;
        int c = (a + b) % 10;
        int count = 1;
        String newNum = Integer.toString(b) + Integer.toString(c);
        while(!(num == Integer.parseInt(newNum))){
            int num1 = Integer.parseInt(newNum);
            int x = num1 / 10;

            int y = num1 % 10;
            int z = (x + y) % 10;
            newNum = Integer.toString(y) + Integer.toString(z);
            count +=1;
        }
        System.out.println(count);
    }
}

