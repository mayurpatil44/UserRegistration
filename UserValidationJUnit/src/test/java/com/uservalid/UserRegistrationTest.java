package com.uservalid;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnValid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateFirstAndLastName("Mayur");
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenFirstName_WhenInproper_ShouldReturnInvalid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateFirstAndLastName("mayur");
        Assert.assertEquals("Invalid",result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnValid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateFirstAndLastName("Patil");
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenLastName_WhenInproper_ShouldReturnInvalid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateFirstAndLastName("patil");
        Assert.assertEquals("Invalid",result);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnValid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateEmail("abc@yahoo.com");
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenEmail_WhenInproper_ShouldReturnInvalid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateEmail("abc@%*.com");
        Assert.assertEquals("Invalid",result);
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnValid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateMobileNumber("91 7620107982");
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenMobileNumber_WhenInproper_ShouldReturnInvalid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateMobileNumber("9176201079");
        Assert.assertEquals("Invalid",result);
    }
    @Test
    public void givenPasswordStartWithEightCharacter_WhenProper_ShouldReturnValid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateEightCharacterPassword("Pythonnn");
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenPasswordStartWithEightCharacter_WhenInproper_ShouldReturnInvalid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateEightCharacterPassword("pythonnn3452");
        Assert.assertEquals("Invalid",result);
    }
    @Test
    public void givenPasswordContainsAtLeastOneUppperCaseCharacter_WhenProper_ShouldReturnValid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validatePasswordWithAtLeastOneCapitalLetter("PythonJava");
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenPasswordContainsAtLeastOneUppperCaseCharacter_WhenInproper_ShouldReturnInvalid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validatePasswordWithAtLeastOneCapitalLetter("hardworkpayoff");
        Assert.assertEquals("Invalid",result);
    }
    @Test
    public void givenPasswordContainsAtLeastOneNumericCharacter_WhenProper_ShouldReturnValid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validatePasswordWithAtLeastOneNumericNumber("BestWishes786");
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenPasswordContainsAtLeastOneNumericCharacter_WhenInproper_ShouldReturnInvalid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validatePasswordWithAtLeastOneNumericNumber("pythonbetterthanjava");
        Assert.assertEquals("Invalid",result);
    }
    @Test
    public void givenPasswordContainsExactlyOneSpecialCharacter_WhenProper_ShouldReturnValid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validatePasswordWithAtLeastOneSpecialCharacter("PythonJava@93");
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenPasswordContainsExactlyOneSpecialCharacter_WhenInproper_ShouldReturnInvalid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validatePasswordWithAtLeastOneSpecialCharacter("@#Python@java");
        Assert.assertEquals("Invalid",result);
    }
}
