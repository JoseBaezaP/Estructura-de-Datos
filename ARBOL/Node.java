public class Node {
	private int data;
	private Node father;
	private Node hizq;
	private Node hder;
	
	Node (int dat){
		this.data = dat;
		this.father = null;
		this.hizq = null;
		this.hder = null;
	}

	public void setData(int dat){
        this.data = dat;
    }

    public void setFather(Node padre){
        this.father = padre;
    }

	public void setHijoI(Node hijoI){
        this.hizq = hijoI;
    }

    public void setHijoD(Node hijoD){
        this.hder = hijoD;
    }    

    public int getData(){
        return this.data;
    }

    public Node getFather(){
        return this.father;
    }

    public Node getHijoI(){
        return hizq;
    } 

    public Node getHijoD(){
        return hder;
    }

    public void addNode(int dat, Node root){
    	Node newNode = new Node(dat);
    	findPlace(newNode, root);
    }

    public void findPlace(Node newNode, Node dad){
    	if (newNode.getData() < dad.getData()){
    		if (dad.getHijoI() == null){
    			dad.setHijoI(newNode);
    		} else {
    			findPlace (newNode, dad.getHijoI());
    		}
    	} else {
    		if (newNode.getData() > dad.getData()){
    			if (dad.getHijoD() == null){
    			dad.setHijoD(newNode);
    		} else {
    			findPlace(newNode, dad.getHijoD());
    		}
    	}
    	}
    }

}