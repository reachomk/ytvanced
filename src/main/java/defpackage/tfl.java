package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: tfl */
public final class tfl {
    private static final Map a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(RuntimeException.class, tfk.a);
        a.put(Error.class, tfn.a);
        a.put(Exception.class, tfm.a);
        a.put(Throwable.class, tfp.a);
        a.put(ExecutionException.class, tfo.a);
        a.put(IllegalStateException.class, tfr.a);
        a.put(IllegalArgumentException.class, tfq.a);
    }
}
