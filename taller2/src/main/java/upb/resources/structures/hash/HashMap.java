package upb.resources.structures.hash;

import java.math.BigInteger;

public class HashMap {
    private Hash hash;

    public HashMap() {
        hash = new Hash();
    }

    public void put(int key, BigInteger value) {
        hash.put(key, value);
    }

    public BigInteger get(int key) {
        return hash.get(key);
    }
}