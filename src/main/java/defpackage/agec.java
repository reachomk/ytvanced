package defpackage;

import java.util.Collection;
import java.util.HashSet;

/* renamed from: agec */
public final class agec {
    private final agdz a;
    private final HashSet b;
    private volatile agqx c;
    private volatile int d;

    agec(agdz agdz, HashSet hashSet) {
        this.a = agdz;
        this.b = new HashSet(hashSet);
    }

    public final agqx a() {
        if (this.c == null) {
            this.c = new agqx(this.a.c(), c(), this.d);
        }
        return this.c;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(String str) {
        xvd.a(str);
        this.b.add(str);
        this.a.a(str);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(Collection collection) {
        for (String a : collection) {
            a(a);
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean a(agqz agqz) {
        amqw.a((Object) agqz);
        String b = agxj.b(agqz.f);
        if (!this.b.contains(b)) {
            return false;
        }
        if (!agqz.b()) {
            this.b.remove(b);
            if (this.b.isEmpty()) {
                this.a.a().clear();
            }
        }
        int c = this.a.c();
        if (c > 0) {
            int size = c - this.b.size();
            if (size == c) {
                this.d = 100;
            } else {
                size = (size * 100) / c;
                if (agqz.b()) {
                    size += agqz.a() / c;
                }
                if (size == 0) {
                    if (agqz.d > 0) {
                        size = 1;
                    }
                }
                this.d = Math.min(99, size);
            }
        }
        this.c = null;
        return true;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean b(agqz agqz) {
        boolean z;
        amqw.a((Object) agqz);
        String b = agxj.b(agqz.f);
        if (this.b.remove(b)) {
            this.a.b(b);
            this.c = null;
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b() {
        this.c = null;
    }

    private final synchronized int c() {
        return this.b.size();
    }
}
