package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class ItemTest
{
	private Item item;
	
	@Test
	public void getNameTest()
	{
		newItem();
		assertEquals(this.item.getName(), "item1");
	}
	
	@Test
	public void getSellInTest()
	{
		newItem();
		assertEquals(this.item.getSellIn(),10);
	}
	
	@Test
	public void getQualityTest()
	{
		newItem();
		assertEquals(this.item.getQuality(), 12);
	}
	
	private void newItem()
	{
		this.item = new Item("item1", 10, 12);
	}
	
}
