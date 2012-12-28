package com.genmymodel.shoppingcart.domain;

import com.genmymodel.shoppingcart.domain.OrderStatus;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
@Table(name = "ORDERTABLE")
public class Order
{

	
	@ManyToOne
	private Account account;
	
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private Long id;
	
	@Column(name = "NUMBERCOLUMN")
	private java.util.Date number;
	
	
	private java.util.Date ordered;
	
	
	private Double shipTo;
	
	
	private String shipped;
	
	
	private String status;
	
	
	private com.genmymodel.shoppingcart.domain.OrderStatus total;
    

	
	public Account getAccount () 
	{
		return this.account;	
	}

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public java.util.Date getNumber () 
	{
		return this.number;	
	}

	
	public java.util.Date getOrdered () 
	{
		return this.ordered;	
	}

	
	public Double getShipTo () 
	{
		return this.shipTo;	
	}

	
	public String getShipped () 
	{
		return this.shipped;	
	}

	
	public String getStatus () 
	{
		return this.status;	
	}

	
	public com.genmymodel.shoppingcart.domain.OrderStatus getTotal () 
	{
		return this.total;	
	}

	
	public void setAccount (Account myAccount) 
	{
		if (this.account != myAccount) {
			Account oldaccount = this.account;
			this.account = myAccount;
			if (oldaccount != null)
				oldaccount.removeOrder (this);
			if (myAccount != null)
				myAccount.addOrder (this);
		}	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setNumber (java.util.Date myNumber) 
	{
		this.number = myNumber;	
	}

	
	public void setOrdered (java.util.Date myOrdered) 
	{
		this.ordered = myOrdered;	
	}

	
	public void setShipTo (Double myShipTo) 
	{
		this.shipTo = myShipTo;	
	}

	
	public void setShipped (String myShipped) 
	{
		this.shipped = myShipped;	
	}

	
	public void setStatus (String myStatus) 
	{
		this.status = myStatus;	
	}

	
	public void setTotal (com.genmymodel.shoppingcart.domain.OrderStatus myTotal) 
	{
		this.total = myTotal;	
	}

	
	public void unsetAccount () 
	{
		if (this.account == null)
			return;
		Account oldaccount = this.account;
		this.account = null;
		oldaccount.removeOrder (this);	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetNumber () 
	{
		this.number = null;	
	}

	
	public void unsetOrdered () 
	{
		this.ordered = null;	
	}

	
	public void unsetShipTo () 
	{
		this.shipTo = null;	
	}

	
	public void unsetShipped () 
	{
		this.shipped = null;	
	}

	
	public void unsetStatus () 
	{
		this.status = null;	
	}

	
	public void unsetTotal () 
	{
		this.total = null;	
	}


}
