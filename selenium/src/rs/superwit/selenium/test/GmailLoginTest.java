package rs.superwit.selenium.test;

import org.junit.jupiter.api.Test;
import rs.superwit.selenium.GmailLogin;

import static org.junit.jupiter.api.Assertions.*;

class GmailLoginTest {
    @Test
    void login(){
        GmailLogin gl = new GmailLogin();
        gl.login("test@gmail.com","testpassword");
    }
}