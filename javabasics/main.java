package javabasics;

import java.io.IOException;

public class main {
    public static void main(String args[])
    {
      try{
          sample(new Black());
      }catch(ColorNotFoundException e)
      {
          System.out.println(e.getMessage());
      }
    }
    public static void sample(ColoredClass co) throws ColorNotFoundException
    {
        throw new ColorNotFoundException("This color is not found");
    }
}
