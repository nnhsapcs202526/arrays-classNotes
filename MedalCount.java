
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
     * Can use the array literal syntax to initialize a 2D array by nesting our curly brackets.
     */
    private int[][] counts = new int[][]
    {  // outer array
        {1, 3, 2},  // index 0, country # 1
        {0, 2, 1},
        {3, 3, 0}, 
        {1, 1, 1},
        {0, 2, 4},
        {3, 3, 0}, 
        {1, 0, 1}  // country # 7
        
    };
    
    public MedalCount()
    {
        /*
         * Alternative way to initialize a 2D array.
         */
        
        //this.counts = new int[COUNTRIES][MEDALS];
        
        // for each row in array
        // for each column in the row
            
        
    }
    
    /*
     * Prints the entire table in rows and columns.
     */
    public void printTable()
    {
        // GOOD  for(int row = 0; row < COUNTRIES; row++)
        // BETTER
        for(int row = 0; row < this.counts.length; row++)
        {
            // GOOD
            //for(int col = 0; col < MEDALS; col++)
            //BETTER
            //for(int col = 0; col < this.counts[0].length; col++)
            // BEST
            for(int col = 0; col < this.counts[row].length; col++)
            {
                System.out.print(this.counts[row][col] + "\t");
            }
            System.out.println();
        }
    }
    
    /**
     * Sum the medals for a specified country.
     * 
     * @param countryIndex the index of the country to sum medals for
     * @return the sum of the specified country's medals
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
     * Sums the medals for a given medal type given a medal index.
     * 
     * @param medalIndex index of the medal to count
     * @return the sum for a medal type
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
