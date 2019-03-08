public class ordenamientos {

	static int bubbleSort[] = new int[10]; // num Sort 1 
	static int insertionSort[] = new int[10]; // num Sort 2
	static int selectionSort[] = new int [10]; // num Sort 3
	//static int quickSort[] = new int[10];
	static int bscounter=0;
	static int iscounter=0;
	static int sscounter=0;
	//static int qscounter=0;
	static float timebubbleSort[] = new float[10];
	static float timeinsertionSort[] = new float[10];
	static float timeselectionSort[] = new float[10];
	//static float timequickSort[] = new float[10];


	public static void main(String[] args){

		

		int random1[] = new int[numeroRandom()]; // valores al azar 1
		int random2[] = new int[numeroRandom()];
		int random3[] = new int[numeroRandom()];
		int random4[] = new int[numeroRandom()];
		int randomMintoMay1[] = new int[numeroRandom()]; // valores al azar de menor a mayor 2
		int randomMintoMay2[] = new int[numeroRandom()];
		int randomMintoMay3[] = new int[numeroRandom()];
		int randomMaytoMin1[] = new int[numeroRandom()]; // valores al azar de mayor a menor 3
		int randomMaytoMin2[] = new int[numeroRandom()];
		int randomMaytoMin3[] = new int[numeroRandom()];

		insertData(random1,1);
		insertData(random2,1);
		insertData(random3,1);
		insertData(random4,1);
		insertData(randomMintoMay1,2);
		insertData(randomMintoMay2,2);
		insertData(randomMintoMay3,2);
		insertData(randomMaytoMin1,3);
		insertData(randomMaytoMin2,3);
		insertData(randomMaytoMin3,3);

		burbuja(random1);
		burbuja(random2);
		burbuja(random3);
		burbuja(random4);
		burbuja(randomMintoMay1);
		burbuja(randomMintoMay2);
		burbuja(randomMintoMay3);
		burbuja(randomMaytoMin1);
		burbuja(randomMaytoMin2);
		burbuja(randomMaytoMin3);

		insertData(random1,1);
		insertData(random2,1);
		insertData(random3,1);
		insertData(random4,1);
		insertData(randomMintoMay1,2);
		insertData(randomMintoMay2,2);
		insertData(randomMintoMay3,2);
		insertData(randomMaytoMin1,3);
		insertData(randomMaytoMin2,3);
		insertData(randomMaytoMin3,3);	

		insertionSortxd(random1);
		insertionSortxd(random2);
		insertionSortxd(random3);
		insertionSortxd(random4);
		insertionSortxd(randomMintoMay1);
		insertionSortxd(randomMintoMay2);
		insertionSortxd(randomMintoMay3);
		insertionSortxd(randomMaytoMin1);
		insertionSortxd(randomMaytoMin2);
		insertionSortxd(randomMaytoMin3);

		insertData(random1,1);
		insertData(random2,1);
		insertData(random3,1);
		insertData(random4,1);
		insertData(randomMintoMay1,2);
		insertData(randomMintoMay2,2);
		insertData(randomMintoMay3,2);
		insertData(randomMaytoMin1,3);
		insertData(randomMaytoMin2,3);
		insertData(randomMaytoMin3,3);
		

		seleccion(random1);
		seleccion(random2);
		seleccion(random3);
		seleccion(random4);
		seleccion(randomMintoMay1);
		seleccion(randomMintoMay2);
		seleccion(randomMintoMay3);
		seleccion(randomMaytoMin1);
		seleccion(randomMaytoMin2);
		seleccion(randomMaytoMin3);

		insertData(random1,1);
		insertData(random2,1);
		insertData(random3,1);
		insertData(random4,1);
		insertData(randomMintoMay1,2);
		insertData(randomMintoMay2,2);
		insertData(randomMintoMay3,2);
		insertData(randomMaytoMin1,3);
		insertData(randomMaytoMin2,3);
		insertData(randomMaytoMin3,3);

		quicksort(random1, 0, random1.length-1);
		quicksort(random2, 0, random2.length-1);
		quicksort(random3, 0, random3.length-1);
		quicksort(random4, 0, random4.length-1);
		quicksort(randomMintoMay1, 0, randomMintoMay1.length-1);
		quicksort(randomMintoMay2, 0, randomMintoMay2.length-1);
		quicksort(randomMintoMay3, 0, randomMintoMay3.length-1);
		quicksort(randomMaytoMin1,0, randomMaytoMin1.length-1);
		quicksort(randomMaytoMin2,0, randomMaytoMin2.length-1);
		quicksort(randomMaytoMin3,0, randomMaytoMin3.length-1);




		System.out.println("Pasos en burbuja");
		imprimir(bubbleSort);
		System.out.println("Pasos en insertion ");
		imprimir(insertionSort);
		System.out.println("Pasos en selection");
		imprimir(selectionSort);
		System.out.println("Pasos en quickSort");
		imprimir(selectionSort);

		System.out.println("tiempo en burbuja");
		imprimirtime(timebubbleSort);
		System.out.println("tiempo en insertion ");
		imprimirtime(timeinsertionSort);
		System.out.println("tiempo en selection");
		imprimirtime(timeselectionSort);
		System.out.println("tiempo en quickSort");
		imprimirtime(timeselectionSort);




		/*float n;
		n = java.lang.System.currentTimeMillis();
		System.out.println(n);
		float n2 = java.lang.System.currentTimeMillis();
		n = n2 - n;
		System.out.println(n);
		
		
		System.out.println("arreglo");
		for(int i = 0; i<n; i++){	
			random1[i] = (int) (Math.random() * (100 + 1));
			System.out.println(random1[i]);

		}
		
		insertionSort(random1);
		System.out.println("arreglo arreglado :v");
		for(int i = 0; i<n; i++){
			System.out.println(random1[i]);

		}*/
		

	}	

	public static void imprimir(int arreglo[]){
		for(int i = 0; i<arreglo.length; i++){
			if(i<4 && i>=0){
				System.out.println("arreglo random: " + arreglo[i] );
			}
			if(i<7 && i>=4){
				System.out.println("arreglo menor a mayor:  " + arreglo[i] );
			}
			if(i<10 && i>=7){
				System.out.println("arreglo mayor a menor: " + arreglo[i] );
			}
		}
	}	
	public static void imprimirtime(float arreglo[]){
		for(int i = 0; i<arreglo.length; i++){
			if(i<4 && i>=0){
				System.out.println("arreglo random: " + arreglo[i] );
			}
			if(i<7 && i>=4){
				System.out.println("arreglo menor a mayor:  " + arreglo[i] );
			}
			if(i<10 && i>=7	){
				System.out.println("arreglo mayor a menor: " + arreglo[i] );
			}
		}
	}	

	public static void insertData(int arreglo[], int randomData){


		switch (randomData){
			case 1:for(int i= 0; i<arreglo.length; i++){
			arreglo[i]= (int) (Math.random() * (100 + 1));
		}
			break;

			case 2:for(int i= 0; i<arreglo.length; i++){
			arreglo[i]= (int) (Math.random() * ((i+10) + i));
		}
			break;

			case 3:for(int i= 0; i<arreglo.length; i++){
			arreglo[i]= (int) (Math.random() * (i + (i+10)));
		}
			break;
			default:System.out.println("no se puede generar valores en este arreglo");
			break;

		}
		

		

		



	}

  	


	public static int numeroRandom(){
		int n;
		n = (int) (Math.random() * (100 + 1));
		
		
		return n;


	}


	public static void insertionSortxd(int[] vec) {
  	int pasos = 0;
    int aux;
    long currentTime;
		long totalTime;
		totalTime = java.lang.System.currentTimeMillis();

    for (int i =1;i<vec.length;i++) {
      aux = vec[i];

      for(int j = i-1;j>=0;j--) {

        if(vec[j]>aux) {

        pasos++;
          vec[j+1] = vec[j];
          vec[j]=aux;
        }

      }

    }

           currentTime = java.lang.System.currentTimeMillis();
          totalTime = (currentTime - totalTime);

          insertionSort[iscounter] = pasos;
    			timeinsertionSort[iscounter] = totalTime;

    		iscounter++;


}

  

  	static void burbuja(int arreglo[]) {
  		int pasos = 0;
  		long currentTime;
		long totalTime;
		totalTime = System.currentTimeMillis();


        for(int i = 0; i < arreglo.length - 1; i++) {
            for(int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    int tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                    pasos++;
                }
            }	
        }
          currentTime = System.currentTimeMillis();
          totalTime =(currentTime - totalTime)/100000;


         bubbleSort[bscounter] = pasos;
    		timebubbleSort[bscounter] = totalTime;


    		bscounter++;


}


        /*for(int i = 0;i < arreglo.length; i++) {
            System.out.print(arreglo[i]+"\n");
        }*/
    

    public static void seleccion(int arreglo[]) {
    	long currentTime;
		long totalTime;
		totalTime = System.currentTimeMillis();


    	int pasos = 0;
          int i, j, menor, pos, tmp;
          for (i = 0; i < arreglo.length - 1; i++) {
                menor = arreglo[i]; 
                pos = i;
                for (j = i + 1; j < arreglo.length; j++) { 
                      if (arreglo[j] < menor) { 
                          menor = arreglo[j]; 
                          pos = j;
                          pasos++;
                      }
                }
                if (pos != i) { 
                    tmp = arreglo[i];
                    arreglo[i] = arreglo[pos];
                    arreglo[pos] = tmp;
                    pasos++;
                }
          }
          currentTime = System.currentTimeMillis();
          totalTime = (currentTime - totalTime)/100000;


          selectionSort[sscounter] = pasos;
    		timeselectionSort[sscounter] = totalTime;

    		sscounter++;
    	}
public static void quicksort(int A[], int izq, int der) { 

  int pivote=A[izq]; // tomamos primer elemento como pivote
  int i=izq; // i realiza la búsqueda de izquierda a derecha
  int j=der; // j realiza la búsqueda de derecha a izquierda
  int aux; 
  
  while(i<j){            // mientras no se crucen las búsquedas
     while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
     while(A[j]>pivote) j--;         // busca elemento menor que pivote
     if (i<j) {                      // si no se han cruzado                      
         aux= A[i];                  // los intercambia
         A[i]=A[j]; 
         A[j]=aux; 
     } 
   } 
   A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
   A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
   if(izq<j-1)
      quicksort(A,izq,j-1); // ordenamos subarray izquierdo
   if(j+1 <der)
      quicksort(A,j+1,der); // ordenamos subarray derecho
}
}