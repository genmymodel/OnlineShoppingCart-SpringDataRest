package com.genmymodel.shoppingcart.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.OneToOne;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
public class LineItem
{

	
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private Long id;
	
	
	private Double price;
	
	@OneToOne(optional = false)
	private Product product;
	
	
	private Integer quantity;
	
	@ManyToOne
	private ShoppinCart sc;
    

	
	public Long getId () 
	{
		return this.id;	
	}

	
	public Double getPrice () 
	{
		return this.price;	
	}

	
	public Product getProduct () 
	{
		return this.product;	
	}

	
	public Integer getQuantity () 
	{
		return this.quantity;	
	}

	
	public ShoppinCart getSc () 
	{
		return this.sc;	
	}

	
	public void setId (Long myId) 
	{
		this.id = myId;	
	}

	
	public void setPrice (Double myPrice) 
	{
		this.price = myPrice;	
	}

	
	public void setProduct (Product myProduct) 
	{
		if (this.product != myProduct) {
			Product oldproduct = this.product;
			this.product = myProduct;
			if (oldproduct != null)
				oldproduct.unsetItem ();
			if (myProduct != null)
				myProduct.setItem (this);
		}	
	}

	
	public void setQuantity (Integer myQuantity) 
	{
		this.quantity = myQuantity;	
	}

	
	public void setSc (ShoppinCart mySc) 
	{
		if (this.sc != mySc) {
			ShoppinCart oldsc = this.sc;
			this.sc = mySc;
			if (oldsc != null)
				oldsc.removeItem (this);
			if (mySc != null)
				mySc.addItem (this);
		}	
	}

	
	public void unsetId () 
	{
		this.id = null;	
	}

	
	public void unsetPrice () 
	{
		this.price = null;	
	}

	
	public void unsetProduct () 
	{
		if (this.product == null)
			return;
		Product oldproduct = this.product;
		this.product = null;
		oldproduct.unsetItem ();	
	}

	
	public void unsetQuantity () 
	{
		this.quantity = null;	
	}

	
	public void unsetSc () 
	{
		if (this.sc == null)
			return;
		ShoppinCart oldsc = this.sc;
		this.sc = null;
		oldsc.removeItem (this);	
	}


}
