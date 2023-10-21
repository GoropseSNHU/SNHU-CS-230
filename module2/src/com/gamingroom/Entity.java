package com.gamingroom;

public class Entity 
{
	long id;
	String name;
	//initial constructor, i tried to make it private but it caused an error
	public Entity() 
	{
	}
	//constructor with name
	public Entity(long id, String name) 
	{
		this();
		this.id = id;
		this.name = name;
	}
	//method for getting name
	public String getName() 
	{
		return name;
	}
	//method for getting id
	public long getID() 
	{
		return id;
	}
	
	@Override
	public String toString() 
	{
		return "Entity ID: " + id + ", Entity Name: " + name + "\n";
	}
}
