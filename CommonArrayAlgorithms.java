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
        int[] array = createRandomArray(10, 100);
        int cnt = array.length;
        for(int i = 0; i < cnt-1; i++)
        {
            System.out.print("" + array[i] + "|");
        }
        System.out.print("" + array[cnt-1]);
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
        int[] array = createRandomArray(100, 100);
        printArray(array);
        int cnt = array.length;
        for(int i = 0; i < cnt; i++)
        {
            if(array[i] == valueToFind)
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
        int[] anything = createRandomArray(10,limit+100);
        int count = 0;
        for (int num: anything)
        {
            if(num < limit)
            {
                count++;
            }
        }

        printArray(anything);
        System.out.println(count);
        return count;
    }
     public static int countLessThan2( int limit )
    {
         int[] nums = createRandomArray(20,100);
        int count = 0;
       
        for (int num : nums)
        {
            if (num < limit)
            {
                count++;
            }
        }
       
        printArray(nums);
        System.out.println("count: " + count);
       
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
        int[] arr = createRandomArray(10, 100);
        printArray(arr);
        int max = arr[0];     // or Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; ++i) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
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
        int array[] = createRandomArray(10,20);
        int array2[] = new int[array.length];
        int y=array.length;
        for (int i = 0; i < array.length; i++){
            array2[y-i-1]=array[i];
        }
        printArray(array);
        printArray(array2);
        return array2;
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

         int[] randArray = createRandomArray(5,5);
        int[] values = new int[randArray.length];
        int[] repeat = new int[randArray.length];
       
        printArray(randArray);
       
        for (int i = 0; i < randArray.length; i++)
        {
            for(int j = 0; j < values.length; j++)
            {
                if (randArray[i] != values[j])
                {
                    values[i] = randArray[i];
                    repeat[j] +=1;
                    break;
                }
                else if(randArray[i] == values[j])
                {
                    repeat[j] += 1;
                }
                else if (randArray[i] == 0)
                {
                    repeat[j] += 1;
                }
            }
        }
        int n = 0;
        int index = 0;
        for(int i = 0; i < repeat.length; i++)
        {
            if(n < repeat[i])
            {
                n = repeat[i];
                index = i;
            }
        }
        printArray(values);
        printArray(repeat);
       
        System.out.println(values[index]);
        return 0;
    }
    public static int mode2()
    {
        /* hint: when creating the random array, specify parameters that will
         *    likely result in a value being repeated multiple times;
         *    create another array to keep track of how many times each value
         *    occurs (index is the number and the value is the number of occurrences)
         */

        int[] x = createRandomArray(10,10);
        int[] countArr = new int[10];

        int maxAmt = 0;
        int mode = 0;
        for(int val: x) {

            countArr[val]++;
            if(countArr[val] > maxAmt) {

                maxAmt = countArr[val];
                mode = val;
            }
        }

        printArray(x);
        printArray(countArr);
        System.out.println("Mode: " + mode);
        System.out.println("Occurence: " + maxAmt);

        return mode;
    }

}