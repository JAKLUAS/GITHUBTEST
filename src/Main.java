import java.util.Arrays;

class Main {
  public static void main(String[] args) {
  

      int[][] arr = { {1,2,3},
                      {4,5,6},    
                      {1,0,1}, // row with min sum
                    };

     System.out.println(Arrays.deepToString(swapFirstRowWithMinRow(arr)));


                      // {1,0,1}
                    //   {4,5,6}    
                    //   {1,2,3}
                      
                  

                

  }


  public static int[][] swapFirstRowWithMinRow(int[][] arr){
    int minIndex = 0;
    int[] sums = new int[arr.length];
    int sumrow = 0 ; 
      
    for (int i = 0 ; i < arr.length; i++){
 sumrow = 0;
      for (int j = 0 ; j<arr[i].length; j++){
        sumrow += arr[i][j];
        
      }
      sums[i] = sumrow;
   
    }
for(int i = 0 ; i < arr.length; i++){
  for(int j =0; j < arr[i].length; j++){
    int temp = arr [0][j];
    arr[0][j] = arr[minIndex][j];
    arr[minIndex][j]= temp;
  }
}



      
    return arr;
  }
}