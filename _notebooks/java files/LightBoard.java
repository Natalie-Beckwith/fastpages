import java.util.Scanner;

@Data // Annotations to simplify writing code (ie constructors, setters)
public class LightBoard
{
    final static int NUM_ROWS = 5;
    final static int NUM_COLUMNS = 5;

    private Light[][] lights;

    /* Initialize LightBoard and Lights */
    public LightBoard(int numRows, int numCols)
    {

        this.lights = new Light[numRows][numCols];
        // 2D array nested loops, used for initialization
        for (int row = 0; row < numRows; row++)
        {
            for (int col = 0; col < numCols; col++)
            {
                Light lightTemp = new Light();

                lights[row][col] = lightTemp; // each cell needs to be constructed

                double probability;
                probability = Math.random() * 10;

                if(probability <= 4.0)
                {
                    lightTemp.setLight(true);
                }
                else
                {
                    lightTemp.setLight(false);
                }
            }
        }
    }

    /* Output is intended for API key/values */
    public String toString()
    {
        String outString = "[";
        // 2D array nested loops, used for reference
        for (int row = 0; row < lights.length; row++)
        {
            for (int col = 0; col < lights[row].length; col++)
            {
                outString +=
                        // data
                        "\n" + "~~~" + "\n"
                        + "ROW #: " + row + "\n"
                        + "COLUMN #: " + col + "\n"
                        + "LIGHT COLOR:" + "\n" + lights[row][col] + "\n" // extract toString data
                        + "~~~" + "\n";
            }
        }
        // remove last comma, newline, add square bracket, reset color
        outString = outString.substring(0, outString.length() - 1) + "\n]";
        return outString;
    }

    /* Output is intended for Terminal, effects added to output */
    public String toTerminal()
    {
String outString = "[";
        // 2D array nested loops, used for reference
        for (int row = 0; row < lights.length; row++)
        {
            for (int col = 0; col < lights[row].length; col++)
            {
                if(lights[row][col]._on)
                {
                    outString +=
                        // reset
                        "\033[m" +

                        // color
                                "\033[38;2;" + lights[row][col].getRed() + ";" + // set color using getters
                                lights[row][col].getGreen() + ";" + lights[row][col].getBlue() + ";"
                                + lights[row][col].getEffect() + "m" +
                                // data, extract custom getters
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣤⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" + "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀" + "\n"+
                                "⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⣿⣿⣿⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⣿⣿⣿⡆⠈⠻⠿⠋⣀⡙⠿⠛⠁⢰⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠹⣿⣿⣷⠀⣦⣤⣾⣿⣿⣦⣶⠂⣾⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠙⣿⣿⡇⢸⣿⣿⣿⣿⣿⡟⢠⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⠈⣿⣿⣿⣿⣿⠁⣼⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠛⠛⠛⠛⠛⠛⠛⠛⠛⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣶⣶⣶⡶⠶⠖⠒⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠋⣉⣠⣤⣴⣶⣿⠿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠿⠿⠛⠋⢉⣁⣤⣴⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣤⣤⣤⣤⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" + "\n"+
                                "RGB: " + lights[row][col].getRGB() + "\n"
                                + "Effect: " + "\"" + lights[row][col].getEffectTitle() + "\"" + "\n"
                                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                                // newline
                                +"\n";
                }
                else
                {
                    outString +=
                        // reset
                        "\033[m" +

                        // color
                                "\033[38;2;125;124;123m" +
                                // data, extract custom getters
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣤⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" + "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀" + "\n"+
                                "⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⣿⣿⣿⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⣿⣿⣿⡆⠈⠻⠿⠋⣀⡙⠿⠛⠁⢰⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠹⣿⣿⣷⠀⣦⣤⣾⣿⣿⣦⣶⠂⣾⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠙⣿⣿⡇⢸⣿⣿⣿⣿⣿⡟⢠⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⠈⣿⣿⣿⣿⣿⠁⣼⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠛⠛⠛⠛⠛⠛⠛⠛⠛⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣶⣶⣶⡶⠶⠖⠒⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠋⣉⣠⣤⣴⣶⣿⠿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠿⠿⠛⠋⢉⣁⣤⣴⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣤⣤⣤⣤⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"+ "\n"+
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" + "\n"+
                                "This light is off." + "\n\n"
                                
                                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                                // newline
                                +"\n";
                }
                
            }
        }
        // remove last comma, newline, add square bracket, reset color
        outString = outString.substring(0, outString.length() - 2) + "\033[m" + "]";
        return outString;
    }

