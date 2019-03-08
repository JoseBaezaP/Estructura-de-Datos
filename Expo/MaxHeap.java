public class MaxHeap{
	 private int[] Heap; 
    private int start; 
    private int capacity; 

	public MaxHeap(){
		start=1;
		capacity=10;
		Heap=new int[capacity];
	}

public void insert(int value) 
    { 
    	if (start==capacity){


    	}
    	else{
    		 Heap[start++] = value; 
    		 int child=start-1;
    		 int parent=child/2;
       
        while (Heap[parent]<  Heap[child] && parent>0) { 
            int tmp=Heap[parent];
            Heap[parent]=Heap[child];
            Heap[child]=tmp;
            child=parent;
            parent=child/2;

        } 
    	}
       
    } 

	public void print(){
		for (int i=1;i<start;i++){
			System.out.print(Heap[i]+" ");
		}
	}


}