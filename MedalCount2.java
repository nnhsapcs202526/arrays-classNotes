
/**
 * Write a description of class MedalCount2 here.
 *
 * @author mrcallaghan
 * @version 14jan2026
 */
public class MedalCount2
{
    private final int COUNTRIES = 7;
    private final int MEDALS = 3;
    
    /*
     * Can use array literals with 2D arrays to create the array using nested curly brackets.
     */
    private int[][] counts = new int[][]
    {
        {3, 2, 1},  // country #1
        {0, 1, 2},
        {1, 3, 1, 3},
        {0, 1, 0},
        {2, 3, 1},
        {0, 1, 0},
        {3, 0, 1}  // country #7
    };
    
    public MedalCount2()
    {
        /*
         * Alternatively, you can initialize the array using nested loops.
         */
        
        //this.counts = new int[COUNTRIES][MEDALS];
        
        //for ..
        //    for ..
        
    }
    
    /**
     * Print the entire table in rows and columns.
     */
    public void printTable()
    {
        //GOOD   (int row = 0; row < COUNTRIES; row++)
        //BETTER
        // BEST
        for(int row = 0; row < this.counts.length; row++)
        {
            // GOOD:  for(int col = 0; col < MEDALS; col++)
            //BETTER:  for(int col = 0; col < this.counts[0].length; col++)
            // BEST
            for(int col = 0; col < this.counts[row].length; col++)
            {
                System.out.print(this.counts[row][col] + "\t");
            }
            System.out.println();
        }
    }
    
    /**
     * Sum the medals for the specified country index (i.e., the specifed row)
     * 
     * @param countryIndex the index of the country to sum medals for
     * @return the sum of the medals for that country
     */
    public int sumMedalsForCountry(int countryIndex)
    {
        int sum = 0;
        
        for(int col = 0; col < this.counts[countryIndex].length; col++)
        {
            sum += this.counts[countryIndex][col];
        }
        
        return sum;
    }
    
    /**
     * Sum the medals for the specified medal index.
     * 
     * @param medalIndex the index of the medal type to count up
     * @return the sum of the given medal type
     */
    public int sumMedalsForType(int medalIndex)
    {
        int sum = 0;
        
        for(int row = 0; row < this.counts.length; row++)
        {
            sum += this.counts[row][medalIndex];
        }
        
        return sum;
    }
    
    
    
    
}
