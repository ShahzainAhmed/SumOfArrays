// Creating a program for the Summation of Arrays.

class SumOfArrays{
   
   // Main method.
   public static void main(String args[]){ 
      
      // Declaration of an Array.
      int[] array = {10, 20, 30, 40, 50, 10};
      
      int sum = 0;
      
      // For loop (Advanced)
      for( int num : array) {
         
          sum = sum+num;
         
         
      }
      System.out.println("Sum of array elements is:"+sum);
      
   }
   
}
