/**
 * @author Brigitte Rollain
 * Date: 20 September 2023
 */
package TaskService;



public class Task {
	private String taskId;
	private String taskName;
	private String taskDesc;
	
	private static final int lengthId = 10;
	private static final int lengthName = 20;
	private static final int lengthDesc = 50;
	
	/**
	 * 
	 */
	public Task(String id, String name, String desc) {
		// TODO Auto-generated constructor stub
		validateId(id);
		validateName(name);
		validateDesc(desc);
		
		this.taskId = id;
		this.taskName = name;
		this.taskDesc = desc;
	}
	
	// checks id for null or over length
	private void validateId(String id) {
		if (id == null || id.length() > lengthId) {
			throw new IllegalArgumentException("Invalid ID");
			}
		
	}
	
	
	// checks name for null or over length
	private void validateName(String name) {
		if (name == null || name.length() > lengthName) {
			throw new IllegalArgumentException("Invalid Name");
			}
	}
	
	//checks the description for null or over length
	private void validateDesc(String desc) {
		if (desc == null || desc.length() > lengthDesc) {
			throw new IllegalArgumentException("Invalid Description");
			}
			
		}
	
	// returns task id
	public String getTaskId() {
		return this.taskId;
	}
	
	// returns task name
	public String getTaskName() {
		return this.taskName;
	}
	
	// returns task description
	public String getTaskDesc() {
		return this.taskDesc;
	}
		
	// sets task name
	public void setTaskName(String name) {
		validateName(name);
					
		this.taskName = name;
	}
	
	// sets task description
	public void setTaskDesc(String desc) {
		validateDesc(desc);
				
		this.taskDesc = desc;
	}

}
