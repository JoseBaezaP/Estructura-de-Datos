public class Nodo{
    private Nodo Raiz;
    private Nodo HijoD;
    private Nodo HijoI;
    private int Valor;

    Nodo(){}

    Nodo(int Valor){
        this.Valor = Valor;
        this.HijoD = null;
        this.HijoI = null;
    }



    public void SetNombre(int Valor){
        this.Valor = Valor;
    }

    public void SetRaiz(Nodo Raiz){
        this.Raiz = Raiz;
    }

    public void SetHijoD(Nodo HijoD){
        this.HijoD = HijoD;
    }

    public void SetHijoI(Nodo HijoI){
        this.HijoI = HijoI;
    }


    public int getValor(){
        return Valor;
    }


    public Nodo getRaiz(){
        return Raiz;
    }

    public Nodo getHijoD(){
        return HijoD;
    }


    public Nodo getHijoI(){
        return HijoI;
    } 



    public void Insertar(int Valor) { 
        Raiz = InsertarRec(Raiz, Valor); 
     } 
       
     /* A recursive function to insert a new key in BST */
    public Nodo InsertarRec(Nodo Raiz, int Valor) { 
   
         /* If the tree is empty, return a new node */
         if (Raiz == null) { 
             Raiz = new Nodo(Valor); 
             return Raiz; 
         } 
   
         /* Otherwise, recur down the tree */
         if (Valor < Raiz.getValor()) 
             Raiz.SetHijoI(InsertarRec(Raiz.getHijoI(), Valor));
         else if (Valor > Raiz.getValor()) 
             Raiz.SetHijoD(InsertarRec(Raiz.getHijoD(), Valor)); 
   
         /* return the (unchanged) node pointer */
         return Raiz; 
     } 

}