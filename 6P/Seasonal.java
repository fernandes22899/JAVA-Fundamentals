/** 
 * Seasonal.java:
 * 
 * A Seasonal object can respond to winter(), summer(), 
 * spring() and  fall().
 * 
 *  @author mlb for cs415 
 */
public interface Seasonal
{
    /** Spring is like a perhaps hand.  E. E. Cummings */
    public void spring( );
    
    /**   You can't get too much winter in the winter. Robert Frost.  */
    public void winter( );

    /**   I know I am but summer to your heart, 
      * and not the full four seasons of the year. Edna St. Vincent Millay */
    public void summer( );

    /** I'm glad I live in a world where there are Octobers. L.M. Montgomery */
    public void fall();
}