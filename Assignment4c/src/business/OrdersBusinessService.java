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
 * Session Bean implementation class OrdersBusinessService
 */
@Stateless
@Local(OrdersBusinessInterface.class)
@LocalBean
@Alternative
public class OrdersBusinessService implements OrdersBusinessInterface {

	public List<Order> orders = new ArrayList<Order>();
	
	public OrdersBusinessService() 
	{
		orders.add(new Order("867", "This Stitch Plushie", 12.99f, 2));
		orders.add(new Order("530", "This Pua Plushie", 15.99f, 2));
		orders.add(new Order("911", "This Hay-Hay Plushie", 16.99f, 2));
		orders.add(new Order("563", "This Pusheen Plushie", 13.99f, 2));
		orders.add(new Order("479", "This Llama Plushie", 10.99f, 2));
		orders.add(new Order("123", "This R2D2 Plushie", 18.99f, 2));
	}

    public void Test() 
    {
        System.out.println("Hello from the OrdersBusinessService");
    }

	@Override
	public List<Order> getOrders() 
	{
		// TODO Auto-generated method stub
		return orders;
	}

	@Override
	public void setOrders(List<Order> orders) 
	{
		// TODO Auto-generated method stub
		this.orders = orders;
	}

}
