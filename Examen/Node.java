	public class Node
	{
		//Declare class variables
		private Node next;
		private Object data;

		public void setLink(Node X){
           this.next=X;
		}

		public Node getLink(){
			return this.next;
		}
		
		public Node(Object dat)
		{
			data = dat;
		}
		public void setData(Object _Data)
		{
			this.data= _Data;
		}
		public int getData()
		{
			int num = (int)data;
			return num;
		}
	}