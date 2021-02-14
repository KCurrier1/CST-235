package controllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import beans.User;
import business.MyTimerService;
import business.OrdersBusinessInterface;

@ManagedBean
@ViewScoped
public class FormController 
{
	@Inject
	OrdersBusinessInterface service;
	@EJB
	MyTimerService timer;
	
    public String onSubmit(User user) 
    {
    	service.Test();
        System.out.println("Submit Clicked");
        System.out.println("FirstName" + user.getFirstName());
        System.out.println("LastName" + user.getLastName());

        FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);

        timer.setTimer(10000);
        
        return "TestResponse.xhtml";
    }
    public OrdersBusinessInterface getService()
    {
    	return service;
    }
}