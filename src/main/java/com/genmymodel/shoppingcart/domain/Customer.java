package com.genmymodel.shoppingcart.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Customer
{

	
	@OneToOne(optional = false, cascade = javax.persistence.CascadeType.ALL)
	private Account acc;
	
	
	private String address;
	
	
	private String email;
	
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private Long id;
	
	
	private String phone;
	
	@OneToOne(optional = false)
	private WebUser webuser;
    

	
	public Account getAcc () 
	{
		return this.acc;	
	}

	
	public String getAddress () 
	{
		return this.address;	
	}

	
	public String getEmail () 
	{
		return this.email;	
	}

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public String getPhone () 
	{
		return this.phone;	
	}

	
	public WebUser getWebuser () 
	{
		return this.webuser;	
	}

	
	public void setAcc (Account myAcc) 
	{
		if (this.acc != myAcc) {
			Account oldacc = this.acc;
			this.acc = myAcc;
			if (oldacc != null)
				oldacc.unsetCustomer ();
			if (myAcc != null)
				myAcc.setCustomer (this);
		}	
	}

	
	public void setAddress (String myAddress) 
	{
		this.address = myAddress;	
	}

	
	public void setEmail (String myEmail) 
	{
		this.email = myEmail;	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setPhone (String myPhone) 
	{
		this.phone = myPhone;	
	}

	
	public void setWebuser (WebUser myWebuser) 
	{
		if (this.webuser != myWebuser) {
			WebUser oldwebuser = this.webuser;
			this.webuser = myWebuser;
			if (oldwebuser != null)
				oldwebuser.unsetCustomer ();
			if (myWebuser != null)
				myWebuser.setCustomer (this);
		}	
	}

	
	public void unsetAcc () 
	{
		if (this.acc == null)
			return;
		Account oldacc = this.acc;
		this.acc = null;
		oldacc.unsetCustomer ();	
	}

	
	public void unsetAddress () 
	{
		this.address = null;	
	}

	
	public void unsetEmail () 
	{
		this.email = null;	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetPhone () 
	{
		this.phone = null;	
	}

	
	public void unsetWebuser () 
	{
		if (this.webuser == null)
			return;
		WebUser oldwebuser = this.webuser;
		this.webuser = null;
		oldwebuser.unsetCustomer ();	
	}


}
