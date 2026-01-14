
/**
 * Write a description of class MedalCount here.
 *
 * @author mrcallaghan
 * @version 14jan2026
 */
public class MedalCount
{
    private final int COUNTRIES = 7;
    private final int MEDALS = 3;
    
    /*
     * Can use use array literal syntax (intitializer list) to create 2D arrays by nesting curly brackets.
     */
    private int[][] counts = new int[][]
        {
            {1, 0, 1},
            {1, 1, 0},
            {0, 1, 0},
            {1, 1, 0},
            {0, 1, 2},
            {2, 0, 1},
            {1, 1, 1}
        };
        
    public MedalCount()
    {
        /*
         * Alternate way to create a 2D array would be to initilize and then write nested loops to populate the array.
         * 
         *      this.count = new int[COUNTRIES][MEDALS];
         *      for ...
         *          for ...
         */
    }
    
    public void printTable()
    {
        
        // GOOD for(int row = 0; row < COUNTRIES; row++)
        // BETTER:
        for(int row = 0; row < this.counts.length; row++)
        {
            // for(int col = 0; col < MEDALS; col++)
            //for(int col = 0; col < this.counts[0].length; col++)
            // BEST;
            for(int col = 0; col < this.counts[row].length; col++)
            {
                System.out.print(this.counts[row][col] + "\t");
            }
            System.out.println();
        }
    }
    
    /**
     * Sum the medals for the specified country index (i.e., the specified row).
     * 
     * @param countryIndex the index for the country in the table whose medals to sum
     * @return the sum of the medals for a specified country
     */
    public int sumMedalsForCOuntry(int countryIndex)
    {
        int sum = 0;
        
        for(int col = 0; col < this.counts[countryIndex].length; col++)
        {
            sum += this.counts[countryIndex][col];
        }
        
        return sum;
    }
    
    
    
    
    
    
    
    
}
