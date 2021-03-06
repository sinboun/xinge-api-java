package com.tencent.xinge.bean;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnvironmentTest {

    @Test
    public void testGetName() {
        ObjectMapper mapper = new ObjectMapper();
        String repoStr = null;
        try {
            repoStr = mapper.writeValueAsString(Environment.product);
            assertEquals("\"product\"", repoStr);

        } catch (Exception e) {
            fail();
        }
    }
}