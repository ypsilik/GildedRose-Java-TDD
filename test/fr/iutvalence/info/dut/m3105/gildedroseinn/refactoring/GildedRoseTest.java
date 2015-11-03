package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{
	private Item item;
	@Test
	public void getSellInTest()
	{
		newItem();
		assertEquals(item.getSellIn(),10);
	}
	
	@Test
	public void getNameTest()
	{
		newItem();
		assertEquals(item.getName(), "item1");
	}

	private void newItem()
	{
		this.item = new Item("item1", 10, 12);
	}

}