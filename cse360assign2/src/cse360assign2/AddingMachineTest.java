package cse360assign2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	void instantiation() {
		AddingMachine machine = new AddingMachine();
		assertNotNull(machine);
	}
	
	@Test
	void getTotal() {
		AddingMachine machine = new AddingMachine();
		assertEquals("get total does not return the actual total.",
				0, machine.getTotal());
	}
	
	@Test
	void addPositive() {
		AddingMachine machine = new AddingMachine();
		machine.add(100);
		assertEquals("Addition of positive integer doesn't work.",
				100, machine.getTotal());
	}
	
	@Test
	void addNegative() {
		AddingMachine machine = new AddingMachine();
		machine.add(-100);
		assertEquals("Addition of negative integer doesn't work.",
				-100, machine.getTotal());
	}
	
	@Test
	void subtractPositive() {
		AddingMachine machine = new AddingMachine();
		machine.subtract(87);
		assertEquals("Subtraction of positive integer doesn't work.",
				-87, machine.getTotal());
	}
	
	@Test
	void subtractNegative() {
		AddingMachine machine = new AddingMachine();
		machine.subtract(-21);
		assertEquals("Subtraction of positive integer doesn't work.",
				21, machine.getTotal());
	}
	
	@Test
	void multipleComputations() {
		AddingMachine machine = new AddingMachine();
		machine.subtract(30);
		machine.add(5);
		machine.add(10);
		machine.subtract(40);
		machine.subtract(15);
		assertEquals("Multiple computations in error.",
				-70, machine.getTotal());
	}
	
	@Test
	void printing() {
		AddingMachine machine = new AddingMachine();
		machine.subtract(30);
		machine.add(5);
		machine.add(10);
		machine.subtract(-40);
		machine.subtract(15);
		boolean result = machine.toString().equals("0 - 30 + 5 + 10 - -40 - 15");
		assertEquals("toString() in Error.",
				true, result);
	}
	
	@Test
	void clearTotal() {
		AddingMachine machine = new AddingMachine();
		machine.subtract(30);
		machine.add(5);
		machine.add(10);
		machine.subtract(-40);
		machine.subtract(15);
		machine.clear();
		assertEquals("Multiple computations in error.",
				0, machine.getTotal());
	}
	
	@Test
	void clearPrint() {
		AddingMachine machine = new AddingMachine();
		machine.subtract(30);
		machine.add(5);
		machine.add(10);
		machine.subtract(-40);
		machine.subtract(15);
		machine.clear();
		boolean result = machine.toString().equals("0");
		assertEquals("clear() in Error.",
				true, result);
	}

}
