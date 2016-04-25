package external.Term;



public class Term {

    private String co_effiecient;
    private String exponent;
    private String term ;
    
    /*
     * convert  to term
     */
    
    public Term(int coefficient1, int exponent1)
    {
        String to_add = "x";
        
         this.co_effiecient = Integer.toString(coefficient1);
         this.exponent = Integer.toString(exponent1);
        
          
          this.term = co_effiecient +  "x^" + exponent;
        
            
    }
    
    /*
     * convert  to term
     */
    public  String converter(int coefficient2, int exponent2)
    {
    
        String to_add1 = "x";
        
         this.co_effiecient = Integer.toString(coefficient2);
         this.exponent = Integer.toString(exponent2);
        
          
         this.term = co_effiecient +  "x^" + exponent;
            
         return (Returner());
    }
    
    public String Accessor() // out put coefficient and exponent
    {
        System.out.println(co_effiecient);
        System.out.println(exponent);
        return co_effiecient;
        
    }
    
    public  String Returner() // output both coeffiecient and exponent
    {
        
        String the_return;
        the_return = co_effiecient +   " x^ " +  exponent;
        
        return(the_return);
                
    }
    /*
     * to string method used to get output of value of private variables
     */
    
    public String toString(){
        
        return new String(term);
        
    }
}
