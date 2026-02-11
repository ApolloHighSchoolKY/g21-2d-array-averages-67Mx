import java.util.Arrays;

public class ArrayAverages{
  
  //this is an instance FIELD (referencing it could be a primitive)
  //instance fields are usually initialized as private, if its not specified its automatically public
  int[][] ray;

  //this is a modified constructor
  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
   for(int row=0; row<ray.length; row++)
   {
    
    double val=0;
    for(int col=0; col<ray[row].length; col++)
    {
      val+=ray[row][col];
    }
    val=val/ray.length;
    System.out.println("Row "+ row + ": "+ val);
   }

  }

  public void columnAverages(){
    //Column major order
    //   Take each column and go through all of the rows
    //   Top down and Left to Right
    for(int col=0; col<ray[0].length; col++)
    {
      double val=0;
      for(int row=0; row<ray.length; row++)
        val+=ray[row][col];
      val=val/ray.length;
    System.out.println("Column "+ col + ": " + val);
    }
    
  }

  public void arrayAverage(){
    double val=0;
    int rows=0;
    int columns=0;
    for(int row=0; row<ray.length; row++)
   {
    rows++;
    for(int col=0; col<ray[row].length; col++)
    {
      columns++;
      val+=ray[row][col];
    }
   }
   columns/=rows;
   val=val/(rows*columns);
   System.out.println(val +" "+ rows+" "+ columns);
   
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
