package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aaqd */
public final class aaqd implements aaqc {
    public final ajtv a;
    private List b;

    public aaqd(ajtv ajtv) {
        this.a = (ajtv) amqw.a((Object) ajtv);
    }

    public final String a() {
        return this.a.b;
    }

    public final CharSequence b() {
        return ajqy.a(this.a.a);
    }

    public final boolean c() {
        return this.a.c;
    }

    public final String d() {
        return this.a.e;
    }

    public final CharSequence e() {
        return ajqy.a(this.a.d);
    }

    public final boolean f() {
        return this.a.f;
    }

    public final List a(aaas aaas) {
        if (this.b == null) {
            this.b = new ArrayList();
            for (arml a : this.a.l) {
                this.b.add(aabb.a(a, aaas, false));
            }
        }
        return this.b;
    }

    public final CharSequence g() {
        return ajqy.a(this.a.m);
    }

    public final boolean h() {
        return this.a.h != 0;
    }

    public final boolean i() {
        int a = apld.a(this.a.g.b);
        return a != 0 && a == 3;
    }

    public final aqyh j() {
        return this.a.k.a;
    }

    public final CharSequence a(int i) {
        i--;
        if (i == 0) {
            return ajqy.a(this.a.n);
        }
        if (i != 1) {
            return ajqy.a(this.a.p);
        }
        return ajqy.a(this.a.o);
    }
}
