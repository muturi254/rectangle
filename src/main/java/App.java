import models.Rectangle;

import java.io.BufferedReader;
//import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        //Console myConsole = System.console();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length (or Height) of your rectangle: ");
        String stringLength = bufferedReader.readLine(); // get input length from user as string myConsole.readLine()
        int intLength = Integer.parseInt(stringLength); // convert user input to int

        System.out.println("Enter the width  of your rectangle: ");
        String stringWidth = bufferedReader.readLine(); // get input  width from user as string
        int intWidth = Integer.parseInt(stringWidth); // convert user input to int

        // create rectangle frm input
        Rectangle rectangle = new Rectangle(2, intWidth);

        // check if rectangle is square
        boolean squareResult = rectangle.isSquare();
        System.out.println("Is your rectangle a square too?" + squareResult + "!!");

    }
}
