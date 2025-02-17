import java.util.Scanner;

public class Valentine {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int year;
        int valentineYear;

        System.out.print("What year is it?: ");
        year = scnr.nextInt();

        valentineYear = year - 2022;

        System.out.print("Isaiah has been Paige's valentine " + valentineYear + " years in a row :)");

        scnr.close();
    
    }
}