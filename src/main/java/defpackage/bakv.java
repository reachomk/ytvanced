package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bakv */
public abstract class bakv implements baky {
    public final String a;
    public final List b = new ArrayList();
    public Map c = new HashMap();

    public bakv(String str) {
        this.a = str;
    }

    public List a() {
        throw null;
    }

    public long[] b() {
        throw null;
    }

    public List c() {
        throw null;
    }

    public cjx d() {
        throw null;
    }

    public final long e() {
        long j = 0;
        for (long j2 : i()) {
            j += j2;
        }
        return j;
    }

    public final List f() {
        return this.b;
    }

    public final Map g() {
        return this.c;
    }
}
