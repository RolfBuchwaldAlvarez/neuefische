package de.neuefische.controlflow.utils;

import de.neuefische.controlflow.utils.MathUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @Test
    public void forValue1FacultyShouldBe1() {
        int value = 1;
        int result = MathUtil.calculateFaculty(value);
        assertEquals(1, result);
    }

    @Test
    public void forValue2FacultyShouldBe2() {
        int value = 2;
        int result = MathUtil.calculateFaculty(value);
        assertEquals(2, result);
    }

    @Test
    public void forValue3FacultyShouldBe6() {
    int value = 3;
    int result = MathUtil.calculateFaculty(value);
    assertEquals(6, result);
    }

    @Test
    public void forValue5FacultyShouldBe120() {
        int value = 5;
        int result = MathUtil.calculateFaculty(value);
        assertEquals(120, result);
    }

}