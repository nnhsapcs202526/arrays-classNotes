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
        // creates array
        int[] array = createRandomArray(10, 10);

        for(int i = 0; i < array.length; i++)
        {
            // prints current element
            System.out.print(array[i]);
            // adds " | " if not last element
            if(i < array.length - 1)
            {
                // adds " | "
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
        int[] array = createRandomArray( 10, 10 );
        int num = -1;
        boolean isfound = false;
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+ " ");
            if((valueToFind == array[i]) && !isfound){
                System.out.println("index of specified value: " + i);
                num = i; isfound = true;
            }
        }
        return num;
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
        //we created a random array with arbitrary length and limit
        int[] nums = createRandomArray(10, 20);

        //count keeps track of the number of elements less than the limit
        int count = 0;

        for (int number : nums)
        {
            if (number < limit)
            {
                count++;
            }
        }

        printArray(nums);
        System.out.println("number of elements less than " + limit + " :" + count);
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
        int[] rndNums = createRandomArray((int)(Math.random() * 30), 100);

        int maxNum = 0;

        for(int num : rndNums)
        {
            if(num > maxNum)
            {
                maxNum = num;
            }
        }

        printArray(rndNums);
        System.out.println(maxNum);

        return maxNum;
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
        int[] array = createRandomArray( 10, 50 );
        int[] reversedArray = new int[10];

        int counter = 0; // counter will allow us to track the index of reversedArray

        // This for loop will go backwards through the array
        for(int i = array.length-1; i >= 0; i--)
        {
            reversedArray[counter] = array[i];
            counter++;
        }

        //The rest of the code is formatting and printing the arrays into the console/terminal
        System.out.print("Original array: \n");
        printArray(array);

        System.out.println("Reversed array: ");
        printArray(reversedArray);

        return reversedArray;
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

        return 0;
    }

}