package module2;

import java.util.ArrayList;

public class ToDoList {
	
	//Show the ToDo List
	ArrayList<String>todo = new ArrayList<String>();

	public void addTask(String item) {
		this.todo.add(item);
		
	}
	
	//Method to list all items 
	public void listAllTasks() {
	  for (int i = 0; i < this.todo.size(); i++) {
		  System.out.println((i+1) + ". " + this.todo.get(i));
	  }
		
	}//end method
	
	
	//Method to delete an item from the list
	public void deleteTask(int num) {
		this.todo.remove(num);
	}//end method

}//end class
