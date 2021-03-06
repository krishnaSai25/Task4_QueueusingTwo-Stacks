import java.io.*;
import java.util.*;

public class Queue {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int elements=sc.nextInt();
       Stack<Integer> stack_1=new Stack<>();//Creating Stack1
       Stack<Integer> stack_2=new Stack<>();//Creating Stack2
       int ele,temp;
       for(int i=0;i<elements;i++)
       {
           int choice=sc.nextInt();
           switch(choice) // Switching Based On the Choice
           {
               case 1:
               ele=sc.nextInt();
               stack_1.push(ele);// Pushing Element into Stack
               break;
               case 2:
               if(stack_2.isEmpty())// Checking Whether the stack is empty 
               {
                   while(!stack_1.isEmpty())
                   {
                       temp=stack_1.pop();//poping the element into temp variable 
                       stack_2.push(temp);//and pushing the element into stack 2
                   }
               }
               if(stack_2.isEmpty()==false)
               {
                   stack_2.pop();
               }
               break;
               case 3:
               if(stack_2.isEmpty()==false)
                {
                    System.out.println(stack_2.peek());// displaying the peek most element from the stack
                  
                } 
                else 
                {
                    while(!stack_1.isEmpty())
                    {
                        temp=stack_1.pop();//poping the element into temp variable
                        stack_2.push(temp);//and pushing the element into stack 2
                    }
                    System.out.println(stack_2.peek());// displaying the peek most element from the stack
                }
               break;
           }
       }
    }
}

