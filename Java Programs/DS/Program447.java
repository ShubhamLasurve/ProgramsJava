//Singly Linear Linked List in Java
import java.util.*;

class Node  //struct node
{
    public int Data;
    public Node Next;   //Reference

    public Node(int No)
    {
        this.Data = No;
        this.Next = null;
    }

}

class SinglyLL
{
    private Node Head;       //Node is the reference of Node class 
    private int Count;

    public SinglyLL()       //Constructor
    {
        Head = null;
        Count = 0;
    }

    protected void Finalize()       //This will work as Destructor
    {
        //Memory Free
    }

    public void InsertFirst(int No)
    {
        Node newn = new Node(No);     //Node creation// This will call the constructor in Node class 
        
        if(this.Head == null)
        {
            this.Head = newn;
        }
        else
        {
            newn.Next = this.Head;
            this.Head = newn;
        }
        this.Count++;
    }

    public void Display()
    {
        Node temp = this.Head;

        while(temp != null)
        {
            System.out.print("| "+temp.Data+" |->");
            temp = temp.Next;
        }
        System.out.println("NULL");
    }

    public int CountNodes()
    {
        return this.Count;
    }
}

class Program447
{
    public static void main(String A[])
    {
        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();

        int Ret = obj.CountNodes();
        System.out.println("Number of Nodes are :"+Ret);
    }
}