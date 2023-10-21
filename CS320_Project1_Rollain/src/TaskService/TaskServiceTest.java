/**
 * @author Brigitte Rollain
 * @Date 23 September 2023
 */

package TaskService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TaskServiceTest {

	@Test
	void testAddTask() {
		String name = "Keyblade";
		String desc = "Replica weapon of light from KH.";
		
		TaskService cService = new TaskService();
		assertTrue(cService.tasksList.isEmpty());
		
		cService.addTask(name, desc);
		
		assertFalse(cService.tasksList.isEmpty());
		
		assertTrue(cService.tasksList.get(0).getTaskId().equals("0"));
		assertTrue(cService.tasksList.get(0).getTaskName().equals(name));
		assertTrue(cService.tasksList.get(0).getTaskDesc().equals(desc));
		
		cService.tasksList.clear();
		}
	
	@Test
	void testDeleteTask() {
		TaskService tService = new TaskService();
		assertTrue(tService.tasksList.isEmpty());
		
		tService.addTask("Badtz Maru", "Make Sanrio penguin plush."); // Task at Id 0
		tService.addTask("Among Us", "Make Imposter keychain."); // Task at Id 1
		tService.addTask("Piplup", "Make Pokemon plush."); // Task at Id 2
		
		assertTrue(tService.tasksList.size() == 3);
		
		tService.deleteTask("1");
		
		assertTrue(tService.tasksList.size() == 2);
		
		tService.tasksList.clear();
	}
	
	@Test
	void testUpdateName() {
		TaskService tService = new TaskService();
		assertTrue(tService.tasksList.isEmpty());
		
		tService.addTask("Badtz Maru", "Make Sanrio penguin plush."); // Task at Id 0
		tService.addTask("Among Us", "Make Imposter keychain."); // Task at Id 1
		tService.addTask("Piplup", "Make Pokemon plush."); // Task at Id 2
		
		assertTrue(tService.tasksList.get(0).getTaskName().equals("Badtz Maru"));
		
		tService.updateName("0", "Tuxedo Sam");
		assertTrue(tService.tasksList.get(0).getTaskName().equals("Tuxedo Sam"));
		
		tService.tasksList.clear();
		
	}
	
	@Test
	void testUpdateDesc() {
		TaskService tService = new TaskService();
		assertTrue(tService.tasksList.isEmpty());
		
		tService.addTask("Badtz Maru", "Make Sanrio penguin plush."); // Task at Id 0
		tService.addTask("Among Us", "Make Imposter keychain."); // Task at Id 1
		tService.addTask("Piplup", "Make Pokemon plush."); // Task at Id 2
		
		assertTrue(tService.tasksList.get(2).getTaskDesc().equals("Make Pokemon plush."));
		
		tService.updateDesc("2", "Adjust Pokemon plush colors.");
		assertTrue(tService.tasksList.get(2).getTaskDesc().equals("Adjust Pokemon plush colors."));
		
		tService.tasksList.clear();
		
	}
	
	@Test
	void testIsInt() {
		TaskService tService = new TaskService();
		assertTrue(tService.tasksList.isEmpty());
		
		tService.addTask("Badtz Maru", "Make Sanrio penguin plush."); // Task at Id 0
		tService.addTask("Among Us", "Make Imposter keychain."); // Task at Id 1
		tService.addTask("Piplup", "Make Pokemon plush."); // Task at Id 2
		
		assertTrue(tService.tasksList.get(2).getTaskDesc().equals("Make Pokemon plush."));
		
		tService.updateDesc("2", "Adjust Pokemon plush colors.");
		assertTrue(tService.tasksList.get(2).getTaskDesc().equals("Adjust Pokemon plush colors."));
		
		tService.tasksList.clear();
		
	}

}
