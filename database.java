import java.io.*;
import java.util.concurrent.TimeUnit;
class database{
String nm[]=new String[1];
static int song;
 int chhk=0;
 String hm;
 String bm;
static String  usnm[]=new String[1];
 static float ch;
    static float ad1;
   static float ad2;
   static float tot;

    public void input () throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        nm[0]=br.readLine();
        

    database obj2=new database();

    
    
      File output = new File("output.txt");
FileWriter writer = new FileWriter(output);

writer.write(nm[0]);
writer.flush();
writer.close();
  
    
    
    
      if (nm[0].equals("what is your name")){
      
      System.out.println("AI");
    }
    
    else if (nm[0].equals("exit")){
    System.exit(0);
}
    
    
    
    else if (nm[0].equals("what is my name")){
      
      System.out.println("you dint feed it to me ");
    }
      
    else if (nm[0].equals("were are you from")){
    
       System.out.println("i never asked my creator");
    }
       
      else if (nm[0].equals("hello"))  {
       System.out.println("hi ");
    }
       
      else if(nm[0].equals("who are you")){
    
       System.out.println("your AI");
    }
       
        else if(nm[0].equals("pubg")){
    
       System.out.println("chicken dinner hahah");
    }
       
     else if(nm[0].equals("hi")){
    
       System.out.println("hello");
    }
       
     else if(nm[0].equals("freefire")){
    
       System.out.println("booyah");
    }
       else if (nm[0].equals("hehe")){
      
       System.out.println("haha");
    }
       
       else if (nm[0].equals("AI")){
      
       System.out.println("yes");
    }
    
     else if(nm[0].equals("were do you live"))   {    
       System.out.println("i never asked my creator ");
    }
      