    /* Output is intended for Terminal, draws color palette */
    public String toColorPalette2(String red, String green, String blue)
    {
        

        // block sizes
        final int ROWS = NUM_ROWS;
        final int COLS = NUM_COLUMNS;

        // Build large string for entire color palette
        String outString = "";
        // find each row
        for (int row = 0; row < lights.length; row++)
        {
            // repeat each row for block size
            for (int i = 0; i < ROWS; i++)
            {
                // find each column
                for (int col = 0; col < lights[row].length; col++)
                {
                    // repeat each column for block size
                    for (int j = 0; j < COLS; j++)
                    {
                        // print single character, except at midpoint print color code
                        String c = (i == (int) (ROWS / 2) && j == (int) (COLS / 2)) ? lights[row][col].getRGB()
                                : (j == (int) (COLS / 2)) // nested ternary
                                        ? " ".repeat(lights[row][col].getRGB().length())
                                        : " ";

                        outString +=
                                // reset
                                "\033[m" +

                                // color
                                        "\033[38;2;" + red + ";" + green
                                        + ";" + blue + ";" + "7m" +

                                        // color code or blank character
                                        c +

                                        // reset
                                        "\033[m";
                    }
                }
                outString += "\n";
            }
        }
        // remove last comma, newline, add square bracket, reset color
        outString += "\033[m";
        return outString;
    }

    /* Output is intended for Terminal, draws color palette */
    public String toColorPalette()
    {
        // block sizes
        final int ROWS = NUM_ROWS;
        final int COLS = NUM_COLUMNS;

        // Build large string for entire color palette
        String outString = "";
        // find each row
        for (int row = 0; row < lights.length; row++)
        {
            // repeat each row for block size
            for (int i = 0; i < ROWS; i++)
            {
                // find each column
                for (int col = 0; col < lights[row].length; col++)
                {
                    // repeat each column for block size
                    for (int j = 0; j < COLS; j++)
                    {
                        // print single character, except at midpoint print color code
                        String c = (i == (int) (ROWS / 2) && j == (int) (COLS / 2)) ? lights[row][col].getRGB()
                                : (j == (int) (COLS / 2)) // nested ternary
                                        ? " ".repeat(lights[row][col].getRGB().length())
                                        : " ";

                        outString +=
                                // reset
                                "\033[m" +

                                // color
                                        "\033[38;2;" + lights[row][col].getRed() + ";" + lights[row][col].getGreen()
                                        + ";" + lights[row][col].getBlue() + ";" + "7m" +

                                        // color code or blank character
                                        c +

                                        // reset
                                        "\033[m";
                    }
                }
                outString += "\n";
            }
        }
        // remove last comma, newline, add square bracket, reset color
        outString += "\033[m";
        return outString;
    }

    static public void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter how many different color palettes you would like: ");
        int rows = scanner.nextInt();

        System.out.printf("Enter how many different colors you would like in each palette: ");
        int cols = scanner.nextInt();
        // create and display LightBoard
        LightBoard lightBoard = new LightBoard(rows, cols);
        //System.out.println(lightBoard); // use toString() method
        //System.out.println(lightBoard.toTerminal());

        /* 
        System.out.printf("Enter red: ");
        String red = scanner.next();
        System.out.printf("Enter green: ");
        String green = scanner.next();
        System.out.printf("Enter blue: ");
        String blue = scanner.next();

        System.out.println(lightBoard.toColorPalette2(red, green, blue));
*/
        System.out.println(lightBoard.toColorPalette());
        scanner.close();
    }
}
