package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity{
	
	long id;
	String name;
	private static List<Team> teams = new ArrayList<Team>();
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	private Game() 
	{
		this.id = 0;
		this.name = "N/A";
	}

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		this();
		this.id = id;
		this.name = name;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	public Team addTeam(String name) 
	{
		Team team = null;
		for(Team currentteam : teams) 
		{
			if(currentteam.getName() == name) 
			{
				return currentteam;
			}
		}
		if(team == null) 
		{
			team = new Team(id++,name);
			teams.add(team);
		}
		return team;
	}
	//code to search for team instance using name
	public Team getTeam(String name) 
	{
		Team team = null;
		for(Team currentteam : teams)
		{
			if(currentteam.getName() == name) 
			{
				team = currentteam;
			}
		}
		return team;
	}
	@Override
	public String toString() {
		
		return "Game [id=" + id + ", name=" + name + "]";
	}

}
