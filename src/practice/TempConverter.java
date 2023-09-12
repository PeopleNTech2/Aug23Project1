package practice;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        int answer;
        int tempToConvert;
        int tempConverted = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------welcome-----------------------");
        System.out.println("temp converter");

        do {
            System.out.println("choose the conversion mode:");
            System.out.println("1- °C to °F");
            System.out.println("2- °F to °C");
            answer = sc.nextInt();
            while (answer != 1 && answer != 2){
                System.out.println("wrong answer, please enter 1 or 2");
                answer = sc.nextInt();
            }

            if (answer == 1){
                System.out.println("enter the temp to convert in °C");
                tempToConvert = sc.nextInt();
                tempConverted = (tempToConvert * 9/5) + 32;
                System.out.println(tempToConvert+" °C = "+tempConverted+" °F");
            } else {
                System.out.println("enter the temp to convert in °F");
                tempToConvert =  sc.nextInt();
                tempConverted = (tempToConvert - 32) * 5/9;
                System.out.println(tempToConvert+" °F = "+tempConverted+" °C");
            }
            System.out.println("do you want to convert another temp?");
            System.out.println("yes/no (1- yes /2- no)");
            answer = sc.nextInt();
            while (answer != 1 && answer != 2){
                System.out.println("wrong answer, please enter 1 or 2");
                answer = sc.nextInt();
            }

        }while (answer == 1);
        System.out.println("goodbye, see you soon");
    }
}
