import javax.swing.*;

class Principal{
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Cuantos Elementos deseas Ingresar"));

        int Valor = 0;

        Nodo Nodo = new Nodo();
        Recorridos Rec = new Recorridos();



        for (int i = 0; i < N; i++){
            Valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero"));
            Nodo.Insertar(Valor);
        }


        int Num = Integer.parseInt(JOptionPane.showInputDialog("Numero que desea buscar"));

        if( Rec.Busqueda(Nodo.getRaiz(), Num) != null){
            JOptionPane.showMessageDialog(null, "El valor se encontro");
        }else{
            JOptionPane.showMessageDialog(null, "El valor no se encontro");
        }



    }
}