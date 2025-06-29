class Swap_temp{
  public static void main(String[] args) {
    int[] swapped = swap(22, 33);
    System.out.println(swapped[0]);
    System.out.println(swapped[1]);
  }
  // Arthimetric trick but not idle for large number
  // public static int[] swap(int a , int b){
  //   a = a+b ;
  //   b = a-b ;
  //   a = a-b ;
  //   return new int[] {a,b};
    
  // }
   
  public static int[] swap(int a , int b){
    int temp = a ;
    a = b;
    b = temp ;
    return new int[] {a,b};
 
  }
  }
