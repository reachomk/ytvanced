package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aetc */
final class aetc implements aetl {
    private final asmc a;
    private final List b;
    private final Map c;

    public aetc(asmc asmc) {
        this.a = (asmc) amqw.a((Object) asmc);
        if (asmc.g.size() != 0) {
            this.b = new ArrayList();
            this.c = new HashMap();
            for (asly asly : asmc.g) {
                List list = this.b;
                int a = argj.a(asly.b);
                if (a == 0) {
                    a = 1;
                }
                list.add(Integer.valueOf(a - 1));
                Map map = this.c;
                String a2 = aerr.a(asly.c.d());
                int a3 = argj.a(asly.b);
                if (a3 == 0) {
                    a3 = 1;
                }
                map.put(a2, Integer.valueOf(a3 - 1));
            }
            return;
        }
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
    }

    public final String toString() {
        return "";
    }

    public final byte[] a() {
        return this.a.f.d();
    }

    public final List b() {
        return this.b;
    }

    public final boolean c() {
        int a = argl.a(this.a.c);
        return a != 0 && a == 2;
    }

    public final Map d() {
        return this.c;
    }

    public final boolean e() {
        amqw.b(c() ^ 1);
        return this.a.e;
    }

    public final String f() {
        return this.a.d;
    }
}
