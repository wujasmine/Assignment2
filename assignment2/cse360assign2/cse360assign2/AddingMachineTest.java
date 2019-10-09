package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddingMachineTest {
	AddingMachine machine = new AddingMachine();
	@Test
	public void noTransactionTest() {
		assertEquals(0, machine.getTotal());
		assertEquals("0", machine.toString());
	}
	
	@Test
	public void addTest() {
		machine.add(10);
		assertEquals(10, machine.getTotal());
		assertEquals("0 + 10", machine.toString());
	}
	
	@Test
	public void subtractTest() {
		machine.subtract(10);
		assertEquals(-10, machine.getTotal());
		assertEquals("0 - 10", machine.toString());
	}
	
	@Test
	public void variousTransactionTest() {
		machine.add(3);
		machine.subtract(1);
		machine.add(5);
		assertEquals(7, machine.getTotal());
		assertEquals("0 + 3 - 1 + 5", machine.toString());
	}
	
	@Test
	public void clearTransactionTest() {
		machine.add(5);
		machine.clear();
		assertEquals(0, machine.getTotal());
		assertEquals("0", machine.toString());
		machine.add(1);
		assertEquals(1, machine.getTotal());
		assertEquals("0 + 1", machine.toString());
	}
}
