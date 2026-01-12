public class CommonArrayAlgorithms
{
    /*
     * Create array of the specified size filled with
     *      random values based on the maximum value.
     *      
     * @param length the length of the array to create
     * @param maxValue the maximum number used (exclusive) for the random values
     */
    public static int[] createRandomArray( int length, int maxValue )
    {
        int[] randomArray = new int[ length ];
        for( int i = 0; i < randomArray.length; i++ )
        {
            randomArray[ i ] = (int)( Math.random() * maxValue );
        }

        return randomArray;
    }

    /*
     * Prints the specified array to System.out
     * 
     * @param array the array to print
     */
    public static void printArray( int[] array )
    {
        System.out.print("[");

        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
            if(i < array.length - 1)
            {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    /*
     * Array Algorithm #0: Sum and Average
     *  creates an array filled with random numbers
     *  calculates the sum and average of the numbers
     *  prints the array and the sum and average
     *  
     *  @return the average
     */
    public static double sumAndAverage()
    {
        double sum = 0;
        double average = 0;

        int[] array = createRandomArray( 10, 50 );

        for( int element : array)
        {
            sum += element;
        }

        average = sum / array.length;

        printArray( array );
        System.out.println( "sum: " + sum + " average: " + average );

        return average;
    }

    /*
     * Array Algorithm #1: Print Element Separators
     *  creates an array filled with random numbers
     *  prints each element of the array with a '|' between each element
     *      but not at the beginning or end of the array
     */
    public static void printElementSeparators()
    {
        int[] nums  = createRandomArray(5, 10);

        for (int i = 0 ; i< nums.length; i++)
        {
            System.out.print(nums[i]);
            if (i < nums.length - 1)
            {
                System.out.print(" | ");
            }
        }
    }

    /*
     * Array Algorithm #2: Linear Search
     *  creates an array filled with random numbers
     *  find the index of the first element with the specified value
     *  prints the array and the index (or -1 if not found)
     *  
     *  @param valueToFind the value to search for
     *  @return the index of the first element with the specified value (or -1 if not found)
     */
    public static int linearSearch( int valueToFind )
    {
        int[] array = new int[] {10,20,30,40,50,60,70,80,90,100};

        for(int i = 0; i<array.length; i++)
        {
            if (array[i] == valueToFind)
            {
                return i;
            }


        }
        return -1;
    }

    /*
     * Array Algorithm #3: Count Less Than
     *  creates an array filled with random numbers
     *  counts the number of elements that are less than the specified value
     *  prints the array and the count
     *  
     *  @param limit the limit to count items less than
     *  @return returns the number of elements that are less than the specified value
     */
    public static int countLessThan( int limit )
    {
        int[] array = createRandomArray( 10, 50 );
        int count = 0;
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] < limit)
            {
                count++;
            }
        }
        printArray(array);
        System.out.println("Count: " + count);
        return count;
    }

    /*
     * Array Algorithm #4: findMax
     *  creates an array filled with random numbers
     *  prints the array and the greatest number
     *  
     * @return the greatest number in the array
     */
    public static int findMax() 
    {
        int max = 0;

        int[] nums = createRandomArray( 10 , 50 );
        for(int num: nums)
        {
            if (num > max)
            {
                max = num;
            }    
        }
        printArray(nums);
        System.out.println(max);
        return max;
    }

    /*
     * Array Algorithm #5: Reverse Array
     *  creates an array filled with random numbers
     *  creates a new array of the same size
     *  copies elements from the first array into the new array in reverse order
     *  prints the original array and the new array
     *  
     *  return the new array
     */
    public static int[] reverseArray()
    {
        int[] array = createRandomArray(10 , 50);

        int [] reverseArray = new int[10];

        int count = 0;
        for (int i = array.length - 1; i >= 0; i--)
        {
            reverseArray[count] = array[i];
            count++;
        }

        printArray(array);
        printArray(reverseArray);
        return reverseArray;
    }

    /*
     * Array Algorithm #6: Mode
     *  creates an array filled with random numbers
     *  calculates the mode (most frequent value in the array)
     *  prints the array and the mode
     *  
     *  @return the mode of the elements in the array
     */
    public static int mode()
    {
        /* hint: when creating the random array, specify parameters that will
         *        likely result in a value being repeated multiple times;
         *        create another array to keep track of how many times each value
         *        occurs (index is the number and the value is the number of occurrences)
         */

        int[] values = createRandomArray(10, 5);
        int modeValue = -1;
        int modeAmount = -1;

        for (int i = 0; i < values.length; i++) {
            int amount = 0;
            for (int x = 0; x < values.length; x++) {
                if (values[i] == values[x]) {
                    amount++;
                }
            }
            if (amount > modeAmount) {
                modeValue = values[i];
                modeAmount = amount;
            }
        }

        printArray(values);
        System.out.println("The mode is " + modeValue + " (appears " + modeAmount + " times)");

        return modeValue;
    }

}