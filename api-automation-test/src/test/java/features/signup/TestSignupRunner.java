package features.signup;

import com.intuit.karate.junit5.Karate;
class TestSignupRunner {

    @Karate.Test
    Karate testSignup(){return Karate.run("signup").relativeTo(getClass());}
}
