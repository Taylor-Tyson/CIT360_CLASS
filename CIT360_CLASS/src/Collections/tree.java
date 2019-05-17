/**
 * 
 */
/**
 * @author Tyson
 *
 */
package Collections;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.TreeSet;

public class tree {
	static TreeSet<String> albums = new TreeSet<String>();
	static Iterator<String> iterator = albums.iterator();
		
	/****************************************************
	 * Constructor: tree	
	 *
	 * Purpose    : Creates a default tree
	 ****************************************************/
	public tree()
	{
		albums.add("The Joshua Tree");
		albums.add("Brothers in Arms");
		albums.add("Flood");
		albums.add("Help");
		albums.add("Zooropa");
		albums.add("Unforgettable Fire");
		System.out.println("Albums have been created.");
		System.out.println();
	}
	
	/****************************************************
	 * Method     : runMethods
	 *
	 * Purpose    : this will run through the methods.
	 *
	 ****************************************************/
	private static void runMethods() {
		System.out.println("Adding new album: I am a new album");
		addAlbum("I am a new album");
		System.out.println("Deleting I am a new album");
		deleteAlbum("I am a new album");
		System.out.println("Trying to delete I am a new album again.");
		deleteAlbum("I am a new album");
		System.out.println("Clearing all albums.");
		clearAlbums();
		System.out.println("Try to clear all albums again.");
		clearAlbums();	
	}

	/****************************************************
	 * Method     : addAlbum
	 *
	 * Purpose    : This will add an album to the tree.
	 * 				It will prompt for the album name 
	 * 				to add.  
	 *
	 ****************************************************/
	private static void addAlbum(String newAlbum) 
	{
		albums.add(newAlbum);
		System.out.println(newAlbum + " has been added.");
		System.out.println();
		displayAlbum();
	}
	
	/****************************************************
	 * Method     : deleteAlbum
	 *
	 * Purpose    : This try to delete an album
	 * 				and check to see if it exists. If it does
	 * 				then it will delete it, if not then it 
	 * 				will tell the user it does not exist. 
	 *
	 ****************************************************/
	private static void deleteAlbum(String delete)
	{
		if (albums.contains(delete))
		{
			albums.remove(delete);
			System.out.println(delete + " has been deleted.");
			System.out.println();
			displayAlbum();
		}
		else
		{
			System.out.println(delete + " is not a listed album.");
		}	
	}
	
	/****************************************************
	 * Method     : clearAlbums
	 *
	 * Purpose    : This will clear all the albums.
	 *
	 ****************************************************/
	public static void clearAlbums()
	{
		try
		{
			if(albums.size() == 0)
				throw new EmptyStackException();
			else
			{
				albums.removeAll(albums);
				System.out.println("All albums are cleared.");
				displayAlbum();
			}
		}
		catch (EmptyStackException e)
		{
			System.out.println("There are no albums to clear.");
		}
	}
	
	
	/****************************************************
	 * Method     : displayAlbum
	 *
	 * Purpose    : This will display the albums
	 *
	 ****************************************************/
	public static void displayAlbum()
	{
		iterator = albums.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		System.out.println();
	}	
	
	/****************************************************
	 * Method     : main
	 *
	 * Purpose    : This gets things going.  
	 *
	 ****************************************************/
	public static void main(String[] args)
	{
		new tree();
		runMethods();
	}
}

