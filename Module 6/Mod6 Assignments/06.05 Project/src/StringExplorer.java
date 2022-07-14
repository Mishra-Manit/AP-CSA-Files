/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author (enter your name)
 * @version (enter today's date)
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "    ";

        //  Add examples below for the following methods:
        //    trim()
        String example = "   cheese   ";
        System.out.println("This is the example for .trim(): " + example.trim());
        //    length()
        System.out.println("This is the example for .length(): " + example.length());
        //    indexOf with one and two parameters
        System.out.println("This is the example for .indexOf(), index of \"h\": " + example.indexOf("h"));
        //    substring() with one and two parameters
        System.out.println("This is the example for .substring() 1 parameter: " + example.substring(5));
        System.out.println("This is the example for .substring() 2 parameters: " + example.substring(5, 8));
        //    compareTo()
        String example2 = "cheese";
        int result = 0;
        result = example.trim().compareTo(example2);

        if (result == 0) {
            System.out.println("It is the same string");
        }
        else{
            System.out.println("They are not the same strings");
    }
        //    any other String methods you'd like to try

    }

}
