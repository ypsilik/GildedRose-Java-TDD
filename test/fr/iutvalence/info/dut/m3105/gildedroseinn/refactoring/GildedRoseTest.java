package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void getSellInTest()
	{
		Item item = new Item("item1", 10, 12);
		assertEquals(item.getSellIn(),10);
	}
	
	@Test
	public void getNameTest()
	{
		Item item = new Item("item1", 10, 12);
		assertEquals(item.getName(), "item1");
	}

}