package defpackage;

import android.content.Context;

/* renamed from: dld */
final class dld implements gik {
    private final /* synthetic */ dkv a;

    public final void a(gil gil) {
        Object obj;
        Context a = xfa.a(this.a.e.a);
        ghm e = this.a.e();
        giv g = this.a.g();
        ggm f = this.a.f();
        giw j = this.a.j();
        dkv dkv = this.a;
        Object obj2 = dkv.c;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = dkv.c;
                if (obj instanceof baqe) {
                    obj = new gjq(xex.a(dkv.e.a), new zkw(), dkv.a);
                    dkv.c = bapx.a(dkv.c, obj);
                }
            }
            obj2 = obj;
        }
        gjq gjq = (gjq) obj2;
        dkv = this.a;
        obj = dkv.d;
        if (obj instanceof baqe) {
            Object obj3;
            synchronized (obj) {
                obj3 = dkv.d;
                if (obj3 instanceof baqe) {
                    obj3 = new gjg(xex.a(dkv.e.a), new zkw(), dkv.a);
                    dkv.d = bapx.a(dkv.d, obj3);
                }
            }
            obj = obj3;
        }
        gil.a = new gid(a, e, g, f, j, gjq, (gjg) obj, this.a.e.d(), this.a.i(), this.a.c(), this.a.h());
    }

    /* synthetic */ dld(dkv dkv) {
        this.a = dkv;
    }
}
