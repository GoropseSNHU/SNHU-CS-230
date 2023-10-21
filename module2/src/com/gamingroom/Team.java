package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity{
	long id;
	String name;
	private static List<Player> players = new ArrayList<Player>();
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) 
	{
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
	public Player addPlayer(String name) 
	{
		Player player = null;
		for(Player currentPlayer : players) 
		{
			if(currentPlayer.getName() == name) 
			{
				return currentPlayer;
			}
		}
		if(player == null) 
		{
			player = new Player(id++,name);
			players.add(player);
		}
		return player;
	}
	//code to search for player instance using name
	public Player getPlayer(String name) 
	{
		Player player = null;
		for(Player currentPlayer : players) 
		{
			if(currentPlayer.getName() == name) 
			{
				player = currentPlayer;
			}
		}
		return player;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}
}
