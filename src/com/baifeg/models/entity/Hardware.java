package com.baifeg.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hardware")
public class Hardware
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable=false)
	private String name;
	
	@Column
	private int cpu;
	
	@Column
	private int memory;
	
	@Column
	private int disk;
	
	@Column
	private int bandwidth;
	
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
	
	public int getCpu()
	{
		return cpu;
	}
	
	public void setCpu(int cpu)
	{
		this.cpu = cpu;
	}
	
	public int getMemory()
	{
		return memory;
	}
	
	public void setMemory(int memory)
	{
		this.memory = memory;
	}
	
	public int getDisk()
	{
		return disk;
	}
	
	public void setDisk(int disk)
	{
		this.disk = disk;
	}
	
	public int getBandwidth()
	{
		return bandwidth;
	}
	
	public void setBandwidth(int bandwidth)
	{
		this.bandwidth = bandwidth;
	}
	
}
