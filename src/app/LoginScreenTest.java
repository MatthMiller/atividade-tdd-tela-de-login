package app;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoginScreenTest { 
	@Test
	public void testSuccessfulLogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertTrue(loginScreen.realizarLogin("john1","password123"));
	}
	
	@Test
	public void testFailedLogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertFalse(loginScreen.realizarLogin("john","wrongpassword"));
	}
	
	@Test
	public void testAddUser() {
		LoginScreen loginScreen = new LoginScreen();
		loginScreen.adicionarUsuario("testuser","testpassword");
		assertTrue(loginScreen.realizarLogin("testuser","testpassword"));
	}
}