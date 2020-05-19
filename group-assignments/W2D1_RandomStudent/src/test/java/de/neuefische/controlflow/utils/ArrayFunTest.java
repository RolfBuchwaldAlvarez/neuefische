package de.neuefische.controlflow.utils;

import de.neuefische.controlflow.utils.ArrayFun;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFunTest {

    @Test
    public void createStudentsArraySize14() {
        int value = 14;
        String[] result = ArrayFun.createStudentsArray(value);
        assertEquals("de.neuefische.controlflow.model.Student 14", result[13]);
        assertEquals(14, result.length);
    }

}