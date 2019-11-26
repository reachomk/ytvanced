package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ajfi */
public final class ajfi {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;
    public final bcaa g;
    public final bcaa h;
    public final bcaa i;
    public final bcaa j;
    public final bcaa k;
    public final bcaa l;
    public final bcaa m;
    private final bcaa n;

    public ajfi(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12, bcaa bcaa13, bcaa bcaa14) {
        this.a = (bcaa) ajfi.a(bcaa, 1);
        this.b = (bcaa) ajfi.a(bcaa2, 2);
        this.c = (bcaa) ajfi.a(bcaa3, 3);
        this.d = (bcaa) ajfi.a(bcaa4, 4);
        this.e = (bcaa) ajfi.a(bcaa5, 5);
        this.f = (bcaa) ajfi.a(bcaa6, 6);
        this.g = (bcaa) ajfi.a(bcaa7, 7);
        this.h = (bcaa) ajfi.a(bcaa8, 8);
        this.i = (bcaa) ajfi.a(bcaa9, 9);
        this.j = (bcaa) ajfi.a(bcaa10, 10);
        this.k = (bcaa) ajfi.a(bcaa11, 11);
        this.l = (bcaa) ajfi.a(bcaa12, 12);
        this.m = (bcaa) ajfi.a(bcaa13, 13);
        this.n = (bcaa) ajfi.a(bcaa14, 14);
    }

    public final ajfd a(aakj aakj, String str, int i) {
        return new ajfd((ScheduledExecutorService) ajfi.a((ScheduledExecutorService) this.a.get(), 1), (afqv) ajfi.a((afqv) this.b.get(), 2), (afmq) ajfi.a((afmq) this.c.get(), 3), (xsc) ajfi.a((xsc) this.d.get(), 4), (xhv) ajfi.a((xhv) this.e.get(), 5), (xrt) ajfi.a((xrt) this.f.get(), 6), (afmi) ajfi.a((afmi) this.g.get(), 7), (afti) ajfi.a((afti) this.h.get(), 8), (xpt) this.i.get(), (ahhq) ajfi.a((ahhq) this.j.get(), 10), (afpu) ajfi.a((afpu) this.k.get(), 11), (zzl) ajfi.a((zzl) this.l.get(), 12), (aiqf) ajfi.a((aiqf) this.m.get(), 13), (airt) ajfi.a((airt) this.n.get(), 14), (aakj) ajfi.a(aakj, 15), (String) ajfi.a(str, 16), i);
    }

    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