     else if(nm[0].equals("calculate"))   {    
      obj2.alu ();
    }
    
    
    
      
      
    
else{
        
     try {
                Thread.sleep(100);
              System.out.println(" server  traffic unstable ");
        } catch (InterruptedException ignored) {}
    
    
    
         
          try {
                Thread.sleep(3000);
              System.out.println(" Trying switching server  "); 
              
        } catch (InterruptedException ignored) {}
    
                      
        
        
           try {           
                Thread.sleep(3000);               
              System.out.println(" connection restablised last resort function called ");                                                                               
        } catch (InterruptedException ignored) {}
           
        
        
        
 try {           
                Thread.sleep(3000);               
              System.out.println(" here is your answer  ");                                                                               
        } catch (InterruptedException ignored) {}
                   
        
        
                    
                String string =nm[0];
        char ch = '+';       
       string = string.replace(' ', ch); 
        Runtime.getRuntime().exec(new String[]{"cmd","/c","start chrome https://www.google.com/search?q=+"+string });     
                                                                   
       
        
    
        
        
        
        
        try {           
                Thread.sleep(7000);
                
              System.out.println(" hope u have found answer. We are working hard to collaborate with google engine   ");            
                                                                   
        } catch (InterruptedException ignored) {}
        
        
        
             
        
         try {           
                Thread.sleep(3000);              
              System.out.println(" if you are not happy with the resutlt u can enter your own answer by entering yes");            
                bm=br.readLine();                                                   
        } catch (InterruptedException ignored) {}

       
       if (bm.equals("yes")){     
           
    System.out.println("enter your answer"); 
     hm=br.readLine(); 
       
}        
               
             if (!bm.equals("yes"))  {              
                 System.out.println("good to see u happy  ");                                                
                }



 
         try {           
                Thread.sleep(3000); 
            if (bm.equals("yes"))                
                 System.out.println("your answer is beeing analysed once done it it will be stored in ai database  ");                                                
        } catch (InterruptedException ignored) {}

       
       
        
        
        
        
        
        
        
}

  
    }

  
  
 public void display ()
  
 
    {
        
        
         try {
                Thread.sleep(3000);
              System.out.println("                         💡You can try saying💡");
        } catch (InterruptedException ignored) {}
        
        
        
        try {
                Thread.sleep(1000);
              System.out.println("                              hi      ");
        } catch (InterruptedException ignored) {}
        
        try {
                Thread.sleep(1000);
              System.out.println("                             pubg    ");
        } catch (InterruptedException ignored) {}
        try {
                Thread.sleep(1000);
              System.out.println("                            freefire  ");
        } catch (InterruptedException ignored) {}
       
        
        try {
                Thread.sleep(1000);
              System.out.println("                            calculate");
        } catch (InterruptedException ignored) {}
                
        
        try {
                Thread.sleep(1000);
              System.out.println("                            who are you ");
        } catch (InterruptedException ignored) {}
        
         try {
                Thread.sleep(1000);
              System.out.println("                            were do you live");
        } catch (InterruptedException ignored) {}
        
       
         try {
                Thread.sleep(2000);
              System.out.println("                            And many more things");
        } catch (InterruptedException ignored) {}
        
        
        
          System.out.println();
           System.out.println();
             System.out.println();
               System.out.println();
        try {
                Thread.sleep(3000);
              System.out.println("                                                                          check it out and have fun ");
        } catch (InterruptedException ignored) {}
        
        
        try {
                Thread.sleep(3000);
               System.out.print('\u000C');
        } catch (InterruptedException ignored) {}
        
        
      
        
            try {
                Thread.sleep(3000);
              System.out.println("ok lets begain ask me anything i will reply from my data base");
        } catch (InterruptedException ignored) {}
           
    }
  
  
        
       
  public static void alu () throws IOException 
    
    {
                
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));       
        
    
    
            System.out.print("1. Addition\n");
            System.out.print("2. Subtraction\n");
            System.out.print("3. Multiplication\n");
            System.out.print("4. Division\n");
            System.out.print("Enter Your Choice : ");
            ch=Integer.parseInt(br.readLine());
            
             if(ch>4){
               
                
               
              System.out.println("wrong selection taking back to ai class");
        
                                      
            
        
                 
                }
            if(ch==1){
            
            System.out.println("Enter first number ");
             ad1 = Float.parseFloat(br.readLine());
            System.out.println("Enter second number ");
                
                    ad2 = Float.parseFloat(br.readLine());
                   tot = ad1 + ad2;
                    System.out.println("Result = " + tot);
           
             
            }

             if(ch==2){
           
            
            System.out.println("Enter first number "); 
             ad1 = Float.parseFloat(br.readLine());
             System.out.println("Enter second number ");
                  
                    ad2 = Float.parseFloat(br.readLine());
                   tot = ad1 - ad2;
                    System.out.println("Result = " + tot);
                   database obj=new database();
           
                
            }
                    
                    if(ch==3){
                
                            
            System.out.println("Enter first number ");
              ad1 = Float.parseFloat(br.readLine());
             System.out.println("Enter second number ");
                  
                    ad2 = Float.parseFloat(br.readLine());
                   tot = ad1 * ad2;
                    System.out.println("Result = " + tot);
                     database obj=new database();
            
                    
             
            }
                    
                     if(ch==4){
                
            System.out.println("Enter first number ");
             ad1 = Float.parseFloat(br.readLine());
             System.out.println("Enter second number ");
                    
                    ad2 = Float.parseFloat(br.readLine());
                   tot = ad1 / ad2;
                    System.out.println("Result = " + tot);
                    
                
           
            }
                  
    

        
    
    
        }
    
    
       
            
    public void random () throws IOException{
                
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
          try {
                Thread.sleep(3000);
               System.out.println("by the way what is your name");
         usnm[0]=br.readLine();
        } catch (InterruptedException ignored) {}
            usnm[0] = usnm[0].toLowerCase();
                                                
            if(usnm[0]. equals("ai")){
                
                System.out.println("what a coincidence me too ai ");
                   try {
                Thread.sleep(3000);
                System.out.println(" by the way nice to meet you "+usnm[0]);
         
              } catch (InterruptedException ignored) {}            
                
                try {
                Thread.sleep(3000);
                System.out.println("feeling like i am greeting my self  hehe ");
         
              } catch (InterruptedException ignored) {}    
               
            }
        
            
             
               
                
                
            
            
             if(!usnm[0]. equals("ai")){
                
               System.out.println("oooo nice to meet you "+usnm[0]);
                System.out.println(" my self AI");
            }
            
        
       
                       
      
        
       
    }

    
 public static void fial (){ 
      if(usnm[0]. equals("ai")){
                           
               System.out.println("oooo no");
                
                
               System.out.println(" you are  "+usnm[0]);
               
                 System.out.println(" every time makes me confuse ");
                }
            
            
            
         if(!usnm[0]. equals("ai")){
                 
    System.out.println(" you are " +usnm[0]);
    
}
     
    }
    
    
    
   public static void run () 
       throws Exception {
        
        database obj=new database();
        obj.display();
        obj.input();
       obj.random();
         AI obj1=new AI ();
       obj1.chec();
       
       learn ln=new learn();
         ln.sv();
        }
    }
       

        
        
       
       
    
    

