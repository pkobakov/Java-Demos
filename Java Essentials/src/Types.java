public class Types {

    // data Types

  private int first;
  private int second;
  double doubleOne;
  double doubleTwo;
  private boolean isTrue = true;

     Types(){

     }
     Types(int first, int second){
         this.first = first;
         this.second = second;
     }

     Types(double doubleOne, double doubleTwo){
         this.doubleOne = doubleOne;
         this.doubleTwo = doubleTwo;
     }

   public String PrintDefault(){
         if(first != 0 || second != 0|| doubleOne != 0 || doubleTwo != 0){
             return "This not the default constructor";
         }
         return "This is the default constructor";
   }
   public int Calculate(){
         return this.first + this.second;
   }

   public String Multiply(){
         double sum = doubleOne * doubleTwo;
         return String.format("%.2f", sum);
   }

   public boolean CheckNumbers(){
       if (first > second) {
           return isTrue;
       }
       return !isTrue;
   }

}
