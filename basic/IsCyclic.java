/*
Problem: 		cyclic,loop,huilu
Alg/struture:	
Idea:			
Example:
132=>132,null=>32,1=>2,31=>null,231
Time, Space:	O(n), O(1)		
*/

    
    public boolean isLoop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
                return true;
        }
        
        return false;
    }
