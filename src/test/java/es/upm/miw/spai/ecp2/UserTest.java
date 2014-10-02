package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User user;

    @Before
    public void before() {
        this.user = new User(10, "Charles", "Carmichael");
    }

    @Test
    public void testUser() {
        assertEquals(10, this.user.getNumber());
        assertEquals("Charles", this.user.getName());
        assertEquals("Carmichael", this.user.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Charles Carmichael", this.user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("C.", this.user.initials());
    }

    @Test
    public void testFullNameCaps() {
        assertEquals("CHARLES CARMICHAEL", this.user.fullNameCaps());
    }

}
