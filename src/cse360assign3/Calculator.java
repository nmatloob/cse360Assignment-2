/*
 * Author: Noor Matloob
 * Class ID 480
 *  Assignment #2 

  /*
   * This is a class that does calculating functions that has six methods. The first one is
   * Adding parameter to the total variable, and the second one is subtracting the parameter from the total variable 
   * and the third method is returning the current total variable by getTotal, The class also has a multiply method that
   * multiply the total by the parameter, and the last calculation is dividing the total by the parameter. 
   * finally is getHistory method to return an empty String.
   * 
 */
package cse360assign3;

/*
 * calculator class with add method, subtract method, getTotal method, multiply method, divide method and The getHistory method 
 * the add method add the parameter to the total variable and subtract method subtract the parameter from the total variable
 * and getTotal method return the current total and multiply method multiply the total by parameter 
 * and have a divide method should divide the total by parameter
 * last is getHistory method that returns an empty String.
 * @author noormatloob
 */
public class Calculator {

	private int total;
	private String history;
        /**
         * initialize total=0
         */
	public Calculator ()
        {
		total = 0;  
                history = new String ("0");
	}
	
	public int getTotal () 
        /**
         * The getTotal method should return the current total
         */
        {
		return total;
	}
	
	public void add (int value)
         /**
         * add method that adds total to the value 
         */
        {
		
                 history+= " + " + value;
                 total = total + value;
	}
	
	public void subtract (int value)
         /**
         * subtract method that subtract total from the value 
         */       
        {       history+= " - " + value;
		total = total - value;
	}
	
	public void multiply (int value)
        /**
         * The multiply method multiply the total by the parameter
         */        
        {       history+= " * " + value;
		total= total * value;
	}
	
	public void divide (int value)
         /**
         * The divide method should divide the total by the parameter. 
         * Use integer division. If the parameter is zero, set the total to zero.
         */       
        {       history+= " / " + value;
		if (value == 0)
                    total = 0;
                else 
                    total = total / value;
	}
	
	public String getHistory ()
                
         /**
         * getHistory method to return an empty String
         */
        
        {
		return history;
	}
}