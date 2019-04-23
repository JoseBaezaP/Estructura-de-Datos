public class Recorridos{

  int Cont = 0;
    Recorridos(){

    }

    public void Preorden(Nodo Nodo) {
        if (Nodo != null) {
          System.out.print(Nodo.getValor() + " - ");
          Preorden(Nodo.getHijoI());
          Preorden(Nodo.getHijoD());
        }
      }
    
      public void Inorden(Nodo Nodo) {
        if (Nodo != null) {
          Inorden(Nodo.getHijoI());
          System.out.print(Nodo.getValor() + " - ");
          Inorden( Nodo.getHijoD() );
        }
      }
    
      public void Posorden(Nodo Nodo) {
        if (Nodo != null) {
          Posorden(Nodo.getHijoI());
          Posorden(Nodo.getHijoD());
          System.out.print(Nodo.getValor() + " - ");
    
        }
      }



      public Nodo Busqueda(Nodo Raiz, int Valor){ 
        // Base Cases: root is null or key is present at root 
        if (Raiz==null || Raiz.getValor()==Valor) 
        return Raiz;
  
        // val is greater than root's key 
        if (Raiz.getValor() > Valor)
        return Busqueda(Raiz.getHijoI(), Valor); 
  
        // val is less than root's key 
        return Busqueda(Raiz.getHijoD(), Valor);
    }


    
} 

