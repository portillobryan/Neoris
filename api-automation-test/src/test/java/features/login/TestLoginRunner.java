package features.login;

import com.intuit.karate.junit5.Karate;
class TestLoginRunner {

    @Karate.Test
    Karate testLogin(){return Karate.run("login").relativeTo(getClass());}
}
