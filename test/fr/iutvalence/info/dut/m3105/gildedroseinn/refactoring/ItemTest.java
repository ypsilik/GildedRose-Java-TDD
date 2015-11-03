package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class ItemTest
{
	private Item item;
	private ArrayList<Item> listItems;
	
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
	
	@Test
	public void updateSellInTest() 
	{
		newListItem();
		for (Item items : listItems)
		{
			assertEquals(updateSellIn(items), items.getSellIn()-1);
		}
	}
	
	private void newItem()
	{
		this.item = new Item("item1", 10, 12);
	}
		
	private void newListItem()
	{
		this.listItems = new ArrayList<Item>(); 
		this.listItems.add(new Item("item1", 10, 12));
		this.listItems.add(new Item("item2", 10, 12));
		this.listItems.add(new Item("item3", 10, 12));
		this.listItems.add(new Item("item4", 10, 12));
		this.listItems.add(new Item("item5", 10, 12));
	}
}
