package com.codingdojo;

import java.util.ArrayList;
import com.codingdojo.models.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@SpringBootApplication
@Controller
//@RequestMapping( "/users")
public class UsersProjectApplication {
	private static ArrayList<User> userList = new ArrayList<User>();
	
	public static void main(String[] args) {
		userList.add( new User( "Alfredo", "Salazar", 12345 ));
		userList.add( new User( "Julieta", "Sanchez", 98765 ));
		userList.add( new User( "Marcela", "Lopez", 24242 ));
		
		SpringApplication.run(UsersProjectApplication.class, args);
	}
	
	@RequestMapping( value = "/users", method = RequestMethod.GET )
	public String getUsers( Model model ) {
		
		model.addAttribute( "firstName", "Alfredo" );
		model.addAttribute( "userList", userList );
		
		return "index.jsp";
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
	
	@RequestMapping( value = "/newUser", method = RequestMethod.GET )
	public String newUser() {
		return "addUser.jsp";
	}
	
	@RequestMapping( value = "/addUser", method = RequestMethod.POST )
	public String addUser( @RequestParam( value = "userFirstName" ) String userFirstName, 
						   @RequestParam( value = "userLastName" ) String userLastName, 
						   @RequestParam( value = "userIdentifier" ) int userIdentifier,
						   RedirectAttributes redirectAttributes) {
		if( userFirstName.equals( "" ) ) {
			redirectAttributes.addFlashAttribute( "errorMessage", "Your first name needs to be provided" );
			return "redirect:/newUser";
		}
		else {
			userList.add( new User( userFirstName, userLastName, userIdentifier ));
			return "redirect:/users";
		}
	}
}









