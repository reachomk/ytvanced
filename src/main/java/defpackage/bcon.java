package defpackage;

import java.util.Collection;
import java.util.Collections;

/* renamed from: bcon */
public final class bcon extends bcko {
    private final String a;
    private final Collection b;
    private final bckq c;
    private final int d;
    private final bclb e;
    private final bcjd f;

    public bcon(String str, Collection collection, bckq bckq, int i, bclb bclb, bcjd bcjd) {
        this.a = str;
        this.b = collection;
        this.c = bckq;
        this.d = i;
        this.e = bclb;
        this.f = bcjd;
    }

    public final String a() {
        return this.a;
    }

    public final Collection b() {
        Collection collection = this.b;
        return collection == null ? Collections.emptyList() : collection;
    }

    public final bckq c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final bclb e() {
        return this.e;
    }

    public final bcjd f() {
        return this.f;
    }
}
