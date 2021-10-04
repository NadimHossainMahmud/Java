package classes;

import java.lang.*;

public class Appitizers extends FoodItem
{
	private String size ;
	
	public void setSize(String size) {this.size=size;}
	public String getSize () {return size;}
	
	public void showInfo()
	{
		System.out.println("fid is: "+fid);
		System.out.println("name is: "+name);
		System.out.println("availableQuantity: "+availableQuantity);
		System.out.println("price: "+price);
		System.out.println("size: "+size);
		System.out.println();
	}
}