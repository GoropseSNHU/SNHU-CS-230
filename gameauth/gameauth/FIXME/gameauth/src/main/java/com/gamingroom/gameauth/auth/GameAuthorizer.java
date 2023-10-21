package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;

public class GameAuthorizer implements Authorizer<GameUser> 
{
    @Override
    public boolean authorize(GameUser user, String role) {
    	
        // authorize method based on BasicAuth Security Example
    	if(user.getRoles().contains(role) && user.getRoles() != null) 
    	{
    		return true;
    	}
    	return false;
    	
    }
}