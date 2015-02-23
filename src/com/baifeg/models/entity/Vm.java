package com.baifeg.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import javax.persistence.Table;

@Entity
@Table(name = "Vm")
public class Vm
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private long userid;
	
	@Column(nullable=false)
	private Timestamp createtime;
	
	@Column(nullable=false)
	private int status;
	
	@Column(nullable=false)
	private long hardwareid;
	
	public long getId()
	{
		return id;
	}
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public long getUserid()
	{
		return userid;
	}
	
	public void setUserid(long userid)
	{
		this.userid = userid;
	}
	
	public Timestamp getCreatetime()
	{
		return createtime;
	}
	
	public void setCreatetime(Timestamp createtime)
	{
		this.createtime = createtime;
	}
	
	public int getStatus()
	{
		return status;
	}
	
	public void setStatus(int status)
	{
		this.status = status;
	}
	
	public long getHardwareid()
	{
		return hardwareid;
	}
	
	public void setHardwareid(long hardwareid)
	{
		this.hardwareid = hardwareid;
	}
	
}
