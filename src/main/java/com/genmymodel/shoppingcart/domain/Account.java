package com.genmymodel.shoppingcart.domain;

import java.util.Set;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.OneToOne;


@Entity
public class Account
{

	
	
	private java.util.Date billingAddress;
	
	
	private Boolean closed;
	
	@OneToOne(optional = false)
	private Customer customer;
	
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private Long id;
	
	
	private String isClosed;
	
	@Column(name = "OPENCOLUMN")
	private java.util.Date open;
	
	@OneToMany(mappedBy = "account", cascade = javax.persistence.CascadeType.ALL)
	private Set<Order> order;
	
	@OneToMany(mappedBy = "account")
	private Set<Payment> payment;
    

	
	public void addOrder (Order newOrder) 
	{
		if(this.order==null) {
			this.order= new java.util.HashSet<Order>();
		}
			
		if (this.order.add (newOrder))
			newOrder.setAccount (this);
			
	}

	
	public void addPayment (Payment newPayment) 
	{
		if(this.payment==null) {
			this.payment= new java.util.HashSet<Payment>();
		}
			
		if (this.payment.add (newPayment))
			newPayment.setAccount (this);
			
	}

	
	public java.util.Date getBillingAddress () 
	{
		return this.billingAddress;	
	}

	
	public Boolean getClosed () 
	{
		return this.closed;	
	}

	
	public Customer getCustomer () 
	{
		return this.customer;	
	}

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public String getIsClosed () 
	{
		return this.isClosed;	
	}

	
	public java.util.Date getOpen () 
	{
		return this.open;	
	}

	
	public List<Order> getOrder () 
	{
		if(this.order==null) {
			this.order= new java.util.HashSet<Order>();
		}
		return java.util.Collections.unmodifiableList
					(new java.util.ArrayList<Order>(this.order));	
	}

	
	public List<Payment> getPayment () 
	{
		if(this.payment==null) {
			this.payment= new java.util.HashSet<Payment>();
		}
		return java.util.Collections.unmodifiableList
					(new java.util.ArrayList<Payment>(this.payment));	
	}

	
	public void removeOrder (Order oldOrder) 
	{
		if(this.order==null) {
			return;
		}
		
		this.order.remove (oldOrder);
			
	}

	
	public void removePayment (Payment oldPayment) 
	{
		if(this.payment==null) {
			return;
		}
		
		this.payment.remove (oldPayment);
			
	}

	
	public void setBillingAddress (java.util.Date myBillingAddress) 
	{
		this.billingAddress = myBillingAddress;	
	}

	
	public void setClosed (Boolean myClosed) 
	{
		this.closed = myClosed;	
	}

	
	public void setCustomer (Customer myCustomer) 
	{
		if (this.customer != myCustomer) {
			Customer oldcustomer = this.customer;
			this.customer = myCustomer;
			if (oldcustomer != null)
				oldcustomer.unsetAcc ();
			if (myCustomer != null)
				myCustomer.setAcc (this);
		}	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setIsClosed (String myIsClosed) 
	{
		this.isClosed = myIsClosed;	
	}

	
	public void setOpen (java.util.Date myOpen) 
	{
		this.open = myOpen;	
	}

	
	public void unsetBillingAddress () 
	{
		this.billingAddress = null;	
	}

	
	public void unsetCustomer () 
	{
		if (this.customer == null)
			return;
		Customer oldcustomer = this.customer;
		this.customer = null;
		oldcustomer.unsetAcc ();	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetIsClosed () 
	{
		this.isClosed = null;	
	}

	
	public void unsetOpen () 
	{
		this.open = null;	
	}


}
