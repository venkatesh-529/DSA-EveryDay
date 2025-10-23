import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class SLLNode{
	int data;
	SLLNode next;
	SLLNode(int d){
		data = d;
		next = null;
	}
};

class BeingZero{
	public boolean isPalindromic(SLLNode a) {
        if(a==null || a.next==null) return true;
        SLLNode s=a;
        SLLNode f=a;
        while(f!=null && f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        //System.out.println(s.data);
        SLLNode sec=reverse(s.next);
        SLLNode fir=a;
        while(sec!=null){
            if(fir.data!=sec.data){
                return false;
            }
            fir=fir.next;
            sec=sec.next;
        }
        return true;
	}
    SLLNode reverse(SLLNode h){
        SLLNode prev=null;
        SLLNode temp=h; 
        while(temp!=null){
            SLLNode f=temp.next;
            temp.next=prev;
            prev=temp;
            temp=f;
        }
        // SLLNode t=prev.next;
        // while(t!=null){
        //     System.out.println(t.data);
        //     t=t.next;
        // }
        return prev;
    }
}