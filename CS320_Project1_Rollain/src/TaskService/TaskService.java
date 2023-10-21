package TaskService;

/**
 * @author Brigitte Rollain
 *
 */

import java.util.List;

import java.util.ArrayList;


public class TaskService {
	
	private int currentTaskId = 0;
	public List<Task> tasksList = new ArrayList<Task>();
	
	public TaskService() {
	}
	
	public void addTask(String tName, String tDesc) {
		String stringId = Integer.toString(currentTaskId);
		Task newTask = new Task(stringId, tName, tDesc);
		
		tasksList.add(currentTaskId, newTask);
		
		++currentTaskId;
	}
	
	public void deleteTask(String id) {
		int intId = Integer.parseInt(id);
		
		tasksList.remove(intId);
		
	}
	
	public void updateName (String id, String name) {
		int intId = Integer.parseInt(id);
		
		tasksList.get(intId).setTaskName(name);
	}
	
	public void updateDesc (String id, String desc) {
		int intId = Integer.parseInt(id);
		
		tasksList.get(intId).setTaskDesc(desc);
	}

}
