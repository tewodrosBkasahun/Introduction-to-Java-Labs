package studentCode;

import static org.junit.Assert.*;

import org.junit.Test;

import studentCode.AnotherExamplePerson;
import studentCode.MyPersonList;
import studentCode.Person;
import studentCode.ExamplePerson;



public class StarterTests  {

	@Test
	public void testConstructor() {
		MyPersonList localList = new MyPersonList();
		assertTrue(localList != null);
		assertTrue(localList.people != null);
		assertTrue(localList.people.size() == 0);
	}

	@Test
	public void testAdd() {
		Person p1 = new ExamplePerson("Sam");
		Person p2 = new AnotherExamplePerson("Pat");
		Person p3 = new ExamplePerson("Sasha");
		
		MyPersonList localPersonList = new MyPersonList();
		localPersonList.addItem(p1);
		localPersonList.addItem(p2);
		localPersonList.addItem(p3);
		
		assertEquals(p1, localPersonList.people.get(0));
		assertEquals(p2, localPersonList.people.get(1));
		assertEquals(p3, localPersonList.people.get(2));

	}
	@Test
	public void testGiveRaises() {
		MyPersonList x = new MyPersonList();
		x.giveRaises();
		for (Person p : x.people) {
			assertTrue(p.getSalary() == 11000);
		}

	}
}

