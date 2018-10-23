package test.java;

import static org.junit.Assert.*;
import main.java.*;

import org.junit.Test;

public class AlgoTest {
	
	//Addresses node coverage and condition coverage
	@Test
	public void testBubble() {
		SortAlgos sa = new SortAlgos();
		boolean flag = true;
		Item [] vec = new Item[3];
		Item [] vecSorted = new Item[3];
		vec[0] = new Item(3);
		vec[1] = new Item(1);
		vec[2] = new Item(2);
		vecSorted[0] = new Item(1);
		vecSorted[1] = new Item(2);
		vecSorted[2] = new Item(3);
		sa.bubbleSort(vec);
		
		for(int i =0;i<vec.length;i++)
		{
			if(vec[i].key!=vecSorted[i].key)
			{
				flag = false;
				break;
			}
		}
		assertTrue(".....The array is sorted", flag==true);
	}
	//Addresses Edge coverage
	@Test
	public void testBubbleNull() {
		SortAlgos sa = new SortAlgos();
		Item [] vec = null;
		try{
			sa.bubbleSort(vec);	
		}
		catch(Exception e)
		{
			assertTrue(".....The array is null", true);	
		}
	}
	
	//Addresses node coverage and condition coverage
	@Test
	public void testSelection() {
		SortAlgos sa = new SortAlgos();
		boolean flag = true;
		Item [] vec = new Item[3];
		Item [] vecSorted = new Item[3];
		vec[0] = new Item(3);
		vec[1] = new Item(1);
		vec[2] = new Item(2);
		vecSorted[0] = new Item(1);
		vecSorted[1] = new Item(2);
		vecSorted[2] = new Item(3);
		sa.selectionSort(vec);
		
		for(int i =0;i<vec.length;i++)
		{
			if(vec[i].key!=vecSorted[i].key)
			{
				flag = false;
				break;
			}
		}
		assertTrue(".....The array is sorted", flag==true);
	}
	//Addresses Edge coverage
	@Test
	public void testSelectionNull() {
		SortAlgos sa = new SortAlgos();
		Item [] vec = null;
		try{
			sa.selectionSort(vec);	
		}
		catch(Exception e)
		{
			assertTrue(".....The array is null", true);	
		}
	}
	
	//Addresses node coverage and condition coverage
	@Test
	public void testInsertion() {
		SortAlgos sa = new SortAlgos();
		boolean flag = true;
		Item [] vec = new Item[3];
		Item [] vecSorted = new Item[3];
		vec[0] = new Item(3);
		vec[1] = new Item(1);
		vec[2] = new Item(2);
		vecSorted[0] = new Item(1);
		vecSorted[1] = new Item(2);
		vecSorted[2] = new Item(3);
		sa.insertionSort(vec);
		
		for(int i =0;i<vec.length;i++)
		{
			if(vec[i].key!=vecSorted[i].key)
			{
				flag = false;
				break;
			}
		}
		assertTrue(".....The array is sorted", flag==true);
	}
	//Addresses Edge coverage
	@Test
	public void testInsertionNull() {
		SortAlgos sa = new SortAlgos();
		Item [] vec = null;
		try{
			sa.insertionSort(vec);	
		}
		catch(Exception e)
		{
			assertTrue(".....The array is null", true);	
		}
	}
	
	//Addresses node coverage and condition coverage
	@Test
	public void testMerge() {
		SortAlgos sa = new SortAlgos();
		boolean flag = true;
		Item [] vec = new Item[3];
		Item [] vecSorted = new Item[3];
		vec[0] = new Item(3);
		vec[1] = new Item(1);
		vec[2] = new Item(2);
		vecSorted[0] = new Item(1);
		vecSorted[1] = new Item(2);
		vecSorted[2] = new Item(3);
		sa.mergeSort(vec);
		
		for(int i =0;i<vec.length;i++)
		{
			if(vec[i].key!=vecSorted[i].key)
			{
				flag = false;
				break;
			}
		}
		assertTrue(".....The array is sorted", flag==true);
	}
	//Addresses Edge coverage
	@Test
	public void testMergeNull() {
		SortAlgos sa = new SortAlgos();
		Item [] vec = null;
		try{
			sa.mergeSort(vec);	
		}
		catch(Exception e)
		{
			assertTrue(".....The array is null", true);	
		}
	}
	
	//Addresses node coverage and condition coverage
	@Test
	public void testQuick() {
		SortAlgos sa = new SortAlgos();
		boolean flag = true;
		Item [] vec = new Item[3];
		Item [] vecSorted = new Item[3];
		vec[0] = new Item(3);
		vec[1] = new Item(1);
		vec[2] = new Item(2);
		vecSorted[0] = new Item(1);
		vecSorted[1] = new Item(2);
		vecSorted[2] = new Item(3);
		sa.quickSort(vec);
		
		for(int i =0;i<vec.length;i++)
		{
			if(vec[i].key!=vecSorted[i].key)
			{
				flag = false;
				break;
			}
		}
		assertTrue(".....The array is sorted", flag==true);
	}
	//Addresses Edge coverage
	@Test
	public void testQuickNull() {
		SortAlgos sa = new SortAlgos();
		Item [] vec = null;
		try{
			sa.quickSort(vec);	
		}
		catch(Exception e)
		{
			assertTrue(".....The array is null", true);	
		}
	}
	
	//Addresses node coverage and condition coverage
	@Test
	public void testHeap() {
		SortAlgos sa = new SortAlgos();
		boolean flag = true;
		Item [] vec = new Item[3];
		Item [] vecSorted = new Item[3];
		vec[0] = new Item(3);
		vec[1] = new Item(1);
		vec[2] = new Item(2);
		vecSorted[0] = new Item(1);
		vecSorted[1] = new Item(2);
		vecSorted[2] = new Item(3);
		sa.heapSort(vec);
		
		for(int i =0;i<vec.length;i++)
		{
			if(vec[i].key!=vecSorted[i].key)
			{
				flag = false;
				break;
			}
		}
		assertTrue(".....The array is sorted", flag==true);
	}
	//Addresses Edge coverage
	@Test
	public void testHeapNull() {
		SortAlgos sa = new SortAlgos();
		Item [] vec = null;
		try{
			sa.heapSort(vec);	
		}
		catch(Exception e)
		{
			assertTrue(".....The array is null", true);	
		}
	}
}
