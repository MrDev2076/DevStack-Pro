package riders;

import java.util.*;
 class Roads_4_Riders {
 public static void main(String[] args) {
     
     
 int trails=4,trail,pin,otp;
     System.out.println("_Roads_4W_Riders_");
     System.out.println("Welcome to Roads_4W_Riders.");
      
       Scanner sc=new Scanner(System.in);
 

      
     for(trail=0; trail<trails; trail++)
     {
         System.out.print("ENTER YOUR USER ID NUMBER:"+" ");
     double num=sc.nextDouble();
     System.out.print("Enter your Password:");
      pin=sc.nextInt();
      
                         //Captcha Generator   
 Random r=new Random();
 char a[] =new char[20];
  
 System.out.print("OTP: ");
// int alphabet = "1234567890";
 int rand_int1 = r.nextInt(50000);
 System.out.print(rand_int1);
 // for (int i = 0; i < 4; i++)
 // {
 //     System.out.print(rand_int1);
 //   // System.out.print(alphabet.charAt(r.nextInt(alphabet.length())) +" ");
 // }

 int OTP=rand_int1;
    System.out.print("Enter OTP:");
      otp=sc.nextInt();
 
 if(num==9441790 && pin==9441 && otp==rand_int1)
 {
 System.out.print("Enter your Transaction Number : ");
 double tr=sc.nextDouble();
 
 
 
 
 
 
 if(tr==3554)
 {
 System.out.println("Your .tr number : " +tr+" "+"pls wait while loading data.....");
  //Car Showrooms
  //   Scanner sc=new Scanner(System.in);
    System.out.println("Here are list of Luxrious Cars in our showroom..... ");
    
     String []cars={ "Pagani Huayra Roadster BC" , "Mercedes Maybach Exelero" , "Buggati La Voiture Noire" , "Rolls-Royce Boat Tail" };
     int l=cars.length;
    
     
     System.out.println();
   
    //System.out.println();
    System.out.println("Select a Car from Available Cars : ");
        for(int i=0; i<l; i++)
     {
       System.out.print((i+1) +")" +cars[i] +" ");
     }System.out.println();
     System.out.println();
   //  for(int i=0; i<l; i++)
   //  {
      System.out.print("Your Choice : ");
      int choice=sc.nextInt();
      System.out.println();
       switch(choice){
           case 1: 
         System.out.printf("You have selected " +cars[0]);
         System.out.printf("ThankQ for ur selection, \n Our dealer will contact you for further process of your car...");
         break;
           case 2: 
         System.out.printf("You have selected " +cars[1]);
         System.out.printf("ThankQ for ur selection, Our dealer will contact you for further process of your car...");
         break;
           case 3: 
         System.out.printf("You have selected " +cars[2]);
         System.out.println("ThankQ for ur selection,\n Our dealer will contact you for further process of your car...");
         break;
           case 4: 
         System.out.printf("You have selected " +cars[3]);
         System.out.printf("ThankQ for ur selection, \n Our dealer will contact you for further process of your car...");
         break;
           case 5: 
         System.out.printf("You have selected " +cars[4]);
         System.out.printf("ThankQ for ur selection, \n Our dealer will contact you for further process of your car...");
         break;
           case 6: 
         System.out.printf("You have selected " +cars[5]);
         System.out.printf("ThankQ for ur selection, \n Our dealer will contact you for further process of your car...");
         break;
           case 7: 
         System.out.printf("You have selected " +cars[6]);
         System.out.printf("ThankQ for ur selection,\n Our dealer will contact you for further process of your car...");
         break;
           case 8: 
         System.out.printf("You have selected " +cars[7]);
         System.out.printf("ThankQ for ur selection, \n Our dealer will contact you for further process of your car...");
         break;
           default: 
         System.out.println("Pls select available car from above options.");
       
     }
 }
 else if(tr==1635)
 {
 System.out.println("Your .tr number : " +tr+" "+"pls wait while loading data.....");  
  //Car Showrooms
  //   Scanner sc=new Scanner(System.in);
  
     String []cars={ "Mahindra Bolero Neo" , "Mahindra KUV 100 NXT" , "Mahindra XUV300" , "Tata Tiago NRG" , "Hyundai Exter"};
     int l=cars.length;
     System.out.println("Here are list of Classic Cars in our showroom..... ");
    
     System.out.println();
   
    //System.out.println();
    System.out.println("Select a Car from Available Cars : ");
        for(int i=0; i<l; i++)
     {
       System.out.print((i+1) +")" +cars[i] +" ");
     }System.out.println();
     System.out.println();
   //  for(int i=0; i<l; i++)
   //  {
      System.out.print("Your Choice : ");
      int choice=sc.nextInt();
      System.out.println();
       switch(choice){
           case 1: 
         System.out.printf("You have selected " +cars[0]);
         System.out.printf("ThankQ for ur selection, \n Our dealer will contact you for further process of your car...");
         break;
           case 2: 
         System.out.printf("You have selected " +cars[1]);
         System.out.printf("ThankQ for ur selection, Our dealer will contact you for further process of your car...");
         break;
           case 3: 
         System.out.printf("You have selected " +cars[2]);
         System.out.println("ThankQ for ur selection,\n Our dealer will contact you for further process of your car...");
         break;
           case 4: 
         System.out.printf("You have selected " +cars[3]);
         System.out.printf("ThankQ for ur selection, \n Our dealer will contact you for further process of your car...");
         break;
           case 5: 
         System.out.printf("You have selected " +cars[4]);
         System.out.printf("ThankQ for ur selection, \n Our dealer will contact you for further process of your car...");
         break;
           case 6: 
         System.out.printf("You have selected " +cars[5]);
         System.out.printf("ThankQ for ur selection, \n Our dealer will contact you for further process of your car...");
         break;
           case 7: 
         System.out.printf("You have selected " +cars[6]);
         System.out.printf("ThankQ for ur selection,\n Our dealer will contact you for further process of your car...");
         break;
           case 8: 
         System.out.printf("You have selected " +cars[7]);
         System.out.printf("ThankQ for ur selection, \n Our dealer will contact you for further process of your car...");
         break;
           default: 
         System.out.println("Pls select available car from above options.");;
       
     }
 }
 else{
     System.out.println(" Pls Enter vaild Tr-Number! ");
 }
 
 
 
 
 
 
 break;
     }//break tr
     else
     {
         trail++;
         if(trail<trails-1)
         {
         System.out.println("User Id/PIN doesn't match, Please Try again");
         System.out.println();
         }//try again if
     else{
      System.out.println("You have exceeded max trails.");
         }//exceed else
     }//exit else
 }// end id
//end for
     
     
     
     

     
 }
}