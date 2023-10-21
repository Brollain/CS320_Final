/**
 * @author Brigitte Rollain
 * @Date 23 September 2023
 */

package TaskService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;


class taskTest {

	@Test
	void testTask() {
		Task nTask = new Task ("1234", "Keyblade", "Work in light mode.");
		assertTrue(nTask.getTaskId().equals("1234"));
		assertTrue(nTask.getTaskName().equals("Keyblade"));
		assertTrue(nTask.getTaskDesc().equals("Work in light mode."));
	}
	
	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345678901", "1-Up Mushroom", "Green life giving mushroom.");
			});
	}
	
	@Test
	void testIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "1-Up Mushroom", "Green life giving mushroom.");
			});
	}
	
	@Test
	void testNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234567890", "Purple Poison Mushroom", "Green life giving mushroom.");
			});
	}
	
	@Test
	void testNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234567890", null, "Green life giving mushroom.");
			});
	}
	
	@Test
	void testDescTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234567890", "1-Up Mushroom", "A green mushroom from the super mario brothers world.");
			});
	}
	
	@Test
	void testDescIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234567890", "1-Up Mushroom", null);
			});
	}
	
	@Test
	void testSetName(){
		Task nTask = new Task("888", "Tomatoes", "Kirby's healing tomatoes.");
		nTask.setTaskName("Maxim Tomatoes");
		assertTrue(nTask.getTaskName().equals("Maxim Tomatoes"));
	}
	
	@Test
	void testSetDesc(){
		Task nTask = new Task("888", "Tomatoes", "Kirby's healing tomatoes.");
		nTask.setTaskDesc("DreamLand's healing tomatoes.");
		assertTrue(nTask.getTaskDesc().equals("DreamLand's healing tomatoes."));
	}

}
