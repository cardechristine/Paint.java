import java.util.Scanner;

//Christine Carde
//IT -145
//SNHU

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        do {
            System.out.println("Enter wall height (feet): ");
            try {
                wallHeight = scnr.nextDouble();
                if (wallHeight <= 0.0) {   //shows invalid if input is less than or equal to 0
                    System.out.println("Invalid input. Height must be a number greater than zero.\n");
                }
            } catch (Exception e) { //accounts for strings and any input that is not an integer or double
                System.out.println("Invalid input. Height must be a number greater than zero.\n");
                scnr.next();     //gives space for new input, prevents an infinite loop
            }
        }
            while(!(wallHeight > 0.0));         //continues to loop while wallHeight is not a number greater than zero



        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        do {
            System.out.println("Enter wall width (feet): ");
            try {
                wallWidth = scnr.nextDouble();
                if (wallWidth <= 0.0){      //shows invalid if input is less than or equal to 0
                    System.out.println("Invalid input.Width must be a number greater than zero.\n");
                }
            }
            catch (Exception e){ //accounts for strings and any input that is not an integer or double
                System.out.println("Invalid input. Width must be a number greater than zero.\n");
                scnr.next();  //gives space for new input, prevents an infinite loop
            }
        }
            while (!(wallWidth > 0.0));  //continues to loop while wallWidth is not a number greater than zero

                                                                                             //error 1 wallHeight should be wallWidth

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + "square feet");                        //error 2 add '+ wallArea +'

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");                //error 3 capitalize P in gallonsPaintNeeded

    }
}
