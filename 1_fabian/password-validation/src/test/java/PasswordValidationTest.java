import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidationTest {

  @Test
  @DisplayName("validate should return true when password is valid")
  public void checkValidPassword(){
    //GIVEN
    String password = "s23f$f2a";

    //WHEN
    boolean validate = PasswordValidation.validate(password);

    //THEN
    assertTrue(validate);
  }

  @Test
  @DisplayName("When Password length is smaller than 8 the password should be invalid")
  public void checkPasswordMinLength(){
    //GIVEN
    String password = "s23f$f2";

    //WHEN
    boolean validate = PasswordValidation.validate(password);

    //THEN
    assertFalse(validate);
  }

  @Test
  @DisplayName("When Password contains no numbers the password should be invalid")
  public void checkPasswordNumbers(){
    //GIVEN
    String password = "sadf$frt";

    //WHEN
    boolean validate = PasswordValidation.validate(password);

    //THEN
    assertFalse(validate);
  }

  @Test
  @DisplayName("When Password contains no lower case character the password should be invalid")
  public void checkPasswordLowerCase(){
    //GIVEN
    String password = "SA3F$FRT";

    //WHEN
    boolean validate = PasswordValidation.validate(password);

    //THEN
    assertFalse(validate);
  }

}
