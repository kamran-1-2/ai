import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
class  AI{

 static int a;
   int z;
   static int song;
   String nm;
   static int s;
    public   void input () throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            
       
   }
   
   public   void talk () throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
          try {
                Thread.sleep(2000);
                 System.out.println("dear user pls enter the feeding key  ");
          s=Integer.parseInt(br.readLine());
        } catch (InterruptedException ignored) {}
        
        
         if(s>=250)
         System.out.println(" access denied. Attempts recorded more tries will result in lock of your AI");
        
         else 
          System.out.println("thanks for the code machine activated successful");
          if(s>=250){
           System.exit(0); }
        
        
        }
    
     public  void startup (){
         
         
                      
         System.out.println("AI Ⓒ COPYWRIGHTS RESERVED");
             try {
                Thread.sleep(1000);
                 System.out.println("Loading database...");
        } catch (InterruptedException ignored) {}
           
        
              try {
                Thread.sleep(1000);
                  System.out.println("Loading music...");
        } catch (InterruptedException ignored) {}
        
          try {
                Thread.sleep(1000);
                  System.out.println("Loading scan...");
        } catch (InterruptedException ignored) {}
        
          try {
                Thread.sleep(1000);
                  System.out.println("Loading learn...");
        } catch (InterruptedException ignored) {}
        
        
        
          try {
                Thread.sleep(1000);
                  System.out.println("Loading areaupdate ...");
        } catch (InterruptedException ignored) {}
        
        
        
        
              try {
                Thread.sleep(1000);
                  System.out.println("Loading completed 🆗");
        } catch (InterruptedException ignored) {}
        
          
          
                  try {
                Thread.sleep(1000);
                 System.out.println("STARTING AI® ✅");
        } catch (InterruptedException ignored) {}  
          
         
         
        }
        
        
         public  void time (){
  GregorianCalendar time = new GregorianCalendar();
  int hour = time.get(Calendar.HOUR_OF_DAY);
   if (hour < 12)
   System.out.println("Good Morning!⛅ sunny day");
  else if (hour < 17 && !(hour == 12))
   System.out.println("Good Afternoon ☀ full humidity felling thirsty");
  else if (hour == 12)
   System.out.println("Good Noon 🌥 ");
  else
   System.out.println("Good Evening ☁");
        
}
          public void soundch () throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         
       System.out.println("should i start songs again it is too quite enter ok to conform play");
      
      nm=br.readLine();
     if (nm.equals("ok"))
     song=1;
     if(song==1)
     System.out.println("thanks for conformation calling sound class 🎚");
     else
      System.out.println("ok dont want your wish 😑");
    }
      public  void display (){
                   try {
                Thread.sleep(5000);
                      System.out.println("I am AI by Kamran this is a special AI which uses advance functions and  net database");
        
        } catch (InterruptedException ignored) {}  
          
        
                    try {
                Thread.sleep(2000);
               System.out.println(" it get's updated every second  ");
        } catch (InterruptedException ignored) {}  
          
 
      
        }
                   
    public void chec() {
             if(a==1)
      System.out.println("nice background music ♫  ");
     else
       System.out.println(" 🎶 no songs it is too quite here  ");
       
    }
     public void songb (){
         
            try {
                Thread.sleep(5000);
              System.out.println("aaaah now it's good.I am a music lover");
        } catch (InterruptedException ignored) {}
        
          System.out.println("rock rock 🎧");
        }
        
         public static void main(String[] args) throws Exception {
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             int mus;
            
           System.out.println("while talking to me you will hear mucic enter 1 to  initialize sound");
           mus=Integer.parseInt(br.readLine());
           if(mus>1)   
           System.out.println("wrong selection by default music will be off "); 
            if(mus==0) 
            System.out.println("wrong selection by default music will be off "); 
            music obj1=new music();
   if(mus==1){
                obj1.musicAI();
              a=1;
            }
           
              AI obj=new AI ();
              obj.startup();
               obj.time();
               obj.talk();
               obj.display();
                                                         
            database obj3=new database();
             obj3.run();
            if(mus!=1)
             obj.soundch();
                 if (song==1)
        obj1.musicAI();
         if (song==1){
          obj.songb();
        }
           scan ob=new scan();
             ob.talk();
           
            
               
        if(s==121) 
         System.out.println("i can see beared person intracting with me ");
          else if(s==122)  
         System.out.println("i can see beared person intracting with me along 1 person with him");
         else if(s==123)
         System.out.println("i can see beared person intracting with me along 2 person with him");
         else if(s==124)  
         System.out.println("i can see beared person intracting with me along 3 person with him");
         else if(s==125)  
         System.out.println("i can see beared person intracting with me along 4 person with him");
        else if(s==126)  
         System.out.println("i can see beared person intracting with me along 5 person with him");
         
         
         else if(s==221)
            System.out.println("i can see teen face intracting with me ");
         
          else if(s==222)
          
            System.out.println("i can see teen face intracting with me along 1 person with him");
            
            else if(s==223)
            System.out.println("i can see teen face intracting with me along 2 person with him");
            
            else if(s==224)
            System.out.println("i can see teen face intracting with me along 3 person with him");
            
            else if(s==225)
            System.out.println("i can see teen face intracting with me along 4 person with him");
        
            else
           
            System.out.println("scan error people movement detected please try again and try not to move  ");
            
            ob.end();
              
            obj1.dummyMethod ();
        
            
       
       areaupdate obf=new  areaupdate ();
          obf.startup();
            obf.playsound();
             
              
           
        finalclass obj2=new finalclass();
         obj2.run();
         obf.stop();
         endai rn=new endai();
          rn.final1();
        obj2.ending(); 
      
        
        
                 
             
              
              
              
        }
    }
        
        