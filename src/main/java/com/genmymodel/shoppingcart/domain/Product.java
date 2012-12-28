package com.genmymodel.shoppingcart.domain;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;


@Entity
public class Product
{

	
	
	private String description;
	
	@Column(name = "IDCOLUMN")
	private Long id;
	
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private Long id;
	
	@OneToOne(optional = false)
	private LineItem item;
	
	@Column(name = "NAMECOLUMN")
	private String name;
    

	
	public String getDescription () 
	{
		return this.description;	
	}

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public LineItem getItem () 
	{
		return this.item;	
	}

	
	public String getName () 
	{
		return this.name;	
	}

	
	public void setDescription (String myDescription) 
	{
		this.description = myDescription;	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setItem (LineItem myItem) 
	{
		if (this.item != myItem) {
			LineItem olditem = this.item;
			this.item = myItem;
			if (olditem != null)
				olditem.unsetProduct ();
			if (myItem != null)
				myItem.setProduct (this);
		}	
	}

	
	public void setName (String myName) 
	{
		this.name = myName;	
	}

	
	public void unsetDescription () 
	{
		this.description = null;	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetItem () 
	{
		if (this.item == null)
			return;
		LineItem olditem = this.item;
		this.item = null;
		olditem.unsetProduct ();	
	}

	
	public void unsetName () 
	{
		this.name = null;	
	}


}
