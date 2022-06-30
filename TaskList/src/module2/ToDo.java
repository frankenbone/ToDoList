package module2;

import java.util.*;
import java.util.ArrayList;//import the ArrayList
import java.util.Scanner;//Scanner to get input


public class ToDo {

	public static void main(String[] args) {
		
		//Initialize a To Do List
		ToDoList todo=new ToDoList(); 
		
        int flag=0; 
        while(flag==0){
        //create a menu
        System.out.println("\n******To Do List******\n");
        System.out.println("1. Add an item to the list");
        System.out.println("2. Delete an item from the list");
        System.out.println("3. Show the list of to do items");
        System.out.println("4. Stop and exit the program");
        System.out.print("\nPlease enter the number corresponding to your choice here: ");
        
        //Read the input 
        @SuppressWarnings("resource")
		Scanner input=new Scanner(System.in); //reading choice from user
        int option=input.nextInt(); input.nextLine();
        
        //setup if-then depending on choice
        if(option==1){
                System.out.println("Enter the item to the to do list:");
                String item=input.nextLine();
                todo.addTask(item);
                System.out.println("\n");
                System.out.println((item) + " has been added to your to do list");
                System.out.println("\n");
                System.out.println("Your current to do list currently is: ");
                //Want to show list as adding items
                todo.listAllTasks();
}
else if(option==2){
        todo.listAllTasks();
        System.out.print("Enter the number corresponding to the item on the to do list you would like to delete: ");
        int n=input.nextInt();
        todo.deleteTask(n-1);
        System.out.println("1 item deleted!");
        System.out.println("Your current to do list currently is: ");
        //Want to show list as we go along
        todo.listAllTasks();
        
}
else if(option==3){
		//Listing all items
        todo.listAllTasks();

}else{flag=1;}}

	}//end main

}//end class
