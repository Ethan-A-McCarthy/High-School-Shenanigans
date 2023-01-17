/*Ethan McCarthy
Assignment J7
Comp Sci 120
4/6/22
*/
import java.io.*;
class PrimeNumber {
    public static void main(String[] args) throws IOException{
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);
        String inData;
        int num, count;
        boolean prime = false;

        System.out.println("Input an integer:");
        inData = stdin.readLine();
        num = Integer.parseInt(inData);

        for(count = 2; count <= num / 2; ++count){
            if (num % count == 0) {
                prime = true;
                break;
            }
        }

        if(prime == true){
            System.out.println(num + " is not a prime number.");
        }
        else{
            System.out.println(num + " is a prime number.");
        }
    }
}
