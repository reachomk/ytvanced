package defpackage;

import android.content.Context;

/* renamed from: dms */
final class dms implements gik {
    private final /* synthetic */ dmk a;

    public final void a(gil gil) {
        Object obj;
        Context a = xfa.a(this.a.d.a);
        ghm e = this.a.e();
        giv g = this.a.g();
        ggm f = this.a.f();
        giw j = this.a.j();
        dmk dmk = this.a;
        Object obj2 = dmk.b;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = dmk.b;
                if (obj instanceof baqe) {
                    obj = new gjq(xex.a(dmk.d.a), new zkw(), dmk.a);
                    dmk.b = bapx.a(dmk.b, obj);
                }
            }
            obj2 = obj;
        }
        gjq gjq = (gjq) obj2;
        dmk = this.a;
        obj = dmk.c;
        if (obj instanceof baqe) {
            Object obj3;
            synchronized (obj) {
                obj3 = dmk.c;
                if (obj3 instanceof baqe) {
                    obj3 = new gjg(xex.a(dmk.d.a), new zkw(), dmk.a);
                    dmk.c = bapx.a(dmk.c, obj3);
                }
            }
            obj = obj3;
        }
        gil.a = new gid(a, e, g, f, j, gjq, (gjg) obj, this.a.d.p(), this.a.i(), this.a.c(), this.a.h());
    }

    /* synthetic */ dms(dmk dmk) {
        this.a = dmk;
    }
}
