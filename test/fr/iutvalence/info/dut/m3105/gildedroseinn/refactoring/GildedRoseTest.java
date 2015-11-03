package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class GildedRoseTest
{
	private ArrayList<Item> listItems;
	
	@Test
	public void updateItemsSellInTest() 
	{
		GildedRose.updateItems(listItems);
		for (Item item : listItems)
		{
			assertEquals(item.getSellIn(), 9);
		}
	}
	
	@Test
	public void updateItemsQualityTest() 
	{
		GildedRose.updateQuality(listItems);
		for (Item item : listItems)
		{
			if (item.getSellIn()==0)
			{
				assertEquals(item.getQuality(), 10);
			}
			else
			{
				assertEquals(item.getQuality(), 12);
			}
			
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