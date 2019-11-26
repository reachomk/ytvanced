package defpackage;

/* renamed from: kcr */
final class kcr extends jxa {
    kcr(kcp kcp) {
        super(kcp.a, kcp.b, kcp.c, kcp.e, kcp.f, kcp.g, kcp.h);
    }

    public final /* bridge */ /* synthetic */ byte[] k(Object obj) {
        return ((ajvw) obj).h;
    }

    public final /* bridge */ /* synthetic */ auvr j(Object obj) {
        return ((ajvw) obj).i;
    }

    public final /* bridge */ /* synthetic */ apdh[] i(Object obj) {
        return ((ajvw) obj).g;
    }

    public final /* bridge */ /* synthetic */ aygk h(Object obj) {
        return ((ajvw) obj).a;
    }

    public final /* synthetic */ CharSequence g(Object obj) {
        return ajqy.a(((ajvw) obj).j);
    }

    public final /* synthetic */ CharSequence f(Object obj) {
        return ajqy.a(((ajvw) obj).b);
    }

    public final /* synthetic */ CharSequence e(Object obj) {
        return ajqy.a(((ajvw) obj).k);
    }

    public final /* synthetic */ CharSequence d(Object obj) {
        return ajqy.a(((ajvw) obj).c);
    }

    public final /* synthetic */ CharSequence c(Object obj) {
        return ajqy.a(((ajvw) obj).e);
    }

    public final /* synthetic */ void a(Object obj, axwa axwa) {
        ajvw ajvw = (ajvw) obj;
        arrs arrs = ajvw.f;
        if (arrs != null) {
            arrv arrv = (arrv) ((anxo) arrs.toBuilder());
            arrv.copyOnWrite();
            arrs arrs2 = (arrs) arrv.instance;
            if (axwa != null) {
                arrs2.b = axwa;
                arrs2.a = 55419609;
                ajvw.f = (arrs) ((anxl) arrv.build());
                return;
            }
            throw new NullPointerException();
        }
    }

    public final /* bridge */ /* synthetic */ axwa b(Object obj) {
        arrs arrs = ((ajvw) obj).f;
        return (arrs == null || arrs.a != 55419609) ? null : (axwa) arrs.b;
    }

    public final /* bridge */ /* synthetic */ apxu a(Object obj) {
        return ((ajvw) obj).d;
    }
}
