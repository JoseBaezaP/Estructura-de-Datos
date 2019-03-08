
public class Tarea
{
  public static void main(String[] args) {

    int n=5;
    int num[] = {1,10,5,8,9,22,16,85,96,2,3,7,20,21,26};
    imprimir(num);
    System.out.println("Ordenando:");
    insertionSort(num);
    imprimir(num);
  }
  public static void imprimir(int[] num)
  {
    for (int i =0;i<num.length;i++) {

      System.out.println(num[i]);
    }
  }
  


  public static void insertionSort(int[] vec)
  {
    int aux;
    for (int i =1;i<vec.length;i++) {
      aux = vec[i];

      for(int j = i-1;j>=0;j--)
      {
        if(vec[j]>aux)
        {
          vec[j+1] = vec[j];
          vec[j]=aux;
        }        
      }
    }
  }
      
}  
  

