	public class NodePi
	{
		//Declare class variables
		private NodePi next;
		private Object data;

		public void setLink(NodePi X){
           this.next=X;
		}

		public NodePi getLink(){
			return this.next;
		}
		
		public NodePi(Object dat)
		{
			data = dat;
		}
		public void setData(Object _Data)
		{
			this.data= _Data;
		}
		public Object getData()
		{
			return data;
		}
	}