package external.Term;

import java.util.ArrayList;

public class polynomial {

	ArrayList<String> list = new ArrayList<String>();
	ArrayList<String> toreverse = new ArrayList<String>();
	private String product = " ";
	
	
	
	public polynomial()
	
	{
		
		
	    
	}
	
	public void adder( String term, int tracker)
	{
		
		
		list.add(term);
		
	
	    
	    if(tracker == list.size())
	    {
	    	list.add(" "); // the purpose of this line is to add a space between the each of the polynomial expressions
	    }
	    
	
	}
	public void print()
	{
		for(int t = 0; t < list.size(); t++)
		{
			System.out.println(list.get(t));
			if(list.get(t).equals(" "))
			{
				//System.out.println("lol");
			}
		}
	}
	/*
	 * sums up the product which is then outputtes
	 */
	public void product()
	{
		for(int t = 0; t < list.size(); t++)
		{
			if(list.get(t).equals(" "))
			{
				System.out.println(product);
				break;
			}
			
			
			if(t == 0)
			{    
				product =  list.get(t); 
			}
			if(t > 0)
			{	
				product = product + "+" + list.get(t); 
			}
			
			
			
		}
		
	}
	
	public void delete(String term3)
	{
		
				
				list.remove(term3);
			
	}
	
	public void reverse()
	{
		
		
		
		for(int t = list.size()- 1; t >= 0; t--)
		{
			
			toreverse.add(list.get(t));
			
		}
	
		for(int v = 0; v < toreverse.size(); v++)
		{
			System.out.println(toreverse.get(v));
		} 
		
	}
	
	//public String product_of_polynomial(String terms)
	//{
	
		//return products;
		
	//}
	/*
	public String Reverse();
	
	{
		
	}
	*/
	
}