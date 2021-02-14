package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Orders 
{
	public List<Order> orders = new ArrayList<Order>();
	
	public Orders() 
	{
		orders.add(new Order("867", "Stitch Plushie", 12.99f, 2));
		orders.add(new Order("530", "Pua Plushie", 15.99f, 2));
		orders.add(new Order("911", "Hay-Hay Plushie", 16.99f, 2));
		orders.add(new Order("563", "Pusheen Plushie", 13.99f, 2));
		orders.add(new Order("479", "Llama Plushie", 10.99f, 2));
		orders.add(new Order("123", "R2D2 Plushie", 18.99f, 2));
	}

	public List<Order> getOrders() 
	{
		return orders;
	}

	public void setOrders(List<Order> orders) 
	{
		this.orders = orders;
	}
	
	
}
