public class Juego{
	public static void main(String[] args) {

	 	int k=(int) (Math.random() * (100 + 1));
	 	int b=(int) (Math.random() * (100 + 1));
	 	int start=100;
	 	int prev=1;
	 	System.out.println("El numero secreto es: "+k);
	 	for (int i=0;;i++){
	 		if (b==k){
	 			System.out.println("ya se encontro el numero"+ b);
	 			break;
	 		}
	 		else{
	 			if (k>b){
	 					prev=b+1;
	 					System.out.println(b);
	 					b=(prev+start)/2;
	 			}
	 			else{
	 					start=b-1;
	 					System.out.println(b);
	 					b=(prev+start)/2;
	 			}
	 		}
	 	}
	}

}     