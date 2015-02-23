package com.baifeg.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VmMonthBill")
public class VmMonthBill
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable=false)
	private long vmid;
	
	@Column(nullable=false)
	private int year;
	
	@Column(nullable=false)
	private int month;
	
	@Column(nullable=false)
	private int usedays;
	
	@Column(nullable=false)
	private int charge;
	
	public long getId()
	{
		return id;
	}
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	public long getVmid()
	{
		return vmid;
	}
	
	public void setVmid(long vmid)
	{
		this.vmid = vmid;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setMonth(int month)
	{
		this.month = month;
	}
	
	public int getUsedays()
	{
		return usedays;
	}
	
	public void setUsedays(int usedays)
	{
		this.usedays = usedays;
	}
	
	public int getCharge()
	{
		return charge;
	}
	
	public void setCharge(int charge)
	{
		this.charge = charge;
	}
	
}
