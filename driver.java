package external.Term;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mainclass {

  public static void main(String args[]) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    ArrayList<Integer> nums = new ArrayList<Integer>();
    ArrayList <Integer> num2array = new ArrayList<Integer>();
    ArrayList <Integer>  newarray = new ArrayList<Integer>();
    ArrayList <Integer>  newarray7 = new ArrayList<Integer>();
    Scanner scan = new Scanner (System.in);
    
    int value =9;
    int coef_number;
        int expo_number;
        int b;
    int a = 0;
    int value1 = 8;
    int v;
    int p = 1;
    String g, m;
    
  /** 
   * * Reads from text file and adds to array
   */
        
        String file = "/Users/user/Documents/workspace/Polynomial project/text.txt";
        
        File textfile = new File(file);
        
        Scanner in = new Scanner(textfile);
        
        while(in.hasNextLine()) {
          String line = in.nextLine();
          Scanner fromStr = new Scanner(line);
          while (fromStr.hasNextInt())
                    {
                       newarray7.add(fromStr.nextInt());
                    }
        }
           
        
        in.close();
    while(value1 > 0)
    {
      
      
      System.out.println("would you like to add terms  to the polynomial");// calls the insert to link function
      String input = scan.next();
      
        
      if(input.equals("yes"))
      {
                System.out.println("How many polynomials u want to enter");
                {
                  
                  
                  int number2 = scan.nextInt();
                     
                   System.out.println(" Enter how many terms u want in polynomial");
                
                      int number = scan.nextInt();
                    int holder = number;
                  while(number2 > 0 )
                  {
                    
                  
                  
                    
                /* 
                 * Reads in both the coef and exponent which gets sorted in array using the even index
                 */
    
    
  
                      while(number > 0)
                     {
                    System.out.println("Enter co efficient");
                    coef_number = scan.nextInt();
              
                      System.out.println(" Enter exponent");
                    expo_number = scan.nextInt();
      
                    nums.add(coef_number);
                    nums.add( expo_number);
      
                 
      
       
                   number = number - 1;
                    }
                  
                    number = holder;
                    number2 = number2 - 1;
                  }
                  
             }
  
      
      }
           
             /*
              * adds all the odd terms numbers to array to the  num2array to sort the exponents
              */
               
                 for(int i = 0; i < nums.size() ; i=i+1)
                 {
        
                   b = i%2;
      
                  if (a != b)
        
                  {
                    value1 = nums.get(i);
                    num2array.add(value1);
                   //System.out.println(nums.get(i));
                   }
      
                  }
    
    
                  Collections.sort(num2array);
      
    /*
     * Once sorted then adds back to an array
     */
    
                 for(int j = 0; j < num2array.size(); j=j+1)
                 {  
                   v = 1;
      
                  for(int z = v; z < nums.size() ; z=z+1)
                     {
                     if(num2array.get(j).equals ( nums.get(z)))
                   {
                    newarray.add(nums.get(z-1));
                    newarray.add(nums.get(z));
                   
          
                 break;
         
                     }
          
         
      
                   }
     
                  }
    /* 
     * polynomial object used to compute product
     */
    
                 polynomial r = new polynomial(); //
    
                  Term t1 = new Term(newarray.get(0), newarray.get(1));
       
    
    
   
    
    
                  int track = newarray.size() / 2; // this would be necessary to add space when I create between the series of polynomial terms so that when i reach  the last term 
                  while( p < newarray.size()) 
                  {
    
                  r.adder(t1.converter(newarray.get(p-1), newarray.get(p)), track); // adds everything to the array list in the polynomial class
       
                  p = p + 2;
                   }
    

               System.out.println("would you like to print  terms in array");// calls the insert to link function
        
              input = scan.next();
        
               if(input.equals("yes"))
               {
                  
                     r.print();
                  
           
               }
        
                      System.out.println("would you like to product of polynomial or polynomials");// calls the insert to link function
        
                input = scan.next();
        
                if(input.equals("yes"))
                {
                   
                      r.product();
                  
           
                }
        
                        System.out.println("would you like to delete item from polynomial");// calls the insert to link function
        
               input = scan.next();
         
                if(input.equals("yes"))
                {
                  
                  System.out.println("enter value to delete");// calls the insert to link function
                  
                  g = br.readLine();
                  //System.out.println(g + "What i put");
                  r.delete(g);
                  
                       // r.delete(input);
                       
                         r.product();
           
                 }
        
           
                         System.out.println("would you like to reverse items in polynomial");// calls the insert to link function
        
                  input = scan.next();
        
                if(input.equals("yes"))
                {
                  
                     r.reverse();
                  
           
                }
        
                        System.out.println("would you like to exit");// calls the insert to link function
         
                input = scan.next();
        
                if(input.equals("yes"))
                 {
                   
                         break;
                  
           
                 }
        
           //r.print();
    
          //r.product();
    
          //r.delete("2 x^ 5");
    
          //r.product();
    
          //r.reverse();
    
    //System.out.println(" this is " + t); // print value of term generated
    
        }
  
  }
  

    }
    

  