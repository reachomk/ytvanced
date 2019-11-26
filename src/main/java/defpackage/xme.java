package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: xme */
public final class xme implements xcp {
    public static final Comparator a = xmd.a;
    public final Map b;
    public final Map c;
    public final Object d = new Object();
    private final Executor e;

    public xme(Map map, Executor executor) {
        this.b = (Map) amqw.a((Object) map);
        this.e = (Executor) amqw.a((Object) executor);
        this.c = new ConcurrentHashMap();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{xmi.class};
        } else if (i == 0) {
            this.e.execute(new xmg(this));
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
