
package classes;

import java.lang.*;

public class Appitizers extends MainDish 
{
	private String category ;
	
	public void setCategory(String category) {this.category=category;}
	public String getCategory( ) {return category;}
	
	public void showInfo()
	{
		System.out.println("fid is: "+fid);
		System.out.println("name is: "+name);
		System.out.println("availableQuantity: "+availableQuantity);
		System.out.println("price: "+price);
		System.out.println("category: "+category);
		System.out.println();
	}
	
}