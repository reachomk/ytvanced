package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: afrb */
public final class afrb {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;
    private final bcaa i;
    private final bcaa j;

    public afrb(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10) {
        this.a = (bcaa) afrb.a(bcaa, 1);
        this.b = (bcaa) afrb.a(bcaa2, 2);
        this.c = (bcaa) afrb.a(bcaa3, 3);
        this.d = (bcaa) afrb.a(bcaa4, 4);
        this.e = (bcaa) afrb.a(bcaa5, 5);
        this.f = (bcaa) afrb.a(bcaa6, 6);
        this.g = (bcaa) afrb.a(bcaa7, 7);
        this.h = (bcaa) afrb.a(bcaa8, 8);
        this.i = (bcaa) afrb.a(bcaa9, 9);
        this.j = (bcaa) afrb.a(bcaa10, 10);
    }

    public final afqv a(List list) {
        return new afqv((afpu) afrb.a((afpu) this.a.get(), 1), (List) afrb.a(list, 2), (xhf) afrb.a((xhf) this.b.get(), 3), (afre) afrb.a((afre) this.c.get(), 4), (xsc) afrb.a((xsc) this.d.get(), 5), (xhv) afrb.a((xhv) this.e.get(), 6), (afmr) afrb.a((afmr) this.f.get(), 7), (Executor) afrb.a((Executor) this.g.get(), 8), (Executor) afrb.a((Executor) this.h.get(), 9), (afmj) afrb.a((afmj) this.i.get(), 10), (afrd) afrb.a((afrd) this.j.get(), 11));
    }

    private static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
