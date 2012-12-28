package com.genmymodel.shoppingcart.domain;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


@Entity
public class Payment
{

	
	@ManyToOne
	private Account account;
	
	
	private String details;
	
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private Long id;
	
	
	private Double paidDate;
	
	
	private String total;
    

	
	public Account getAccount () 
	{
		return this.account;	
	}

	
	public String getDetails () 
	{
		return this.details;	
	}

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public Double getPaidDate () 
	{
		return this.paidDate;	
	}

	
	public String getTotal () 
	{
		return this.total;	
	}

	
	public void setAccount (Account myAccount) 
	{
		if (this.account != myAccount) {
			Account oldaccount = this.account;
			this.account = myAccount;
			if (oldaccount != null)
				oldaccount.removePayment (this);
			if (myAccount != null)
				myAccount.addPayment (this);
		}	
	}

	
	public void setDetails (String myDetails) 
	{
		this.details = myDetails;	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setPaidDate (Double myPaidDate) 
	{
		this.paidDate = myPaidDate;	
	}

	
	public void setTotal (String myTotal) 
	{
		this.total = myTotal;	
	}

	
	public void unsetAccount () 
	{
		if (this.account == null)
			return;
		Account oldaccount = this.account;
		this.account = null;
		oldaccount.removePayment (this);	
	}

	
	public void unsetDetails () 
	{
		this.details = null;	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetPaidDate () 
	{
		this.paidDate = null;	
	}

	
	public void unsetTotal () 
	{
		this.total = null;	
	}


}
