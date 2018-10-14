import java.util.InputMismatchException;
import java.util.Scanner;

/*
Author: Akansh Karthik Nair
Student ID: 1895271
Group Number: MAD312
Class Activity Program 2
*/

public class OnlineMusicAppStore {

    public static void main(String[] args) {

        int amt;
        Scanner getAmt = new Scanner(System.in);

        try {
            System.out.print("How much money do you wish to prepay? ");

            amt = getAmt.nextInt();
            if (amt >= 0) {
                int appsPurchasable = amt / 3;
                int balance = amt % 3;

                System.out.println("With this amount, you will be able to purchase " + appsPurchasable + " app(s). You will then have " + balance + "$ left as credit on your account.");
                int songsDownloadable = amt / 7;
                int appsDownloadable = (amt - (songsDownloadable * 7)) / 3;
                balance = amt - ((songsDownloadable * 7) + (appsDownloadable * 3));

                System.out.println("Alternatively, for this amount, you will be able to purchase " + songsDownloadable + " song(s) and " + appsDownloadable + " app(s). You will then have " + balance + "$ left as credit on your account.");
                System.out.println("Thanks for Shopping at Best Music Store!");
            } else {
                System.out.println("Please enter a valid amount!!");
            }

                getAmt.close();

            System.out.println("Please enter a valid integer!!");
        } catch (Exception ex) {
            if (ex instanceof InputMismatchException)
                System.out.println("Please enter a valid integer!!");
            else
                System.out.println("Some problem occurred. Please try again later...");
        }
    }

}