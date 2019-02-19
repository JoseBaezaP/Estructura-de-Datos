
public class Tarea
{
  public static void main(String[] args) {
    int numero = 0;
    int n=5;
    numero = (int)(Math.random() * 1000) +1;
  

    Equipos listaEquipos[] = new Equipos[n];
    listaEquipos[0] = new Equipos("Tigres",600,10);
    listaEquipos[1] = new Equipos("Aguilas",700,20);
    listaEquipos[2] = new Equipos("Castores",700,25);
    listaEquipos[3] = new Equipos("Buitres",700,20);
    listaEquipos[4] = new Equipos("Libelulas",600,15);

    
    System.out.println("El numero secreto es: "+numero);
    imprimir(listaEquipos);
    System.out.println("Ordenando:");
    cambiodevalores(listaEquipos,numero);
    insertionSort(listaEquipos);
    imprimir(listaEquipos);
  }
  public static void imprimir(Equipos[] listaEquipos)
  {
    for (int i =0;i<listaEquipos.length;i++) {

      System.out.println("Nombre del equipo: "+listaEquipos[i].getNombre()+" Numero escogido: "+listaEquipos[i].getValor() +" Segundos tardados: "+listaEquipos[i].getTiempo());
    }
  }
  public static void cambiodevalores(Equipos[] vec, int numero)
  {
    int aux=0;
    for (int i =0;i<vec.length;i++ )
    {
        aux = numero - vec[i].getValor();
        if(aux<0){
           vec[i].setValor(aux*-1);
        }
        else{
          vec[i].setValor(aux);
        }
       
    }
  }


  public static void insertionSort(Equipos[] vec)
  {
    Equipos aux;
    for (int i =1;i<vec.length;i++) {
      aux = vec[i];

      for(int j = i-1;j>=0;j--)
      {
        if(vec[j].getValor()>aux.getValor())
        {
          vec[j+1] = vec[j];
          vec[j]=aux;
        }else{
          if(vec[j].getValor() == aux.getValor() && vec[j].getTiempo()>aux.getTiempo())
          {
            vec[j+1] = vec[j];
            vec[j]=aux;
          }else{
            if(vec[j].getValor() == aux.getValor() && vec[j].getTiempo() == aux.getTiempo() && vec[j].getNombre().charAt(0)>aux.getNombre().charAt(0))
            {
              vec[j+1] = vec[j];
              vec[j]=aux;
            }
            else{
              if(vec[j].getValor() == aux.getValor() && vec[j].getTiempo() == aux.getTiempo() && vec[j].getNombre().charAt(1)>aux.getNombre().charAt(1))
              {
                vec[j+1] = vec[j];
                vec[j]=aux;
              }
            }
          }
        }


      }
      
    }
  }
}
