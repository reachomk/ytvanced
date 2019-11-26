package defpackage;

import android.content.Context;

/* renamed from: aetk */
public final class aetk {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;

    public aetk(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8) {
        this.a = (bcaa) aetk.a(bcaa, 1);
        this.b = (bcaa) aetk.a(bcaa2, 2);
        this.c = (bcaa) aetk.a(bcaa3, 3);
        this.d = (bcaa) aetk.a(bcaa4, 4);
        this.e = (bcaa) aetk.a(bcaa5, 5);
        this.f = (bcaa) aetk.a(bcaa6, 6);
        this.g = (bcaa) aetk.a(bcaa7, 7);
        this.h = (bcaa) aetk.a(bcaa8, 8);
    }

    public final aetb a(afsa... afsaArr) {
        return new aetb((afpu) aetk.a((afpu) this.a.get(), 1), (afmi) aetk.a((afmi) this.b.get(), 2), (aamd) aetk.a((aamd) this.c.get(), 3), (aamf) aetk.a((aamf) this.d.get(), 4), (xhf) aetk.a((xhf) this.e.get(), 5), (Context) aetk.a((Context) this.f.get(), 6), (afqa) this.g.get(), (xua) aetk.a((xua) this.h.get(), 8), (afsa[]) aetk.a(afsaArr, 9));
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
