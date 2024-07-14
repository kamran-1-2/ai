import java.io.*;
class learn{
    int s;
    String nm;
    String nm1;
     String nm2;
     String nm3;
      String nm4;
      String tt;
    public   void sv() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           try {
                Thread.sleep(2000);
              System.out.println("want to teach your ai something ?");
              tt=br.readLine();              
        } catch (InterruptedException ignored) {}
        if(!tt. equals("yes"))
        System.out.println(" it is a default program calling teach class");
        
        
             try{
                  Thread.sleep(3000);
              System.out.println("lets start so what will be i learning today");
               nm=br.readLine();
  } catch (InterruptedException ignored) {} 
         
        
       
        System.out.print( "oooo! " + nm );        
        
        System.out.println( " what it means " );
        nm1=br.readLine();
        System.out.println("ooo so it means " + nm1);
        System.out.println("what reply i should give when it is said ");
         nm4=br.readLine();
        System.out.println("what should i feel when i hear this word");
         nm2=br.readLine();
         System.out.println("oooo thanks for giving info on " +nm);
         
          try {
                Thread.sleep(3000);
               System.out.println(" lets recall " );
  } catch (InterruptedException ignored) {} 
         
         
         
  
        try {
                Thread.sleep(1000);
               System.out.println(" if u say me " + nm );
  } catch (InterruptedException ignored) {} 
  
  
  
  
        try {
                Thread.sleep(3000);
               System.out.println(" so it means " + nm1 );
  } catch (InterruptedException ignored) {} 
  
  
  
        try {
                Thread.sleep(3000);
               System.out.println(" and my reply to it will be " + nm4 );
  } catch (InterruptedException ignored) {} 
  
  
  
  
     try {
                Thread.sleep(2000);
              
  System.out.println("what should be my  felling when i hear this word hmmm trying to recall can u help ");
   nm3=br.readLine();
  } catch (InterruptedException ignored) {} 
  
  
  
  
      
     if( nm2.equals(nm3))
      
      System.out.println( nm2+ " oops ya  forgot it haha ");
   else
   System.out.println("oo oo oo wait a second you said i should feel " +nm2+ " huh checking my memory i am not so bad at storing hehe ");
  
   
   
        try {
                Thread.sleep(1000);
                System.out.println("now i got how to reply it and to react ");
  } catch (InterruptedException ignored) {} 
  
           
            
              learn obj=new learn();
         
        }
        
        
    
     
     
    }

    

    
    
    