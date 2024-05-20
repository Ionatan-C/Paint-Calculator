/*==========================================
; Title:  Paint Calculator
; Author: Ionatan Cegodari
==========================================*/

import java.util.Scanner;

public class Measurements {

    public Measurements(){//constructor of the class

    }

    public void Area (float length, float width){ //method to calculate the area

        float area;

        area = length * width;// calculates the area and assigns it to the area variable

        System.out.println("The area of the floor is " + area + " in m2 (square meters)");//prints out the area
    }

    public void Volume (float length, float width, float height){//method to calculate the volume

        float volume;

        volume = length * width * height;//maths to calculate volume

        System.out.println("The volume of the room is " + volume + " in m3 (cubic meter)");//prints out the volume
    }

    public void paintAmount (float length, float width){//method to calculate the amount of paint needed

        float paintRequired;

        paintRequired = length * width;//calculations for one coat of paint
        float oneCoat = paintRequired;//assigns it to the first coat

        float twoCoats = paintRequired * 2;//calculations for 2 coats and assigns it to the two coats variable

        System.out.println("The amount of paint that is going to be needed is " + twoCoats + " square meters in total for 2 coats and it's only " + oneCoat + " in sqare meters.");
        //prints out the amount of paint needed
    }

}
