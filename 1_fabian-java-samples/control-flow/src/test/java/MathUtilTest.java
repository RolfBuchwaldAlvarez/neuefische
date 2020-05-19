import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

  @Test
  public void faculty0() {
    //GIVEN
    int value = 0;

    //WHEN
    int result = MathUtil.faculty(value);

    //THEN
    assertEquals(1, result);
  }

  @Test
  public void faculty1() {
    //GIVEN
    int value = 1;

    //WHEN
    int result = MathUtil.faculty(value);

    //THEN
    assertEquals(1, result);
  }

  @Test
  public void faculty3() {
    //GIVEN
    int value = 3;

    //WHEN
    int result = MathUtil.faculty(value);

    //THEN
    assertEquals(6, result);
  }

}
