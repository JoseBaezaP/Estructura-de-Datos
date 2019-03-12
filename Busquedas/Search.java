import java.util.*;
public class Search{
	public static void main (String [] args){
		int vector[]=new int[10000];
		int num=13;
		int posicion;
		int count=0;

		
		for (int i=0;i<vector.length;i++){
			
				vector[i]=(int) (Math.random() * (100 + 1));
			
		}
		
		for (int i=0;i<vector.length;i++){
			
				if(vector[i]==num){
					
					count++;
				}
			
		}
		System.out.println("El numero se encontro "+ count+ " veces");

	}

}