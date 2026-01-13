import java.util.GregorianCalendar;

/**
 * Class live-coding notes on arrays.
 * 
 * @author mrcallaghan 
 * @version 13jan2026
 */
public class ArrayNotes
{
    public static void createArrayOfEvens()
    {
        /*
         * An array is an ordered collection of elements of the same type. The type
         *      can be a primitive type (e.g., int) or a class (e.g., Turtle or String).
         *      
         *  An array variable is like an object variable in that it must be declared and
         *      initialized.
         *      
         *  The number in the square brackets (i.e., []) specifies the number of elements
         *      in the array. The number of elements in the array cannot be changed.
         *      
         *  All elements in the array are initialized to their default values
         *      (e.g., 0, false, null).
         *      
         *  This code creates an array that contains 10 int elements.
         */
        int[] evens = new int[10];
        
        
        /*
         * Set the value of each element in the array to the first 10 positive even
         *      integers.
         *      
         *  "length" is used to query the number of elements in the array
         *  
         *  Square brackets are used to reference a specific element in the array
         *      based on its index. Indicies are zero based.
         */
        for(int i = 0; i < evens.length; i++)
        {
            evens[i] = (i + 1) * 2;
        }
        
        
        // print the reference to the array and the array elements
        System.out.println(evens);
        
        for(int i = 0; i < evens.length; i++)
        {
            System.out.println(i + ": " + evens[i]);
        }
        

    }
    
    public static void createArrayOfOdds()
    {
        /*
         * An array literal (a.k.a., initializer list) is a pair of curly brackets containing
         *      comma-separated values. It can be used to initialize the array. The length
         *      of the array is inferred based on the number of elements in the literal.
         *      
         */
        int[] odds = new int[] {1,3,5,7,9,11,13,15,17,19};
        
        /*
         * ArrayIndexOutOfBoundsException
         * 
         *  Arrays have a fixed length once initialized. The index specified must refer
         *      to a valid index. Otherwise, an ArrayIndexOutOfBoundsException is
         *      generated.
         */
        for(int i = 0; i <= odds.length; i++)
        {
            //System.out.println(odds[i]);
        }

        /*
         * Array References
         * 
         *  Variables of type array, contain a reference to the array stored in the
         *      computer's memory.
         *      
         *  Assigning one array variable's value to another, copies the reference, not
         *      the array's elements.
         */
        int[] moreOdds = odds;
        odds[2] = 6;
        System.out.println(moreOdds[2]);  //prints 6

        
        /*
         * Enhanced For Loops work with arrays.  No wrapper classes required.
         */
        for(int odd : odds)
        {
            System.out.println(odd);
        }
        
        /*
         * Limitations of Enhanced For Loops
         * 
         * Local variable is a copy of the value in the array.
         * 
         */
        for(int odd : odds)
        {
            odd++;
        }
        
        for(int odd : odds)
        {
            System.out.println(odd);
        }

    }
    
    public static void createArrayOfCalendars()
    {
        /*
         * Create an array of 12 calendars, each calendar initialized to the start
         *      of each month.
         *      
         *  When we create an array of references to objects, each element is initialized
         *      to null. We have to explicitly create *new* objects and assign the
         *      corresponding references to each element.
         */
        GregorianCalendar[] calendars = new GregorianCalendar[12];
        /*
         * At this point, every element in the array has a value of null.
         */
        for(GregorianCalendar calendar : calendars)
        {
            System.out.println(calendar);
        }
        
        /*
         * Create new calendar objects and assign their references to each element
         *      in the array.
         */
        for(int i = 0; i < calendars.length; i++)
        {
            calendars[i] = new GregorianCalendar(2026, i + 1, 1);
        }
        
        for(GregorianCalendar calendar : calendars)
        {
            System.out.println(calendar);
        }
        
        /*
         * An enhanced for loop cannot modify the values of the elements in the array
         *      (e.g., references to calendar objects), but we can call mutator methods
         *      which modify the properties of the referenced objects
         *      (e.g., day of the month).
         */
        for(GregorianCalendar calendar : calendars)
        {
            calendar.add(GregorianCalendar.DAY_OF_MONTH, 2);
        }
        
        for(GregorianCalendar calendar : calendars)
        {
            System.out.println(calendar);
        }

    }
    
    /**
     * Sum a string of numbers based a a provided delimiter.
     * 
     * @param numbers the string of numbers to parse
     * @param delimiter the delimiter to use with the split method
     * @return the sum of targeted numbers
     */
    public static int sumStringOfInts(String numbers, String delimiter)
    {
        int sum = 0;
        /*
         * arrays can be return values
         * 
         * split is a String method on the AP quick reference
         * 
         * Its purpose is to break a string into an array of substrings based 
         *      on a specified delimiter (e.g., " ").
         */
        String[] nums = numbers.split(delimiter);
        
        for(String num : nums)
        {
            System.out.println(num);
            /*
             * parseInt is a static method from the Integer class and is on the quick reference.
             *      Returns the String argument as in int.
             *      There is also a double version:
             *          Double.pareseDouble("7.7") returns 7.7
             */
            int n = Integer.parseInt(num);
            sum += n;
            
        }
        
        
        
        return sum;
    }
}
