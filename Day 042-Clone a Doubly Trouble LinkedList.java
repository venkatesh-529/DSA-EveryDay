class DLLNode
{
  int data;
  DLLNode d;
  DLLNode t;
  DLLNode(int v) {data = v; d= null; t=null;}
}
class BeingZeroDLL
{
	DLLNode clone(DLLNode h){
		// Your Code Herer
        if(h==null) return null;
       Map<DLLNode,DLLNode> m=new HashMap<>();
        DLLNode temp=h;
        while(temp!=null){
            m.put(temp,new DLLNode(temp.data));
            temp=temp.d;
        } 
        temp=h;
        while(temp!=null){
            DLLNode dn=temp.d;
            DLLNode tn=temp.t;
            DLLNode curr=m.get(temp);
            curr.d=m.get(dn);
            curr.t=m.get(tn);
            temp=temp.d;
        }
        return m.get(h);
	}
}