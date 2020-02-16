import java.io.*;
import java.util.*;

class Stack1
{

static final int MAX=100;
int top=-1;

int[] stack=new int[MAX];
List<Integer> l1=new ArrayList<Integer>();
public static void main(String args[])
{
    	Stack1 s1=new Stack1();
        int c, val;
        System.out.println("1. PUSH ");
        System.out.println("2. POP ");
        System.out.println("3. DISPLAY STACK ");
        System.out.println("4. EXIT ");
        
        
    do
    {
    	System.out.println("Enter Your Option: ");
    	Scanner s=new Scanner(System.in);
        c=s.nextInt();
        switch(c)
        {
            case 1: System.out.println("Enter the value to be added to the stack: ");
                    val=s.nextInt();
                    s1.push(val);
                    break;

            case 2: s1.pop();
                    break;
                
            
            case 3: s1.display();
                    break;
            case 4: System.out.println("Exit");
            		break;
        }
    }while(c!=4);

}

public void push(int val)
{
    if(top==MAX-1)
    {
        System.out.println("Stack is FULL!");
    }
    else
    {
        top++;
        stack[top]=val;
        System.out.println("Element added to the stack is: "+val);
    }
}

public void pop()
{
    int x;
    if(top==-1)
    {
        System.out.println("Stack is EMPTY!");
    }
    else
    {
        x=stack[top];
        System.out.println("The element deleted from the stack is: "+x);
        top--;
    }
}

public void display()
{
    int i;
    if(top==-1)
    System.out.println("STACK IS EMPTY!");
    else
    {
        for(i=top; i>=0; i--)
        System.out.println("The elements in the stack are: "+stack[i]);
    }

}

}