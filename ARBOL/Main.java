import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		
		int numElementos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos elementos desea Ingresar"));
		Node ogRoot = createTree(numElementos);

		int num = Integer.parseInt(JOptionPane.showInputDialog("Numero que desea buscar"));
		if( search(ogRoot, num) != null){
            JOptionPane.showMessageDialog(null, "El valor se encontro");
        }else{
            JOptionPane.showMessageDialog(null, "El valor no se encontro");
        }

        System.out.print("Inorden: \n");
        Inorden(ogRoot);
        System.out.print("\nPosorden: \n");
        Posorden(ogRoot);
        System.out.print("\nPreorden: \n");
        Preorden(ogRoot);

	}

	public static Node createTree (int elem){
		int data = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de tu elemento 1"));
		Node rootNode = new Node(data);
		for (int i=1; i<elem ; i++ ) {
			data = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de tu elemento "+(i+1)));
			rootNode.addNode(data, rootNode);
		}
		return rootNode;
	}

	public static Node search(Node root, int valor){ 
        if (root==null || root.getData()==valor){
        	return root;
        } 
        
        if (root.getData() > valor){
        	return search(root.getHijoI(), valor); 
        } else {
        	return search(root.getHijoD(), valor);
        }
	}

	public static void Preorden(Node node) {
        if (node != null) {
          System.out.print(node.getData() + "--");
          Preorden(node.getHijoI());
          Preorden(node.getHijoD());
        }
      }
    
      public static void Inorden(Node node) {
        if (node != null) {
          Inorden(node.getHijoI());
          System.out.print(node.getData() + "--");
          Inorden(node.getHijoD());
        }
      }
    
      public static void Posorden(Node node) {
        if (node != null) {
          Posorden(node.getHijoI());
          Posorden(node.getHijoD());
          System.out.print(node.getData() + "--");
        }
      }
}