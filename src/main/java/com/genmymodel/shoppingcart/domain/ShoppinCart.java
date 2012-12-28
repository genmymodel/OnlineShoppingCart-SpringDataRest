package com.genmymodel.shoppingcart.domain;

import java.util.Set;
import java.util.List;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;


@Entity
public class ShoppinCart
{

	
	
	private java.util.Date creationDate;
	
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private Long id;
	
	@OneToMany(mappedBy = "sc")
	private Set<LineItem> item;
	
	@OneToOne(optional = false)
	private WebUser webuser;
    

	
	public void addItem (LineItem newItem) 
	{
		if(this.item==null) {
			this.item= new java.util.HashSet<LineItem>();
		}
			
		if (this.item.add (newItem))
			newItem.setSc (this);
			
	}

	
	public java.util.Date getCreationDate () 
	{
		return this.creationDate;	
	}

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public List<LineItem> getItem () 
	{
		if(this.item==null) {
			this.item= new java.util.HashSet<LineItem>();
		}
		return java.util.Collections.unmodifiableList
					(new java.util.ArrayList<LineItem>(this.item));	
	}

	
	public WebUser getWebuser () 
	{
		return this.webuser;	
	}

	
	public void removeItem (LineItem oldItem) 
	{
		if(this.item==null) {
			return;
		}
		
		this.item.remove (oldItem);
			
	}

	
	public void setCreationDate (java.util.Date myCreationDate) 
	{
		this.creationDate = myCreationDate;	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setWebuser (WebUser myWebuser) 
	{
		if (this.webuser != myWebuser) {
			WebUser oldwebuser = this.webuser;
			this.webuser = myWebuser;
			if (oldwebuser != null)
				oldwebuser.unsetShoppincart ();
			if (myWebuser != null)
				myWebuser.setShoppincart (this);
		}	
	}

	
	public void unsetCreationDate () 
	{
		this.creationDate = null;	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetWebuser () 
	{
		if (this.webuser == null)
			return;
		WebUser oldwebuser = this.webuser;
		this.webuser = null;
		oldwebuser.unsetShoppincart ();	
	}


}
