class InvalidAgeException extends Exception{  
 InvalidAgeException(String s){  
  super(s);  
 }  
}  
class Main{  
  
   static void validate(int age)throws InvalidAgeException{  
     if(age<18)  
      throw new InvalidAgeException("Invalid");  
     else  
      System.out.println("Welcome to vote");  
   }  
     
   public static void main(String args[]){  
      try{  
      validate(13);  
      }catch(Exception exception){System.out.println("Exception occured: "+exception);}  
  }  
}  