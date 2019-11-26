package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ajix */
public enum ajix {
    UNKNOWN,
    OFF,
    ON;
    
    public static final Map c = null;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(awcy.UNKNOWN, UNKNOWN);
        hashMap.put(awcy.ON, ON);
        hashMap.put(awcy.OFF, OFF);
        hashMap.put(awcy.FORCED_ON, ON);
        c = Collections.unmodifiableMap(hashMap);
    }
}
