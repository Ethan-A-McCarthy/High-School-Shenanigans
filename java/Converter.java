/*Ethan McCarthy
Assignment J8
4/26/22
Comp sci 120*/
import java.io.*;
class Temp {
    public static double fahrenheit(double temp){
        return (9.0 / 5.0) * temp + 32;
    }
    
    public static double celsius(double temp){
        return (5.0 / 9.0) * (temp - 32);
    }
}

public class Converter {
    public static void main(String[] args) throws IOException {
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);
        String inData;
        int type;
        double temp;

        System.out.println("Thanks for using my tempurature converter.");
        System.out.println("Type 1 if you are converting celsius to fahrenheit.");
        System.out.println("Type 2 if you are converting fahrenheit to celsius.");
        System.out.println("Type another number to close program.");

        inData = stdin.readLine();
        type = Integer.parseInt(inData);

        if (type == 1){
            System.out.println("Input the temperature in celsius.");
            inData = stdin.readLine();
            temp = Integer.parseInt(inData);

            double f = Temp.fahrenheit(temp);
            System.out.println("The temperature in fahrenheit is: " + f);
        }

        else if (type == 2){
            System.out.println("Input the tempurature in fahrenheit.");
            inData = stdin.readLine();
            temp = Integer.parseInt(inData);

            double f = Temp.celsius(temp);
            System.out.println("The tempurature in celsius is: " + f);
        }

        else if (type > 2 || type < 1){
            System.exit(0);
        }
    }
}