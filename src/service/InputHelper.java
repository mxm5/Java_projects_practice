package service;

import java.util.Scanner;

public class InputHelper {


    public static int selectActionNum(int max) {
        int selectedActionNum = -1;

        while (selectedActionNum<0)  {

            System.out.println("enter An action value number from above");

            try {
                Scanner scanner = new Scanner(System.in);
                selectedActionNum = scanner.nextInt();
                if(selectedActionNum> max) selectedActionNum = -1;
            } catch (Exception e) {
                System.out.println("only integer numbers !");
            }
        }
        return selectedActionNum;
    }
}
