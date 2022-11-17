import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    Server server;
    Guest guest;

    @BeforeEach
    public void setUp(){
        server = new Server();
        guest = new Guest("Sayaka", 10, 2, 2, true, '$');
    }

//     TODO: test that guest can only get served if over 18
        @Test
            public void canServeGuestOver18() {
                guest.setAge(18);
                boolean result = server.canServeGuest(guest);
                assertThat(result).isEqualTo(true);

}

//    @Test
//    public void cantServeGuest() {
//        guest.setAge(10);
//        boolean result = server.canServeGuest(guest);
//        assertThat(result).isEqualTo(false);
//
//    }



    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)



        @Test
        public void hasEnoughMoney(){
            guest.setWallet(500);
            boolean result = server.canServeGuest(guest);
            assertThat(result).isEqualTo(true);
         }
//        @Test
//        public void hasNoMoney(){
//            guest.setWallet(0);
//            boolean result = server.canServeGuest(guest);
//            assertThat(result).isEqualTo(false);
//
//        }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

        @Test
        public void isSoberEnough() {
            guest.setSobriety(10);
            boolean result = server.canServeGuest(guest);
            assertThat(result).isEqualTo(true);
        }
    // TODO: test that guest can only get served if guest is not banned from the pub
        @Test
        public void isNotBanned() {
            guest.setNotBanned(true);
            boolean result = server.canServeGuest(guest);
            assertThat(result).isEqualTo(true);
        }



    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}
