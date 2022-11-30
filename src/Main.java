import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Measurements measurements = new Measurements(); //this calls the measurements class

        Scanner myObj = new Scanner(System.in); //this scans the users input
        System.out.println("Please enter the length, width and height of the room in meters.");//prints out the question for the user

        float length = myObj.nextFloat();//this assigns the users scanned input to the variable
        float width = myObj.nextFloat();
        float height = myObj.nextFloat();

        measurements.Area(length, width);//this calls the area calculation method from measurements class

        measurements.Volume(length,width,height);//this calls the volume method

        measurements.paintAmount(length, width);//this calls the paintAmound method


        System.out.println("Thank you for using the calculator");

    }

}