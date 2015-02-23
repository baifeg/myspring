package com.baifeg.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import javax.persistence.Table;

@Entity
@Table(name = "HardwarePrice")
public class HardwarePrice
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable=false)
	private long hardwareid;
	
	@Column(nullable=false)
	private int priceperday;
	
	@Column(nullable=false)
	private Timestamp createtime;
	
	@Column(nullable=false)
	private Timestamp starttime;
	
	@Column
	private Timestamp endtime;
	
	public long getId()
	{
		return id;
	}
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	public long getHardwareid()
	{
		return hardwareid;
	}
	
	public void setHardwareid(long hardwareid)
	{
		this.hardwareid = hardwareid;
	}
	
	public int getPriceperday()
	{
		return priceperday;
	}
	
	public void setPriceperday(int priceperday)
	{
		this.priceperday = priceperday;
	}
	
	public Timestamp getCreatetime()
	{
		return createtime;
	}
	
	public void setCreatetime(Timestamp createtime)
	{
		this.createtime = createtime;
	}
	
	public Timestamp getStarttime()
	{
		return starttime;
	}
	
	public void setStarttime(Timestamp starttime)
	{
		this.starttime = starttime;
	}
	
	public Timestamp getEndtime()
	{
		return endtime;
	}
	
	public void setEndtime(Timestamp endtime)
	{
		this.endtime = endtime;
	}
	
}
