package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: abmv */
public final class abmv extends abnz {
    public String a;
    public String b;
    public Integer c;
    public Integer d;
    public List e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Boolean j;
    public Integer k;
    public Set l;
    public Integer m;
    public Integer n;
    public String o;
    public int p;

    public final abnz a(int i) {
        this.c = Integer.valueOf(i);
        return this;
    }

    public final abnz b(int i) {
        this.d = Integer.valueOf(i);
        return this;
    }

    public final abnz c(int i) {
        this.f = Integer.valueOf(i);
        return this;
    }

    public final abnz d(int i) {
        this.g = Integer.valueOf(i);
        return this;
    }

    public final abnz e(int i) {
        this.h = Integer.valueOf(i);
        return this;
    }

    public final abnz f(int i) {
        this.i = Integer.valueOf(i);
        return this;
    }

    public final abnz a(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    public final abnz g(int i) {
        this.k = Integer.valueOf(i);
        return this;
    }

    public final abnz a(Set set) {
        if (set != null) {
            this.l = set;
            return this;
        }
        throw new NullPointerException("Null inputMethods");
    }

    public final abnz h(int i) {
        this.m = Integer.valueOf(i);
        return this;
    }

    public final abnz i(int i) {
        this.n = Integer.valueOf(i);
        return this;
    }

    public final abnz j(int i) {
        if (i != 0) {
            this.p = i;
            return this;
        }
        throw new NullPointerException("Null searchMethod");
    }
}
