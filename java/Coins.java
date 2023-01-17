import java.io.*;
class Coins{
    public static void main(String[] args) throws IOException{
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);
        int number, number2, number3, number4, number5, number6;
        int toonies, loonies, quarters, dimes, nickels, pennies;

        String inData;
        System.out.println("Enter a number of cents:");
        inData = stdin.readLine();
        number = Integer.parseInt(inData);

        number2 = number % 200;
        toonies = number / 200;
        number3 = number2 % 100;
        loonies = number2 / 100;
        number4 = number3 % 25;
        quarters = number3 / 25;
        number5 = number4 % 10;
        dimes = number4 / 10;
        number6 = number5 % 5;
        nickels = number5 / 5;
        pennies = number6 / 1;


        System.out.println("Toonies: " + toonies);
        System.out.println("Loonies: " + loonies);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}