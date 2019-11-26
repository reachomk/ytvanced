package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* renamed from: xle */
public abstract class xle {
    private final bqk b;
    public final int c;
    public final String d;
    public final boolean e;
    public bqm f;
    public boolean g;
    public Collection h;
    public boolean i;
    public boolean j;

    public xle(int i, String str, bqk bqk) {
        this(i, str, bqk, false);
    }

    public abstract bqh a(bqd bqd);

    public bqn a(bqn bqn) {
        return bqn;
    }

    public abstract void a(Object obj);

    public byte[] a() {
        return null;
    }

    public String e() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public boolean j() {
        return false;
    }

    public xle(int i, String str, bqk bqk, boolean z) {
        this.f = new bqc();
        this.i = true;
        this.j = false;
        this.c = i;
        this.d = str;
        this.b = bqk;
        this.e = z;
    }

    public final xle b(Object obj) {
        amqw.a(obj, (Object) "annotation cannot be null");
        if (this.h == null) {
            this.h = new ArrayList();
        }
        this.h.add(obj);
        return this;
    }

    public final Object a(Class cls) {
        Collection collection = this.h;
        if (collection != null) {
            for (Object next : collection) {
                if (cls.isAssignableFrom(next.getClass())) {
                    return next;
                }
            }
        }
        return null;
    }

    public final void c(Object obj) {
        Collection collection = this.h;
        if (collection != null) {
            collection.remove(obj);
        }
    }

    public String f() {
        return this.d;
    }

    public String g() {
        return f();
    }

    public final void h() {
        this.g = true;
    }

    public Map c() {
        return Collections.emptyMap();
    }

    public bqi d() {
        return bqi.NORMAL;
    }

    public void b(bqn bqn) {
        bqk bqk = this.b;
        if (bqk != null) {
            bqk.a(bqn);
        }
    }

    public final void i() {
        this.j = true;
    }
}
