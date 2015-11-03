package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class GildedRoseTest
{
	private ArrayList<Item> listItems;
	
	@Test
	public void updateItemsTest() 
	{
		GildedRose.updateItems(listItems);
		for (Item item : listItems)
		{
			assertEquals(item.getSellIn(), 9);
		}
	}
	
	@Before
	public void newListItem()
	{
		this.listItems = new ArrayList<Item>(); 
		this.listItems.add(new Item("item1", 10, 12));
		this.listItems.add(new Item("item2", 10, 12));
		this.listItems.add(new Item("item3", 10, 12));
		this.listItems.add(new Item("item4", 10, 12));
		this.listItems.add(new Item("item5", 10, 12));
	}
}