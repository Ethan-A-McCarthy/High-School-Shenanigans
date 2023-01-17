import java.io.*;
class TirePressure{
    public static void main(String[] args) throws IOException{
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);
        double frontL, frontR, backL, backR;
        String inData;

        System.out.println("Enter front left tire pressure:");
        inData = stdin.readLine();
        frontL = Double.parseDouble(inData);

        System.out.println("Enter front right tire pressure:");
        inData = stdin.readLine();
        frontR = Double.parseDouble(inData);

        System.out.println("Enter back left tire pressure:");
        inData = stdin.readLine();
        backL = Double.parseDouble(inData);

        System.out.println("Enter back right tire pressure:");
        inData = stdin.readLine();
        backR = Double.parseDouble(inData);

        if(frontL == frontR){
            System.out.println("Front tire pressures are the same.");
        }
        else{
            System.out.println("Tire inflation is not the same: Front");
        }
        if(backL == backR){
            System.out.println("Back tire pressures are the same.");
        }
        else{
            System.out.println("Tire pressure is not the same: Back");
        }

        }
    }