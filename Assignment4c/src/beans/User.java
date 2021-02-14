/**
 * 
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author sunsh
 *
 */
@ManagedBean @ViewScoped
public class User 
{
	
	@NotNull(message = "Please enter a First Name")
	@Size(min=5, max=15, message = "You must enter at least 5 characters and at most 15 characters")
	String firstName = "Kayla";
	
	@NotNull(message = "Please enter a First Name")
	@Size(min=5, max=15, message = "You must enter at least 5 characters and at most 15 characters")
	String lastName = "Currier";
	
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
