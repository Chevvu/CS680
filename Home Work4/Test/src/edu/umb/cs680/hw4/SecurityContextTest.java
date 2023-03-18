package edu.umb.cs680.hw4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecurityContextTest {
    @Test
    public void SecurityContext() {
        SecurityContext gen = new SecurityContext(new EncryptedString("s"));
        gen.login(new EncryptedString("s"));
        assertTrue(gen.getWrittenState() instanceof LoggedIn);

    }

    @Test
    public void SecurityContext1() {
        SecurityContext gen = new SecurityContext(new EncryptedString("s"));
        gen.logout();
        assertTrue(gen.getWrittenState() instanceof LoggedOut);

    }
}