package com.codingdojo;

import java.util.ArrayList;
import com.codingdojo.models.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping( "/users")
public class UsersProjectApplication {
	private static ArrayList<User> userList = new ArrayList<User>();
	
	public static void main(String[] args) {
		userList.add( new User( "Alfredo", "Salazar", 12345 ));
		userList.add( new User( "Julieta", "Sanchez", 98765 ));
		userList.add( new User( "Marcela", "Lopez", 24242 ));
		
		SpringApplication.run(UsersProjectApplication.class, args);
	}
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
	public String getUsers() {
		String result = "<ul>";
		
		for( int i = 0; i < userList.size(); i ++ ) {
			result += "<li>" +
							userList.get( i ).getFirstName() + " " + userList.get( i ).getLastName() +
					  "</li>";
		}
		result += "</ul>";
		
		return result;
	}
	
	@RequestMapping( value = "/getUserById", method = RequestMethod.GET )
	public String getUserById( @RequestParam( value = "identifier" ) int identifier ) {
		for( int i = 0; i < userList.size(); i ++ ) {
			if( userList.get( i ).getIdentifier() == identifier ) {
				return "<h1>" + userList.get( i ).getFirstName() + " " + userList.get( i ).getLastName() +  "</h1>";
			}
		}
		return "<h1> That user is not in the list! </h1>";	
	}
	
	@RequestMapping( value = "/{identifier}", method = RequestMethod.GET )
	public String getUserByIdPath( @PathVariable( "identifier" ) int identifier ) {
		for( int i = 0; i < userList.size(); i ++ ) {
			if( userList.get( i ).getIdentifier() == identifier ) {
				return "<h1>" + userList.get( i ).getFirstName() + " " + userList.get( i ).getLastName() +  "</h1>";
			}
		}
		return "<h1> That user is not in the list! </h1>";
	}

}
