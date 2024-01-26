package org.example;

import java.util.Arrays;
import java.util.List;

public class NetworkEndpoint {

    public String FindNetworkEndpoint(String startNodeId, String[] fromIds, String[] toIds) {
        int pos = findPosition(startNodeId, fromIds);
        if (pos < 0) {
            return startNodeId;
        }
        int size = fromIds.length;
        String nextElement = toIds[pos];
        String[] fromSubarray = Arrays.copyOfRange(fromIds, pos-1, size);
        String[] toSubarray = Arrays.copyOfRange(toIds, pos-1, size);
        return FindNetworkEndpoint(nextElement, fromSubarray, toSubarray);


    }

    private int findPosition(String element, String[] array) {
        List<String> list = Arrays.asList(array);
        return list.indexOf(element);
    }
}
