package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Order;
import beans.Orders;

/**
 * Session Bean implementation class AnotherOrdersBusinessService
 */
@Stateless
@Local(OrdersBusinessInterface.class)
@LocalBean
@Alternative
public class AnotherOrdersBusinessService implements OrdersBusinessInterface {

public List<Order> orders = new ArrayList<Order>();
	
	public AnotherOrdersBusinessService() 
	{
		orders.add(new Order("867", "Another Stitch Plushie", 12.99f, 2));
		orders.add(new Order("530", "Another Pua Plushie", 15.99f, 2));
		orders.add(new Order("911", "Another Hay-Hay Plushie", 16.99f, 2));
		orders.add(new Order("563", "Another Pusheen Plushie", 13.99f, 2));
		orders.add(new Order("479", "Another Llama Plushie", 10.99f, 2));
		orders.add(new Order("123", "Another R2D2 Plushie", 18.99f, 2));
	}

    public void Test() 
    {
        System.out.println("Hello from AnotherOrdersBusinessService");
    }

	@Override
	public List<Order> getOrders() 
	{
		return orders;
	}

	@Override
	public void setOrders(List<Order> orders) 
	{
		this.orders = orders;
	}

}
