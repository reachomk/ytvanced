package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: basq */
public final class basq {
    public static final basq a = new basq(new basl(), baso.a);
    public final ConcurrentMap b = new ConcurrentHashMap();

    private basq(basn... basnArr) {
        for (int i = 0; i < 2; i++) {
            basn basn = basnArr[i];
            this.b.put(basn.a(), basn);
        }
    }
}
