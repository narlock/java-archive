public class HighScore
{
   String name; 
   int highscore; 
    
   public HighScore(String n, int hs)
    {
       name = n;
       highscore = hs;
    }

   public String getName()
    {
        return name;
    }
    
   public int getHighScore()
    {
      return highscore;
     }
     
   public String getDisplayInfo()
    {
       return highscore + " BY: " + name.toUpperCase().substring(0,3);
     }  
}
