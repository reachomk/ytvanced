package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: chr */
public class chr {
    private final Map a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;

    public chr(long j) {
        this.b = j;
    }

    /* Access modifiers changed, original: protected */
    public int a(Object obj) {
        return 1;
    }

    /* Access modifiers changed, original: protected */
    public void a(Object obj, Object obj2) {
    }

    public final synchronized long b() {
        return this.b;
    }

    public final synchronized Object b(Object obj) {
        return this.a.get(obj);
    }

    public final synchronized Object b(Object obj, Object obj2) {
        long a = (long) a(obj2);
        if (a >= this.b) {
            a(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.c += a;
        }
        Object put = this.a.put(obj, obj2);
        if (put != null) {
            this.c -= (long) a(put);
            if (!put.equals(obj2)) {
                a(obj, put);
            }
        }
        a(this.b);
        return put;
    }

    public final synchronized Object c(Object obj) {
        obj = this.a.remove(obj);
        if (obj != null) {
            this.c -= (long) a(obj);
        }
        return obj;
    }

    public final void a() {
        a(0);
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void a(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Entry entry = (Entry) it.next();
            Object value = entry.getValue();
            this.c -= (long) a(value);
            Object key = entry.getKey();
            it.remove();
            a(key, value);
        }
    }
}
