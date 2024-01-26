package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NetworkEndpointTest {

    private NetworkEndpoint networkEndpoint;

    @BeforeEach
    public void setUp() {
        networkEndpoint = new NetworkEndpoint();
    }

    @Test
    public void shouldReturnFive() {
        String[] fromIds = new String[] {"1","7","3","4","2","6","9"};
        String[] toIds = new String[]{"3","3","4","6","6","9","5"};
        String endNodeId = networkEndpoint.FindNetworkEndpoint("7", fromIds, toIds);
        Assertions.assertEquals("5", endNodeId);

    }
}
