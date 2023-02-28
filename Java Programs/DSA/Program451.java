import java.util.*;

class Node
{
    public int Data;
    public Node Next;

    public Node(int No)
    {
        this.Data = No;
        this.Next = null;
    }
}

class SinglyLL
{
    private Node Head;
    private int Count;

    public SinglyLL()
    {
        Head = null;
        Count = 0;
    }

    protected void finalize()
    {
        // Memory free
    }

    public void InsertFirst(int No)
    {
        Node newn = new Node(No);

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

    public void InsertLast(int No)
    {
        Node newn = new Node(No);

        if(this.Head == null)
        {
            this.Head = newn;
        }
        else
        {
            Node temp = Head;
            while(temp.Next != null)
            {
                temp = temp.Next;
            }
            temp.Next = newn;
        }
        this.Count++;        
    }

    public void DeleteFirst()
    {
        if(this.Count == 1)       //LL is empty
        {
            return;
        }
        else if(this.Count == 1)
        {
            this.Head = null;
        }
        else
        {
            Head = Head.Next;
        }
        this.Count--;
    }

    public void DeleteLast()
    {
        if(this.Count == 1)       //LL is empty
        {
            return;
        }
        else if(this.Count == 1)
        {
            this.Head = null;
        }
        else
        {
            Node temp = Head;

            while(temp.Next.Next != null)
            {
                temp = temp.Next;
            }
            temp.Next = null;
        }
        this.Count--;
    }

    public void InsertAtPos(int No, int ipos)
    {
        if((ipos < 1) || (ipos > Count))
        {
            System.out.println("Invalid Position");
        }

        if(ipos == 1)
        {
            InsertFirst(No);
        }
        else if(ipos == Count+1)
        {
            InsertLast(No);
        }
        else
        {
            Node newn = new Node(No);

            Node temp = Head;

            for(int i = 1; i < ipos-1; i++)
            {
                temp = temp.Next;
            }

            newn.Next = temp.Next;
            temp.Next = newn;

            Count++;
        }
    }

    public void DeleteAtPos(int ipos)
    {
        if((ipos < 1) || (ipos > Count))
        {
            System.out.println("Invalid Position");
        }

        if(ipos == 1)
        {
            DeleteFirst();
        }
        else if(ipos == Count+1)
        {
            DeleteLast();
        }
        else
        {
            for(int i = 1; i < ipos-1; i++)
            {
                temp = temp.Next;
            }
            
            temp.Next = temp.Next.Next;

            Count--;
        }

    }
}

class Program451
{
    public static void main(String Arg[])
    {
        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);
        obj.InsertLast(151);

        obj.DeleteFirst();
        obj.DeleteLast();

        obj.Display();

        int ret = obj.CountNodes();

        System.out.println("Number of nodes are : "+ret);
    }
}