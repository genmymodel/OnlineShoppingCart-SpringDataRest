package com.genmymodel.shoppingcart.domain;

import com.genmymodel.shoppingcart.domain.UserState;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;


@Entity
public class WebUser
{

	
	@OneToOne(optional = false)
	private Customer customer;
	
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private Long id;
	
	
	private String login;
	
	@Column(name = "PASSWORDCOLUMN")
	private String password;
	
	@OneToOne(optional = true)
	private ShoppinCart shoppincart;
	
	@Column(name = "STATECOLUMN")
	private com.genmymodel.shoppingcart.domain.UserState state;
    

	
	public Customer getCustomer () 
	{
		return this.customer;	
	}

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public String getLogin () 
	{
		return this.login;	
	}

	
	public String getPassword () 
	{
		return this.password;	
	}

	
	public ShoppinCart getShoppincart () 
	{
		return this.shoppincart;	
	}

	
	public com.genmymodel.shoppingcart.domain.UserState getState () 
	{
		return this.state;	
	}

	
	public void setCustomer (Customer myCustomer) 
	{
		if (this.customer != myCustomer) {
			Customer oldcustomer = this.customer;
			this.customer = myCustomer;
			if (oldcustomer != null)
				oldcustomer.unsetWebuser ();
			if (myCustomer != null)
				myCustomer.setWebuser (this);
		}	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setLogin (String myLogin) 
	{
		this.login = myLogin;	
	}

	
	public void setPassword (String myPassword) 
	{
		this.password = myPassword;	
	}

	
	public void setShoppincart (ShoppinCart myShoppincart) 
	{
		if (this.shoppincart != myShoppincart) {
			ShoppinCart oldshoppincart = this.shoppincart;
			this.shoppincart = myShoppincart;
			if (oldshoppincart != null)
				oldshoppincart.unsetWebuser ();
			if (myShoppincart != null)
				myShoppincart.setWebuser (this);
		}	
	}

	
	public void setState (com.genmymodel.shoppingcart.domain.UserState myState) 
	{
		this.state = myState;	
	}

	
	public void unsetCustomer () 
	{
		if (this.customer == null)
			return;
		Customer oldcustomer = this.customer;
		this.customer = null;
		oldcustomer.unsetWebuser ();	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetLogin () 
	{
		this.login = null;	
	}

	
	public void unsetPassword () 
	{
		this.password = null;	
	}

	
	public void unsetShoppincart () 
	{
		if (this.shoppincart == null)
			return;
		ShoppinCart oldshoppincart = this.shoppincart;
		this.shoppincart = null;
		oldshoppincart.unsetWebuser ();	
	}

	
	public void unsetState () 
	{
		this.state = null;	
	}


}
